package ch.ntb.inf.deep.runtime.mpc555;
import ch.ntb.inf.deep.unsafe.*;

/*changes:
 * 11.11.10	NTB/GRAU	creation
 */

public class Kernel implements Registers {
	
	public static final int MPIOSMDDR = 0;
	public static final int MPIOSMDR = 0;
	public static final int CextRomBase = 0;

	/** 
	 * @return system time in us
	 */
	public static long time() {
		long time = HWD.GETSPR(TBU) >> 32;
		time |= HWD.GETSPR(TBL);
		return time;
	}
	
	/** 
	 * blinks LED on MPIOSM pin 15, nTimes with approx. 100us high time and 100us low time, blocks for 1s
	 */
	public static void blink(int nTimes) {
		HWD.PUT2(MPIOSMDDR, HWD.GET2(MPIOSMDDR) | 0x8000);
		for (int i = 0; i < nTimes; i++) {
			HWD.PUT2(MPIOSMDR, HWD.GET2(MPIOSMDR) | 0x8000);
			for (int k = 0; k < 10000; k++);
			HWD.PUT2(MPIOSMDR, HWD.GET2(MPIOSMDR) & ~0x8000);
			for (int k = 0; k < 10000; k++);
		}
		for (int k = 0; k < (1000000 - nTimes * 10000); k++);
	}

	private static short FCS(int begin, int end) {
		return 0;
	}
	
	private static void boot() {
		HWD.PUT4(SIUMCR, 0x00040000);	// internal arb., no data show cycles, BDM operation, CS functions,
			// output FREEZE, no lock, use data & address bus, use as RSTCONF, no reserv. logic
		HWD.PUT4(PLPRCR, 0x00900000);	// MF = 9, 40MHz operation with 4MHz quarz
		int reg;
		do reg = HWD.GET4(PLPRCR); while ((reg & (1 << 16)) != 0);	// wait for PLL to lock 
		HWD.PUT4(UMCR, 0);	// enable IMB clock, no int. multiplexing, full speed
		HWD.PUTSPR(158, 0x800);	// take out of serialized mode
		HWD.PUTSPR(638, 0x800);	// enable internal flash
		// configure CS for external Flash
		HWD.PUT4(BR0, 0x01000003);	// chip select base address reg external Flash,
		// base address = 1000000H, 32 bit port, no write protect, WE activ, no burst accesses, valid 
		HWD.PUT4(OR0, 0x0ffc00020);	// address mask = 4MB, adress type mask = 0,
		// CS normal timing, CS and addr. same timing, 2 wait states
		// configure CS for external RAM 
		HWD.PUT4(BR1, 0x00800003); 	// chip select base address reg external RAM,
		// base address = 800000H, 32 bit port, no write protect, WE activ, no burst accesses, valid
		HWD.PUT4(OR1, 0x0ffe00020);		//address mask = 2MB, adress type mask = 0,
		// CS normal timing, CS and addr. same timing, 2 wait states
		HWD.PUT2(PDMCR, 0); 	// configure pads, slow slew rate, enable pull-ups 
		HWD.PUT4(SCCR, 0x081210300); 	// enable clock out and engineering clock, EECLK = 10MHz 
		HWD.PUT2(TBSCR, 1); 	// time base, no interrupts, stop time base while freeze, enable
		short reset = HWD.GET2(RSR);
		if ((reset & (1<<5 | 1<<15)) != 0) {	// boot from flash
/*			SYS.PUT4(SYPCR, pSYPCR);
			SYS.PUT4(DMBR, pDMBRRom);
			SYS.PUT4(DMOR, pDMOR);
			SYS.GET(sysTabAdrRom + stoSysTabSize, sysTabSize);
			SYS.MOVE(sysTabAdrRom, sysTabAdr, sysTabSize)*/
		}
		
//		SetFPSCR;

		int sysTabConstBlkOffset = HWD.GET4(sysTabBaseAddr) + 4;
		int modNr = 0;
		int state = 0;
		while (true) {
			// get addresses of classes from system table
			int constBlkBase = HWD.GET4(sysTabConstBlkOffset);
			if (constBlkBase == 0) break;
			
			// check integrity of constant block for each class
			int constBlkSize = HWD.GET4(constBlkBase);
			if (FCS(constBlkBase, constBlkBase + constBlkSize) != 0) while(true) blink(1);

			// check integrity of code block for each class
			int codeBase = HWD.GET4(constBlkBase + cblkCodeBaseOffset);
			int codeSize = HWD.GET4(constBlkBase + cblkCodeSizeOffset);
			if (FCS(codeBase, codeBase + codeSize) != 0) while(true) blink(2);

			// initialize class variables
			int varBase = HWD.GET4(constBlkBase + cblkVarBaseOffset);
			int varSize = HWD.GET4(constBlkBase + cblkVarSizeOffset);
			int begin = varBase;
			int end = varBase + varSize;
			while (begin < end) {HWD.PUT4(begin, 0); begin += 4;}
			
			// initialize classes
			if (modNr != 0) {	// skip kernel 
				int clinitAddr = HWD.GET4(constBlkBase + clbkClinitAddrOffset);
				HWD.PUTSPR(LR, clinitAddr);
				HWD.ASM("bclr always, 0");
			} else {	// kernel
				//scheduler := Loop (* kernel *);
			}
			state++; modNr++;
			sysTabConstBlkOffset += 4;
		}
	}
	
	static {
		boot();
		blink(4);
	}

}