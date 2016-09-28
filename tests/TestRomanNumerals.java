import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void testCheckRomanNumerals_null() {
		RomanNumerals romanNumerals = new RomanNumerals();
		assertNotNull(romanNumerals);
	}

	@Test
	public void testRomanNumeral_I_1(){
		RomanNumerals romanNumerals = new RomanNumerals();
		int result = romanNumerals.convertToInteger("I");
		assertEquals(1, result);
	}
}
