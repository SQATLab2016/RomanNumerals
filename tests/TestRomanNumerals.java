import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {
	//private RomanNumerals = new RomanNumerals();

	@Test
	public void number_1_Generated() throws RomanNumeralException {
		RomanNumerals numerals = new RomanNumerals();
		assertTrue(1 == numerals.convertToInteger("I"));
	}

}
