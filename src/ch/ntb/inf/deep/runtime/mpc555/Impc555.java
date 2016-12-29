package ch.ntb.inf.deep.runtime.mpc555;

import ch.ntb.inf.deep.runtime.ppc32.Ippc32;

// Auto generated file (2016-04-15 16:09:23)

public interface Impc555 extends Ippc32 {

	// System constants of CPU mpc555
	public static final int SRR1init = 0x3802;
	public static final int stackSize = 0x2000;
	public static final int sysTabBaseAddr = 0x4000;
	public static final int excpCodeSize = 0x4000;
	public static final int excpCodeBase = 0x0;
	public static final int CMFB_Size = 0x30000;
	public static final int CMFB_BaseAddr = 0x40000;
	public static final int CMFA_Size = 0x40000;
	public static final int CMFA_BaseAddr = 0x0;
	public static final int SRAMB_Size = 0x4000;
	public static final int SRAMB_BaseAddr = 0x3fc000;
	public static final int SRAMA_Size = 0x2800;
	public static final int SRAMA_BaseAddr = 0x3f9800;
	public static final int IMB = 0x0;

	// Specific registers of CPU mpc555
	public static final int SPR80 = 0x50;
	public static final int EIE = 0x50;
	public static final int SPR81 = 0x51;
	public static final int EID = 0x51;
	public static final int SPR82 = 0x52;
	public static final int NRI = 0x52;
	public static final int SPR144 = 0x90;
	public static final int CMPA = 0x90;
	public static final int SPR145 = 0x91;
	public static final int CMPB = 0x91;
	public static final int SPR146 = 0x92;
	public static final int CMPC = 0x92;
	public static final int SPR147 = 0x93;
	public static final int CMPD = 0x93;
	public static final int SPR148 = 0x94;
	public static final int ECR = 0x94;
	public static final int SPR149 = 0x95;
	public static final int DER = 0x95;
	public static final int SPR150 = 0x96;
	public static final int COUNTA = 0x96;
	public static final int SPR151 = 0x97;
	public static final int COUNTB = 0x97;
	public static final int SPR152 = 0x98;
	public static final int CMPE = 0x98;
	public static final int SPR153 = 0x99;
	public static final int CMPF = 0x99;
	public static final int SPR154 = 0x9a;
	public static final int CMPG = 0x9a;
	public static final int SPR155 = 0x9b;
	public static final int CMPH = 0x9b;
	public static final int SPR156 = 0x9c;
	public static final int LCTRL1 = 0x9c;
	public static final int SPR157 = 0x9d;
	public static final int LCTRL2 = 0x9d;
	public static final int SPR158 = 0x9e;
	public static final int ICTRL = 0x9e;
	public static final int SPR159 = 0x9f;
	public static final int BAR = 0x9f;
	public static final int PVR = 0x11f;
	public static final int SPR528 = 0x210;
	public static final int MI_GRA = 0x210;
	public static final int SPR536 = 0x218;
	public static final int L2U_GRA = 0x218;
	public static final int SPR560 = 0x230;
	public static final int BBCMCR = 0x230;
	public static final int SPR568 = 0x238;
	public static final int L2U_MCR = 0x238;
	public static final int SPR630 = 0x276;
	public static final int DPDR = 0x276;
	public static final int SPR638 = 0x27e;
	public static final int IMMR = 0x27e;
	public static final int SPR784 = 0x310;
	public static final int MI_RBA0 = 0x310;
	public static final int SPR785 = 0x311;
	public static final int MI_RBA1 = 0x311;
	public static final int SPR786 = 0x312;
	public static final int MI_RBA2 = 0x312;
	public static final int SPR787 = 0x313;
	public static final int MI_RBA3 = 0x313;
	public static final int SPR792 = 0x318;
	public static final int L2U_RBA0 = 0x318;
	public static final int SPR793 = 0x319;
	public static final int L2U_RBA1 = 0x319;
	public static final int SPR794 = 0x31a;
	public static final int L2U_RBA2 = 0x31a;
	public static final int SPR795 = 0x31b;
	public static final int L2U_RBA3 = 0x31b;
	public static final int SPR816 = 0x330;
	public static final int MI_RA0 = 0x330;
	public static final int SPR817 = 0x331;
	public static final int MI_RA1 = 0x331;
	public static final int SPR818 = 0x332;
	public static final int MI_RA2 = 0x332;
	public static final int SPR819 = 0x333;
	public static final int MI_RA3 = 0x333;
	public static final int SPR824 = 0x338;
	public static final int L2U_RA0 = 0x338;
	public static final int SPR825 = 0x339;
	public static final int L2U_RA1 = 0x339;
	public static final int SPR826 = 0x33a;
	public static final int L2U_RA2 = 0x33a;
	public static final int SPR827 = 0x33b;
	public static final int L2U_RA3 = 0x33b;
	public static final int SPR1022 = 0x3fe;
	public static final int FPECR = 0x3fe;
	public static final int SIUMCR = 0x2fc000;
	public static final int SYPCR = 0x2fc004;
	public static final int SWSR = 0x2fc00e;
	public static final int SIPEND = 0x2fc010;
	public static final int SIMASK = 0x2fc014;
	public static final int SIEL = 0x2fc018;
	public static final int SIVEC = 0x2fc01c;
	public static final int TESR = 0x2fc020;
	public static final int SGPIODT1 = 0x2fc024;
	public static final int SGPIODT2 = 0x2fc028;
	public static final int SGPIOCR = 0x2fc02c;
	public static final int EMCR = 0x2fc030;
	public static final int PDMCR = 0x2fc03c;
	public static final int BR0 = 0x2fc100;
	public static final int OR0 = 0x2fc104;
	public static final int BR1 = 0x2fc108;
	public static final int OR1 = 0x2fc10c;
	public static final int BR2 = 0x2fc110;
	public static final int OR2 = 0x2fc114;
	public static final int BR3 = 0x2fc118;
	public static final int OR3 = 0x2fc11c;
	public static final int DMBR = 0x2fc140;
	public static final int DMOR = 0x2fc144;
	public static final int MSTAT = 0x2fc178;
	public static final int TBSCR = 0x2fc200;
	public static final int TBREF0 = 0x2fc204;
	public static final int TBREF1 = 0x2fc208;
	public static final int RTCSC = 0x2fc220;
	public static final int RTC = 0x2fc224;
	public static final int RTSEC = 0x2fc228;
	public static final int RTCAL = 0x2fc22c;
	public static final int PISCR = 0x2fc240;
	public static final int PITC = 0x2fc244;
	public static final int PITR = 0x2fc248;
	public static final int SCCR = 0x2fc280;
	public static final int PLPRCR = 0x2fc284;
	public static final int RSR = 0x2fc288;
	public static final int COLIR = 0x2fc28c;
	public static final int VSRMCR = 0x2fc290;
	public static final int TBSCRK = 0x2fc300;
	public static final int TBREF0K = 0x2fc304;
	public static final int TBREF1K = 0x2fc308;
	public static final int TBK = 0x2fc30c;
	public static final int RTCSCK = 0x2fc320;
	public static final int RTCK = 0x2fc324;
	public static final int RTSECK = 0x2fc328;
	public static final int RTCALK = 0x2fc32c;
	public static final int PISCRIK = 0x2fc340;
	public static final int PITCK = 0x2fc344;
	public static final int SCCRK = 0x2fc380;
	public static final int PLPRCRK = 0x2fc384;
	public static final int RSRK = 0x2fc388;
	public static final int CMFMCR_A = 0x2fc800;
	public static final int CMFTST_A = 0x2fc804;
	public static final int CMFCTL_A = 0x2fc808;
	public static final int CMFMCR_B = 0x2fc840;
	public static final int CMFTST_B = 0x2fc844;
	public static final int CMFCTL_B = 0x2fc848;
	public static final int DPTMCR = 0x300000;
	public static final int RAMBAR = 0x300004;
	public static final int MISRH = 0x300006;
	public static final int MISRL = 0x300008;
	public static final int MISCNT = 0x30000a;
	public static final int TPUMCR_A = 0x304000;
	public static final int DSCR_A = 0x304004;
	public static final int DSSR_A = 0x304006;
	public static final int TICR_A = 0x304008;
	public static final int CIER_A = 0x30400a;
	public static final int CFSR0_A = 0x30400c;
	public static final int CFSR1_A = 0x30400e;
	public static final int CFSR2_A = 0x304010;
	public static final int CFSR3_A = 0x304012;
	public static final int HSQR0_A = 0x304014;
	public static final int HSQR1_A = 0x304016;
	public static final int HSRR0_A = 0x304018;
	public static final int HSRR1_A = 0x30401a;
	public static final int CPR0_A = 0x30401c;
	public static final int CPR1_A = 0x30401e;
	public static final int CISR_A = 0x304020;
	public static final int TPUMCR2_A = 0x304028;
	public static final int TPUMCR3_A = 0x30402a;
	public static final int TPURAM0_A = 0x304100;
	public static final int TPURAM1_A = 0x304110;
	public static final int TPURAM2_A = 0x304120;
	public static final int TPURAM3_A = 0x304130;
	public static final int TPURAM4_A = 0x304140;
	public static final int TPURAM5_A = 0x304150;
	public static final int TPURAM6_A = 0x304160;
	public static final int TPURAM7_A = 0x304170;
	public static final int TPURAM8_A = 0x304180;
	public static final int TPURAM9_A = 0x304190;
	public static final int TPURAM10_A = 0x3041a0;
	public static final int TPURAM11_A = 0x3041b0;
	public static final int TPURAM12_A = 0x3041c0;
	public static final int TPURAM13_A = 0x3041d0;
	public static final int TPURAM14_A = 0x3041e0;
	public static final int TPURAM15_A = 0x3041f0;
	public static final int TPUMCR_B = 0x304400;
	public static final int DSCR_B = 0x304404;
	public static final int DSSR_B = 0x304406;
	public static final int TICR_B = 0x304408;
	public static final int CIER_B = 0x30440a;
	public static final int CFSR0_B = 0x30440c;
	public static final int CFSR1_B = 0x30440e;
	public static final int CFSR2_B = 0x304410;
	public static final int CFSR3_B = 0x304412;
	public static final int HSQR0_B = 0x304414;
	public static final int HSQR1_B = 0x304416;
	public static final int HSRR0_B = 0x304418;
	public static final int HSRR1_B = 0x30441a;
	public static final int CPR0_B = 0x30441c;
	public static final int CPR1_B = 0x30441e;
	public static final int CISR_B = 0x304420;
	public static final int TPUMCR2_B = 0x304428;
	public static final int TPUMCR3_B = 0x30442a;
	public static final int TPURAM0_B = 0x304500;
	public static final int TPURAM1_B = 0x304510;
	public static final int TPURAM2_B = 0x304520;
	public static final int TPURAM3_B = 0x304530;
	public static final int TPURAM4_B = 0x304540;
	public static final int TPURAM5_B = 0x304550;
	public static final int TPURAM6_B = 0x304560;
	public static final int TPURAM7_B = 0x304570;
	public static final int TPURAM8_B = 0x304580;
	public static final int TPURAM9_B = 0x304590;
	public static final int TPURAM10_B = 0x3045a0;
	public static final int TPURAM11_B = 0x3045b0;
	public static final int TPURAM12_B = 0x3045c0;
	public static final int TPURAM13_B = 0x3045d0;
	public static final int TPURAM14_B = 0x3045e0;
	public static final int TPURAM15_B = 0x3045f0;
	public static final int QADC64MCR_A = 0x304800;
	public static final int QADC64INT_A = 0x304804;
	public static final int PORTQA_A = 0x304806;
	public static final int PORTQB_A = 0x304807;
	public static final int DDRQA_A = 0x304808;
	public static final int QACR0_A = 0x30480a;
	public static final int QACR1_A = 0x30480c;
	public static final int QACR2_A = 0x30480e;
	public static final int QASR0_A = 0x304810;
	public static final int QASR1_A = 0x304812;
	public static final int CCW_A = 0x304a00;
	public static final int RJURR_A = 0x304a80;
	public static final int LJSRR_A = 0x304b00;
	public static final int LJURR_A = 0x304b80;
	public static final int QADC64MCR_B = 0x304c00;
	public static final int QADC64INT_B = 0x304c04;
	public static final int PORTQA_B = 0x304c06;
	public static final int PORTQB_B = 0x304c07;
	public static final int DDRQA_B = 0x304c08;
	public static final int QACR0_B = 0x304c0a;
	public static final int QACR1_B = 0x304c0c;
	public static final int QACR2_B = 0x304c0e;
	public static final int QASR0_B = 0x304c10;
	public static final int QASR1_B = 0x304c12;
	public static final int CCW_B = 0x304e00;
	public static final int RJURR_B = 0x304e80;
	public static final int LJSRR_B = 0x304f00;
	public static final int LJURR_B = 0x304f80;
	public static final int QSMCMMCR = 0x305000;
	public static final int QDSCI_IL = 0x305004;
	public static final int QSPI_IL = 0x305007;
	public static final int SCC1R0 = 0x305008;
	public static final int SCC1R1 = 0x30500a;
	public static final int SC1SR = 0x30500c;
	public static final int SC1DR = 0x30500e;
	public static final int PORTQS = 0x305014;
	public static final int PQSPAR = 0x305016;
	public static final int DDRQS = 0x305017;
	public static final int SPCR0 = 0x305018;
	public static final int SPCR1 = 0x30501a;
	public static final int SPCR2 = 0x30501c;
	public static final int SPCR3 = 0x30501e;
	public static final int SPSR = 0x30501f;
	public static final int SCC2R0 = 0x305020;
	public static final int SCC2R1 = 0x305022;
	public static final int SC2SR = 0x305024;
	public static final int SC2DR = 0x305026;
	public static final int QSCI1CR = 0x305028;
	public static final int QSCI1SR = 0x30502a;
	public static final int SCTQ = 0x30502c;
	public static final int SCRQ = 0x30504c;
	public static final int RECRAM = 0x305140;
	public static final int TRANRAM = 0x305180;
	public static final int COMDRAM = 0x3051c0;
	public static final int MPWMSM0PERR = 0x306000;
	public static final int MPWMSM0PULR = 0x306002;
	public static final int MPWMSM0CNTR = 0x306004;
	public static final int MPWMSM0SCR = 0x306006;
	public static final int MPWMSM1PERR = 0x306008;
	public static final int MPWMSM1PULR = 0x30600a;
	public static final int MPWMSM1CNTR = 0x30600c;
	public static final int MPWMSM1SCR = 0x30600e;
	public static final int MPWMSM2PERR = 0x306010;
	public static final int MPWMSM2PULR = 0x306012;
	public static final int MPWMSM2CNTR = 0x306014;
	public static final int MPWMSM2SCR = 0x306016;
	public static final int MPWMSM3PERR = 0x306018;
	public static final int MPWMSM3PULR = 0x30601a;
	public static final int MPWMSM3CNTR = 0x30601c;
	public static final int MPWMSM3SCR = 0x30601e;
	public static final int MMCSM6CNT = 0x306030;
	public static final int MMCSM6ML = 0x306032;
	public static final int MMCSM6SCRD = 0x306034;
	public static final int MMCSM6SCR = 0x306036;
	public static final int MDASM11AR = 0x306058;
	public static final int MDASM11BR = 0x30605a;
	public static final int MDASM11SCRD = 0x30605c;
	public static final int MDASM11SCR = 0x30605e;
	public static final int MDASM12AR = 0x306060;
	public static final int MDASM12BR = 0x306062;
	public static final int MDASM12SCRD = 0x306064;
	public static final int MDASM12SCR = 0x306066;
	public static final int MDASM13AR = 0x306068;
	public static final int MDASM13BR = 0x30606a;
	public static final int MDASM13SCRD = 0x30606c;
	public static final int MDASM13SCR = 0x30606e;
	public static final int MDASM14AR = 0x306070;
	public static final int MDASM14BR = 0x306072;
	public static final int MDASM14SCRD = 0x306074;
	public static final int MDASM14SCR = 0x306076;
	public static final int MDASM15AR = 0x306078;
	public static final int MDASM15BR = 0x30607a;
	public static final int MDASM15SCRD = 0x30607c;
	public static final int MDASM15SCR = 0x30607e;
	public static final int MPWMSM16PERR = 0x306080;
	public static final int MPWMSM16PULR = 0x306082;
	public static final int MPWMSM16CNTR = 0x306084;
	public static final int MPWMSM16SCR = 0x306086;
	public static final int MPWMSM17PERR = 0x306088;
	public static final int MPWMSM17PULR = 0x30608a;
	public static final int MPWMSM17CNTR = 0x30608c;
	public static final int MPWMSM17SCR = 0x30608e;
	public static final int MPWMSM18PERR = 0x306090;
	public static final int MPWMSM18PULR = 0x306092;
	public static final int MPWMSM18CNTR = 0x306094;
	public static final int MPWMSM18SCR = 0x306096;
	public static final int MPWMSM19PERR = 0x306098;
	public static final int MPWMSM19PULR = 0x30609a;
	public static final int MPWMSM19CNTR = 0x30609c;
	public static final int MPWMSM19SCR = 0x30609e;
	public static final int MMCSM22CNT = 0x3060b0;
	public static final int MMCSM22ML = 0x3060b2;
	public static final int MMCSM22SCRD = 0x3060b4;
	public static final int MMCSM22SCR = 0x3060b6;
	public static final int MDASM27AR = 0x3060d8;
	public static final int MDASM27BR = 0x3060da;
	public static final int MDASM27SCRD = 0x3060dc;
	public static final int MDASM27SCR = 0x3060de;
	public static final int MDASM28AR = 0x3060e0;
	public static final int MDASM28BR = 0x3060e2;
	public static final int MDASM28SCRD = 0x3060e4;
	public static final int MDASM28SCR = 0x3060e6;
	public static final int MDASM29AR = 0x3060e8;
	public static final int MDASM29BR = 0x3060ea;
	public static final int MDASM29SCRD = 0x3060ec;
	public static final int MDASM29SCR = 0x3060ee;
	public static final int MDASM30AR = 0x3060f0;
	public static final int MDASM30BR = 0x3060f2;
	public static final int MDASM30SCRD = 0x3060f4;
	public static final int MDASM30SCR = 0x3060f6;
	public static final int MDASM31AR = 0x3060f8;
	public static final int MDASM31BR = 0x3060fa;
	public static final int MDASM31SCRD = 0x3060fc;
	public static final int MDASM31SCR = 0x3060fe;
	public static final int MPIOSMDR = 0x306100;
	public static final int MPIOSMDDR = 0x306102;
	public static final int MIOS1TPCR = 0x306800;
	public static final int MIOS1VNR = 0x306804;
	public static final int MIOS1MCR = 0x306806;
	public static final int MCPSMSCR = 0x306816;
	public static final int MIOS1SR0 = 0x306c00;
	public static final int MIOS1ER0 = 0x306c04;
	public static final int MIOS1RPR0 = 0x306c06;
	public static final int MIOS1LVL0 = 0x306c30;
	public static final int MIOS1SR1 = 0x306c40;
	public static final int MIOS1ER1 = 0x306c44;
	public static final int MIOS1RPR1 = 0x306c46;
	public static final int MIOS1LVL1 = 0x306c70;
	public static final int UMCR = 0x307f80;
	public static final int UTSTCREG = 0x307f90;
	public static final int UIPEND = 0x307fa0;
	public static final int SRAMMCR_A = 0x380000;
	public static final int SRAMMCR_B = 0x380008;
}