import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void testConvertingI() {
		RomanNumerals rn = new RomanNumerals();
		int converted = rn.convertToInteger("I");
		assertEquals(1, converted);
	}
	
	@Test
	public void testConverting1() {
		RomanNumerals rn = new RomanNumerals();
		boolean thrown = false;
		try {
			rn.convertToInteger("I");
		}
		catch(Exception e) {
			thrown = true;
		}
		assertEquals(true, thrown);
	}
}
