import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	RomanNumerals romanNumerals = new RomanNumerals();
	private void assertRomanNumerals(String roman, int expected) throws RomanNumeralsException {
		
		assertEquals(expected, romanNumerals.convertToInteger(roman));
	}
	@Test public void testRomanNumerals_I_1() throws RomanNumeralsException {
		assertRomanNumerals ("I", 1);
	}

	@Test public void testRomanNumerals_V_5() throws RomanNumeralsException {
		assertRomanNumerals ("V", 5);
	}
	
	@Test public void testRomanNumerals_X_10() throws RomanNumeralsException {
		assertRomanNumerals ("X", 10);
	}
	
	@Test public void testRomanNumerals_L_50() throws RomanNumeralsException {
		assertRomanNumerals ("L", 50);
	}
	
	@Test public void testRomanNumerals_C_100() throws RomanNumeralsException {
		assertRomanNumerals ("C", 100);
	}
	
	@Test public void testRomanNumerals_D_500() throws RomanNumeralsException {
		assertRomanNumerals ("D", 500);
	}
	
	@Test public void testRomanNumerals_M_1000() throws RomanNumeralsException {
		assertRomanNumerals ("M", 1000);
	}
	
	@Test public void testRomanNumerals_II_2() throws RomanNumeralsException {
		assertRomanNumerals ("II", 2);
	}
	
	@Test public void testRomanNumerals_IV_4() throws RomanNumeralsException {
		assertRomanNumerals("IV", 4);
	}
	
	@Test public void testRomanNumerals_IX_9() throws RomanNumeralsException {
		assertRomanNumerals("IX", 9);
	}
	
	@Test public void testRomanNumerals_LXXX_80() throws RomanNumeralsException {
		assertRomanNumerals("LXXX", 80);
	}
	
	@Test public void testRomanNumerals_MCMLXXXIV_1984() throws RomanNumeralsException {
		assertRomanNumerals("MCMLXXXIV", 1984);
	}
	
	@Test public void testRomanNumerals_MMXIV_2014() throws RomanNumeralsException {
		assertRomanNumerals("MMXIV", 2014);
	}
	
	@Test public void testRomanNumerals_DCCC_800() throws RomanNumeralsException {
		assertRomanNumerals("DCCC", 800);
	}
	
	@Test (expected = IndexOutOfBoundsException.class) public void testRomanNumerals_I_repeated_four_times_IIII_() throws RomanNumeralsException {
		assertRomanNumerals("IIII", 4);
	}
	
}
