import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void test_I_1() {
		RomanNumerals RNs = new RomanNumerals();
		int result = RomanNumerals.convertToInteger("I");
		assertEquals(1,result);
	}
	
	@Test
	public void test_II_2() {
		RomanNumerals RNs = new RomanNumerals();
		int result = RomanNumerals.convertToInteger("II");
		assertEquals(2,result);
	}
	@Test
	public void test_III_3() {
		RomanNumerals RNs = new RomanNumerals();
		int result = RomanNumerals.convertToInteger("III");
		assertEquals(3,result);
	}
	@Test
	public void test_IV_4() {
		RomanNumerals RNs = new RomanNumerals();
		int result = RomanNumerals.convertToInteger("IV");
		assertEquals(4,result);
	}
	@Test
	public void test_V_5() {
		RomanNumerals RNs = new RomanNumerals();
		int result = RomanNumerals.convertToInteger("V");
		assertEquals(5,result);
	}
	@Test
	public void test_VI_6() {
		RomanNumerals RNs = new RomanNumerals();
		int result = RomanNumerals.convertToInteger("VI");
		assertEquals(6,result);
	}
	@Test
	public void test_VII_7() {
		RomanNumerals RNs = new RomanNumerals();
		int result = RomanNumerals.convertToInteger("VII");
		assertEquals(7,result);
	}
	@Test
	public void test_VIII_8() {
		RomanNumerals RNs = new RomanNumerals();
		int result = RomanNumerals.convertToInteger("VIII");
		assertEquals(8,result);
	}
	@Test
	public void test_IX_9() {
		RomanNumerals RNs = new RomanNumerals();
		int result = RomanNumerals.convertToInteger("IX");
		assertEquals(9,result);
	}
	@Test
	public void test_X_10() {
		RomanNumerals RNs = new RomanNumerals();
		int result = RomanNumerals.convertToInteger("X");
		assertEquals(10,result);
	}
	@Test
	public void test_XI_11() {
		RomanNumerals RNs = new RomanNumerals();
		int result = RomanNumerals.convertToInteger("XI");
		assertEquals(11,result);
	}
	@Test
	public void test_XX_20() {
		RomanNumerals RNs = new RomanNumerals();
		int result = RomanNumerals.convertToInteger("XX");
		assertEquals(20,result);
	}
	@Test
	public void test_XXX_30() {
		RomanNumerals RNs = new RomanNumerals();
		int result = RomanNumerals.convertToInteger("XXX");
		assertEquals(30,result);
	}
	
	@Test
	public void test_XL_40() {
		RomanNumerals RNs = new RomanNumerals();
		int result = RomanNumerals.convertToInteger("XL");
		assertEquals(40,result);
	}
	
	@Test
	public void test_L_50() {
		RomanNumerals RNs = new RomanNumerals();
		int result = RomanNumerals.convertToInteger("L");
		assertEquals(50,result);
	}
	
	@Test
	public void test_LX_60() {
		RomanNumerals RNs = new RomanNumerals();
		int result = RomanNumerals.convertToInteger("LX");
		assertEquals(60,result);
	}
	
	@Test
	public void test_LXX_70() {
		RomanNumerals RNs = new RomanNumerals();
		int result = RomanNumerals.convertToInteger("LXX");
		assertEquals(70,result);
	}
	
	@Test
	public void test_LXXX_80() {
		RomanNumerals RNs = new RomanNumerals();
		int result = RomanNumerals.convertToInteger("LXXX");
		assertEquals(80,result);
	}
	
	@Test
	public void test_XC_90() {
		RomanNumerals RNs = new RomanNumerals();
		int result = RomanNumerals.convertToInteger("XC");
		assertEquals(90,result);
	}
	
	@Test
	public void test_C_100() {
		RomanNumerals RNs = new RomanNumerals();
		int result = RomanNumerals.convertToInteger("C");
		assertEquals(100,result);
	}
	
	@Test
	public void test_CC_200() {
		RomanNumerals RNs = new RomanNumerals();
		int result = RomanNumerals.convertToInteger("CC");
		assertEquals(200,result);
	}
	
	@Test
	public void test_CCC_300() {
		RomanNumerals RNs = new RomanNumerals();
		int result = RomanNumerals.convertToInteger("CCC");
		assertEquals(300,result);
	}
	
	@Test
	public void test_CD_400() {
		RomanNumerals RNs = new RomanNumerals();
		int result = RomanNumerals.convertToInteger("CD");
		assertEquals(400,result);
	}
	
	@Test
	public void test_D_500() {
		RomanNumerals RNs = new RomanNumerals();
		int result = RomanNumerals.convertToInteger("D");
		assertEquals(500,result);
	}
	
	@Test
	public void test_DC_600() {
		RomanNumerals RNs = new RomanNumerals();
		int result = RomanNumerals.convertToInteger("DC");
		assertEquals(600,result);
	}
	
	@Test
	public void test_DCC_700() {
		RomanNumerals RNs = new RomanNumerals();
		int result = RomanNumerals.convertToInteger("DCC");
		assertEquals(700,result);
	}
	
	@Test
	public void test_DCCC_800() {
		RomanNumerals RNs = new RomanNumerals();
		int result = RomanNumerals.convertToInteger("DCCC");
		assertEquals(800,result);
	}
	
	@Test
	public void test_CM_900() {
		RomanNumerals RNs = new RomanNumerals();
		int result = RomanNumerals.convertToInteger("CM");
		assertEquals(900,result);
	}
	
	@Test
	public void test_M_1000() {
		RomanNumerals RNs = new RomanNumerals();
		int result = RomanNumerals.convertToInteger("M");
		assertEquals(1000,result);
	}
	
	@Test
	public void test_MCMLXXXIV_1984() {
		RomanNumerals RNs = new RomanNumerals();
		int result = RomanNumerals.convertToInteger("MCMLXXXIV");
		assertEquals(1984,result);
	}
	
	@Test
	public void test_MMXIV_2014() {
		RomanNumerals RNs = new RomanNumerals();
		int result = RomanNumerals.convertToInteger("MMXIV");
		assertEquals(2014,result);
	}
}
