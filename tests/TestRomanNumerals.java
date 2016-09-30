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
	
	@Test
	public void test_III() {
		RomanNumerals roman = new RomanNumerals();
		int result = roman.convertToInteger("III");
		assertEquals(3, result);
	}
	@Test
	public void test_IV() {
		RomanNumerals roman = new RomanNumerals();
		int result = roman.convertToInteger("IV");
		assertEquals(4, result);
	}
	
	

	@Test
	public void test_spike() {
		RomanNumerals roman = new RomanNumerals();
		String ii = "II";

		assertEquals("I", ii.substring(0, 1));
		assertEquals("I", ii.substring(1, 2));		
	}
	
	
}
