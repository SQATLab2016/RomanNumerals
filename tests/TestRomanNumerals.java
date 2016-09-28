import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestRomanNumerals {
	RomanNumerals mNumerals;
	
	@Before
	private void initialize() {
		mNumerals = new RomanNumerals();
	}
	
	@Test
	public void testConvertToInteger_I_1() {
		int integer = mNumerals.convertToInteger("I");
		assertEquals(1)
	}

}
