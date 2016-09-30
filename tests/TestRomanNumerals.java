import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void test() {
		RomanNumerals roman = new RomanNumerals();
		int result = roman.convertToInteger("I");
		assertEquals(1, result);
	}

	
}
