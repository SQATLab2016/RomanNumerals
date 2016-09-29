import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void test_ConvertToIntegerValueI() {
		RomanNumerals numerals = new RomanNumerals();
		int value = numerals.convertToInteger("I");
		assertEquals(1, value);
	}

}
