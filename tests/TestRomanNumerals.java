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
	
	@Test
	public void test_III_3() {
		int number = rn.convertToInteger("III");
		assertEquals(3, number);
	}
	
	@Test
	public void test_IV_4() {
		int number = rn.convertToInteger("IV");
		assertEquals(4, number);
	}

	@Test (expected = IllegalArgumentException.class)
	public void test_V_cannot_repeat() {
		int number = rn.convertToInteger("VV");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_I_cannot_repeat_four_times() {
		int number = rn.convertToInteger("IIII");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_I_cannot_be_subtracted_from_L() {
		int number = rn.convertToInteger("IL");
	}

}
