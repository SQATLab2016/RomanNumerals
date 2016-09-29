import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void test() {
		public void testConvertingI() {
			RomanNumerals rn = new RomanNumerals();
			int converted = rn.convertToInteger("I");
			assertEquals(1, converted);
	}

}
