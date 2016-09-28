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
		assertEquals(1, integer);
	}
	
	@Test
	public void testConvertToInteger_II_2() {
		int integer = mNumerals.convertToInteger("II");
		assertEquals(2, integer);
	}

	@Test
	public void testConvertToInteger_III_3() {
		int integer = mNumerals.convertToInteger("III");
		assertEquals(3, integer);
	}
	
	@Test
	public void testConvertToInteger_IV_4() {
		int integer = mNumerals.convertToInteger("IV");
		assertEquals(4, integer);
	}
	
	@Test
	public void testConvertToInteger_V_5() {
		int integer = mNumerals.convertToInteger("V");
		assertEquals(5, integer);
	}

	@Test
	public void testConvertToInteger_VI_6() {
		int integer = mNumerals.convertToInteger("VI");
		assertEquals(6, integer);
	}

}
