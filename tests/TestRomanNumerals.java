import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {
	RomanNumerals converter = new RomanNumerals();

	@Test
	public void testConvertToInteger_MCMXCIV_1994() {
		int arabicNum = converter.convertToInteger("MCMXCIV");

		assertEquals(1994, arabicNum);
	}

}
