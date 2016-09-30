import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {
	
	RomanNumerals num = new RomanNumerals();
	
	@Test
	public void test_I_1() {
		int romanNum = RomanNumerals.convertToInteger("I");
		assertEquals(1,romanNum);
	}
	
	@Test
	public void test_II_2() {
		int romanNum = RomanNumerals.convertToInteger("II");
		assertEquals(2,romanNum);
	}
	
	@Test
	public void test_III_3() {
		int romanNum = RomanNumerals.convertToInteger("III");
		assertEquals(3,romanNum);
	}
	
	@Test
	public void test_IV_4() {
		int romanNum = RomanNumerals.convertToInteger("IV");
		assertEquals(4,romanNum);
	}
	
	@Test
	public void test_V_5() {
		int romanNum = RomanNumerals.convertToInteger("V");
		assertEquals(5,romanNum);
	}
	
	@Test
	public void test_VI_6() {
		int romanNum = RomanNumerals.convertToInteger("VI");
		assertEquals(6,romanNum);
	}
	
	@Test
	public void test_VII_7() {
		int romanNum = RomanNumerals.convertToInteger("VII");
		assertEquals(7,romanNum);
	}
	
	@Test
	public void test_VIII_8() {
		int romanNum = RomanNumerals.convertToInteger("VIII");
		assertEquals(8,romanNum);
	}
	
	@Test
	public void test_IX_9() {
		int romanNum = RomanNumerals.convertToInteger("IX");
		assertEquals(9,romanNum);
	}
	
	@Test
	public void test_X_10() {
		int romanNum = RomanNumerals.convertToInteger("X");
		assertEquals(10,romanNum);
	}
	
	@Test
	public void test_XX_20() {
		int romanNum = RomanNumerals.convertToInteger("XX");
		assertEquals(20,romanNum);
	}
	
	@Test
	public void test_XXX_30() {
		int romanNum = RomanNumerals.convertToInteger("XXX");
		assertEquals(30,romanNum);
	}
	
	@Test
	public void test_XL_40() {
		int romanNum = RomanNumerals.convertToInteger("XL");
		assertEquals(40,romanNum);
	}
	
	@Test
	public void test_L_50() {
		int romanNum = RomanNumerals.convertToInteger("L");
		assertEquals(50,romanNum);
	}
	
	@Test
	public void test_LX_60() {
		int romanNum = RomanNumerals.convertToInteger("LX");
		assertEquals(60,romanNum);
	}
	
	@Test
	public void test_LXX_70() {
		int romanNum = RomanNumerals.convertToInteger("LXX");
		assertEquals(70,romanNum);
	}
	
	@Test
	public void test_LXXX_80() {
		int romanNum = RomanNumerals.convertToInteger("LXXX");
		assertEquals(80,romanNum);
	}
	
	@Test
	public void test_XC_90() {
		int romanNum = RomanNumerals.convertToInteger("XC");
		assertEquals(90,romanNum);
	}
	
	@Test
	public void test_C_100() {
		int romanNum = RomanNumerals.convertToInteger("C");
		assertEquals(100,romanNum);
	}
	
	@Test
	public void test_CC_200() {
		int romanNum = RomanNumerals.convertToInteger("CC");
		assertEquals(200,romanNum);
	}
	
	@Test
	public void test_CCC_300() {
		int romanNum = RomanNumerals.convertToInteger("CCC");
		assertEquals(300,romanNum);
	}
	
	@Test
	public void test_CD_400() {
		int romanNum = RomanNumerals.convertToInteger("CD");
		assertEquals(400,romanNum);
	}
	
	@Test
	public void test_D_500() {
		int romanNum = RomanNumerals.convertToInteger("D");
		assertEquals(500,romanNum);
	}
	
	@Test
	public void test_DC_600() {
		int romanNum = RomanNumerals.convertToInteger("DC");
		assertEquals(600,romanNum);
	}
	
	@Test
	public void test_DCC_700() {
		int romanNum = RomanNumerals.convertToInteger("DCC");
		assertEquals(700,romanNum);
	}
	
	@Test
	public void test_DCCC_800() {
		int romanNum = RomanNumerals.convertToInteger("DCCC");
		assertEquals(800,romanNum);
	}
	
	@Test
	public void test_CM_900() {
		int romanNum = RomanNumerals.convertToInteger("CM");
		assertEquals(900,romanNum);
	}
	
	@Test
	public void test_M_1000() {
		int romanNum = RomanNumerals.convertToInteger("M");
		assertEquals(1000,romanNum);
	}
	
	@Test
	public void test_MCMLXXXIV_1984() {
		int romanNum = RomanNumerals.convertToInteger("MCMLXXXIV");
		assertEquals(1984,romanNum);
	}
	
	@Test
	public void test_MMXIV_2014() {
		int romanNum = RomanNumerals.convertToInteger("MMXIV");
		assertEquals(2014,romanNum);
	}

}
