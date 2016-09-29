import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {
	
	RomanNumerals numerals = new RomanNumerals();

	@Test
	public void test_ConvertToIntegerValueI() {
		assertRomanValue(1, "I");
	}
	
	@Test
	public void test_ConvertToIntegerValueII() {
		assertRomanValue(2);
	}

	private void assertRomanValue(int expected, String actual) {
		int value = numerals.convertToInteger("II");
		assertEquals(expected, value);
	}

}
