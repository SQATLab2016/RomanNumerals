import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void testConvertingI() {
		RomanNumerals rn = new RomanNumerals();
		try {
			int converted = rn.convertToInteger("I");
			assertEquals(1, converted);
		}
		catch(Exception e) {
		}
	}
	
	@Test
	public void testConverting1() {
		RomanNumerals rn = new RomanNumerals();
		boolean thrown = false;
		try {
			rn.convertToInteger("1");
		}
		catch(Exception e) {
			thrown = true;
		}
		assertEquals(true, thrown);
	}
	
	@Test
	public void testConvertingA() {
		RomanNumerals rn = new RomanNumerals();
		boolean thrown = false;
		try {
			rn.convertToInteger("A");
		}
		catch(Exception e) {
			thrown = true;
		}
		assertEquals(true, thrown);
	}
	
	@Test
	public void testConvertingII() {
		RomanNumerals rn = new RomanNumerals();
		int converted = 0;
		try {
			converted = rn.convertToInteger("II");
		}
		catch(Exception e) {
		}
		assertEquals(2, converted);
	}
}
