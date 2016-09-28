import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {
	RomanNumerals romanNumerals = new RomanNumerals();
	@Test
	public void testCheckRomanNumerals_null() {		
		assertNotNull(romanNumerals);
	}

	@Test
	public void testRomanNumeral_I_1(){
		RomanNumerals romanNumerals = new RomanNumerals();
		int result = romanNumerals.convertToInteger("I");
		assertEquals(1, result);
	}
	
	@Test
	public void testRomanNumeral_V_5(){
		RomanNumerals romanNumerals = new RomanNumerals();
		int result = romanNumerals.convertToInteger("V");
		assertEquals(5, result);
	}
}
