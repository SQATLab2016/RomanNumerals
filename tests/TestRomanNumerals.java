import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void createObjectRomanNumerals() {
		RomanNumerals romanNumerals = new RomanNumerals();
		assertNotNull(romanNumerals);
	}
	
	@Test
	public void convertToIntegerReturns() {
		RomanNumerals romanNumerals = new RomanNumerals();
		assertEquals("0", 0, romanNumerals.convertToInteger(""));
	}

	
	
	

}
