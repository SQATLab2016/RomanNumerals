import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {
	
	private RomanNumerals rn = new RomanNumerals();

	@Test public void testRomanNumerals_emptyString() {
		int num = rn.convertToInteger("");
		assertEquals(0, num);
	}
	
	@Test public void testRomanNumerals_I_1() {
		int num = rn.convertToInteger("I");
		assertEquals(1, num);
	}
	
	@Test public void testRomanNumerals_II_2() {
		int num = rn.convertToInteger("II");
		assertEquals(2, num);
	}
	
	@Test public void testRomanNumerals_III_3() {
		int num = rn.convertToInteger("III");
		assertEquals(3, num);
	}
	
	@Test public void testRomanNumerals_V_5() {
		int num = rn.convertToInteger("V");
		assertEquals(5, num);
	}
	
	@Test public void testRomanNumerals_IV_4() {
		int num = rn.convertToInteger("IV");
		assertEquals(4, num);
	}
	
	@Test public void testRomanNumerals_VI_6() {
		int num = rn.convertToInteger("VI");
		assertEquals(6, num);
	}
	
	@Test public void testRomanNumerals_X_10() {
		int num = rn.convertToInteger("X");
		assertEquals(10, num);
	}
	
	@Test public void testRomanNumerals_L_50() {
		int num = rn.convertToInteger("L");
		assertEquals(50, num);
	}
	
	@Test public void testRomanNumerals_C_100() {
		int num = rn.convertToInteger("C");
		assertEquals(100, num);
	}
	
	@Test public void testRomanNumerals_D_500() {
		int num = rn.convertToInteger("D");
		assertEquals(500, num);
	}
	
	@Test public void testRomanNumerals_M_1000() {
		int num = rn.convertToInteger("M");
		assertEquals(1000, num);
	}
	
	@Test public void testRomanNumerals_XX_20() {
		int num = rn.convertToInteger("XX");
		assertEquals(20, num);
	}
	
	@Test public void testRomanNumerals_XC_90() {
		int num = rn.convertToInteger("XC");
		assertEquals(90, num);
	}
	
	@Test public void testRomanNumerals_LXX_70() {
		int num = rn.convertToInteger("LXX");
		assertEquals(70, num);
	}
	
	@Test public void testRomanNumerals_CM_900() {
		int num = rn.convertToInteger("CM");
		assertEquals(900, num);
	}
	
	@Test public void testRomanNumerals_MCMLXXXIV_1984() {
		int num = rn.convertToInteger("MCMLXXXIV");
		assertEquals(1984, num);
	}
	
	@Test public void testRomanNumerals_MMXIV_2014() {
		int num = rn.convertToInteger("MMXIV");
		assertEquals(2014, num);
	}
	
	@Test public void testRomanNumerals_IIII_err() {
		int num = rn.convertToInteger("IIIIIIIIIIIII");
		assertEquals(4, num);
	}

}
