import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	RomanNumerals romanNumerals = new RomanNumerals();
	private void assertRomanNumerals(String roman, int expected) {
		
		assertEquals(expected, romanNumerals.convertToInteger(roman));
	}
	@Test public void testRomanNumerals_I_1() {
		assertRomanNumerals ("I", 1);
	}

	@Test public void testRomanNumerals_V_5() {
		assertRomanNumerals ("V", 5);
	}
	
	@Test public void testRomanNumerals_X_10() {
		assertRomanNumerals ("X", 10);
	}
	
	@Test public void testRomanNumerals_L_50() {
		assertRomanNumerals ("L", 50);
	}
	
	@Test public void testRomanNumerals_C_100() {
		assertRomanNumerals ("C", 100);
	}
	
	@Test public void testRomanNumerals_D_500() {
		assertRomanNumerals ("D", 500);
	}
	
	@Test public void testRomanNumerals_M_1000() {
		assertRomanNumerals ("M", 1000);
	}
	
	@Test public void testRomanNumerals_II_2() {
		assertRomanNumerals ("II", 2);
	}
	
	@Test public void testRomanNumerals_IV_4() {
		assertRomanNumerals("IV", 4);
	}
	
	@Test public void testRomanNumerals_IX_9() {
		assertRomanNumerals("IX", 9);
	}
	
	@Test public void testRomanNumerals_LXXX_80() {
		assertRomanNumerals("LXXX", 80);
	}
	
	@Test public void testRomanNumerals_MCMLXXXIV_1984() {
		assertRomanNumerals("MCMLXXXIV", 1984);
	}
	
	@Test public void testRomanNumerals_MMXIV_2014() {
		assertRomanNumerals("MMXIV", 2014);
	}
	
	@Test public void testRomanNumerals_DCCC_800() {
		assertRomanNumerals("DCCC", 800);
	}
	
	@Test (expected = IndexOutOfBoundsException.class) public void testRomanNumerals_I_repeated_four_times_IIII_() {
		assertRomanNumerals("IIII", 4);
	}
	
}
