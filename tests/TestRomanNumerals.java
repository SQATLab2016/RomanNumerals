import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void test_I() {
		RomanNumerals roman = new RomanNumerals();
		int result = roman.convertToInteger("I");
		assertEquals(1, result);
	}
	@Test
	public void test_II() {
		RomanNumerals roman = new RomanNumerals();
		int result = roman.convertToInteger("II");
		assertEquals(2, result);
	}

	
	
}
