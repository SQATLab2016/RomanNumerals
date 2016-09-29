import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void test() {
		RomanNumerals rm = new RomanNumerals("I");
		assertNotNull(rm);
	}
	
	@Test
	public void testReturn() {
		RomanNumerals rm = new RomanNumerals("I");
		int number = rm.convertToInteger("I");
		assertEquals("I was not 1", 1, number);
	}

}
