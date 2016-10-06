import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {
	RomanNumerals converter = new RomanNumerals();

	@Test
	public void testConvertToInteger_MCMXCIV_1994() {
		int arabicNum = converter.convertToInteger("MCMXCIV");

		assertEquals(1994, arabicNum);
	}
	@Test
	public void testConvertToInteger_MCMLXXXIV_1984() {
		int arabicNum = converter.convertToInteger("MCMLXXXIV");

		assertEquals(1984, arabicNum);
	}
	@Test
	public void testConvertToInteger_MMXIV_2014() {
		int arabicNum = converter.convertToInteger("MMXIV");

		assertEquals(2014, arabicNum);
	}
	@Test
	public void testConvertToInteger_MCMXCIX_1999() {
		int arabicNum = converter.convertToInteger("MCMXCIX");

		assertEquals(1999, arabicNum);
	}
	@Test
	public void testConvertToInteger_XLVII_47() {
		int arabicNum = converter.convertToInteger("XLVII");

		assertEquals(47, arabicNum);
	}
	@Test
	public void testConvertToInteger_XXIV_24() {
		int arabicNum = converter.convertToInteger("XXIV");

		assertEquals(24, arabicNum);
	}
}
