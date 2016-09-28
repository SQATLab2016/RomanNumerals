import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {
	
	RomanNumerals rn = new RomanNumerals();

	@Test
	public void test_I_1() {
		int number = rn.convertToInteger("I");
		assertEquals(1, number);
	}
	
	@Test
	public void test_II_2() {
		int number = rn.convertToInteger("II");
		assertEquals(2, number);
	}

}
