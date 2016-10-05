import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {
	RomanNumerals romanNumerals = new RomanNumerals();

	@Test
	public void testCheckRomanNumerals_null() {
		assertNotNull(romanNumerals);
	}

	@Test
	public void testRomanNumeral_I_1() throws RomanNumeralException {
		assertRomanNumerals(1, "I");
	}

	@Test
	public void testRomanNumeral_V_5() throws RomanNumeralException {
		assertRomanNumerals(5, "V");
	}

	@Test
	public void testRomanNumeral_X_10() throws RomanNumeralException {
		assertRomanNumerals(10, "X");
	}

	@Test
	public void testRomanNumeral_L_50() throws RomanNumeralException {
		assertRomanNumerals(50, "L");
	}

	@Test
	public void testRomanNumeral_C_100() throws RomanNumeralException {
		assertRomanNumerals(100, "C");
	}

	@Test
	public void testRomanNumeral_D_500() throws RomanNumeralException {
		assertRomanNumerals(500, "D");
	}

	@Test
	public void testRomanNumeral_M_1000() throws RomanNumeralException {
		assertRomanNumerals(1000, "M");
	}

	@Test
	public void testRomanNumeral_IV_4() throws RomanNumeralException {
		assertRomanNumerals(4, "IV");
	}

	@Test
	public void testRomanNumeral_MCMLXXXIV_1984() throws RomanNumeralException {
		assertRomanNumerals(1984, "MCMLXXXIV");
	}

	@Test
	public void testRomanNumeral_MMXIV_2014() throws RomanNumeralException {
		assertRomanNumerals(1984, "MCMLXXXIV");
	}
	
	@Test (expected = RomanNumeralException.class)
	public void RomanNumeral_InvalidInputWith4M() throws RomanNumeralException {
		romanNumerals.convertToInteger("MMMM");
	}

	@Test (expected = RomanNumeralException.class)
	public void RomanNumeral_InvalidInputWith2V() throws RomanNumeralException {
		romanNumerals.convertToInteger("VV");
	}
	
	@Test (expected = RomanNumeralException.class)
	public void RomanNumeral_InvalidInputWithXXC() throws RomanNumeralException {
		romanNumerals.convertToInteger("XXC");
	}
	
	public void assertRomanNumerals(int expectedOutput, String input) throws RomanNumeralException {
		int result = romanNumerals.convertToInteger(input);
		assertEquals(expectedOutput, result);
	}

}
