import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {
	
	RomanNumerals numerals = new RomanNumerals();

	@Test
	public void test_ConvertToIntegerValueI() {
		int value = numerals.convertToInteger("I");
		assertEquals(1, value);
	}
	
	@Test
	public void test_ConvertToIntegerValueII() {
		assertRomanValue();
	}

	private void assertRomanValue() {
		int value = numerals.convertToInteger("II");
		assertEquals(2, value);
	}

}
