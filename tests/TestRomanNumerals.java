import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void createObjectRomanNumerals() {
		RomanNumerals romanNumerals = new RomanNumerals();
		assertNotNull(romanNumerals);
	}
	
	@Test
	public void convertToIntegerReturnsZeroWithEmptyString() {
		RomanNumerals romanNumerals = new RomanNumerals();
		assertEquals("0", 0, romanNumerals.convertToInteger(""));
	}
	
	@Test
	public void convertI() {
		RomanNumerals romanNumerals = new RomanNumerals();
		assertEquals("1", 1, romanNumerals.convertToInteger("I"));
	}

	@Test
	public void convertX() {
		RomanNumerals romanNumerals = new RomanNumerals();
		assertEquals("10", 10, romanNumerals.convertToInteger("X"));
	}


	
	
	

}
