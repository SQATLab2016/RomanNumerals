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
		assertRomanValue(2, "II");
	}
	
	@Test
	public void test_ConvertToIntegerValueIII() {
		assertRomanValue(3, "III");
	}
	
	@Test
	public void test_ConvertToIntegerValueV() {
		assertRomanValue(5, "V");
	}
	
	@Test
	public void test_ConvertToIntegerValueIV() {
		assertRomanValue(4, "IV");
	}
	
	@Test
	public void test_ConvertToIntegerValueX() {
		assertRomanValue(10, "X");
	}

	private void assertRomanValue(int expected, String testValue) {
		int value = numerals.convertToInteger(testValue);
		assertEquals(expected, value);
	}

}
