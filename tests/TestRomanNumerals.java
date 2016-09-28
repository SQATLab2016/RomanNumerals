import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestRomanNumerals {
	RomanNumerals mNumerals;
	
	@Before
	public void initialize() {
		mNumerals = new RomanNumerals();
	}

	@Test
	public void testConvertToInteger_I_1() {
		int integer = mNumerals.convertToInteger("I");
		assertEquals(1, integer);
	}

	@Test
	public void testConvertToInteger_V_5() {
		int integer = mNumerals.convertToInteger("V");
		assertEquals(5, integer);
	}
	@Test
	public void testConvertToInteger_X_10() {
		int integer = mNumerals.convertToInteger("X");
		assertEquals(10, integer);
	}
	
	@Test
	public void testConvertToInteger_L_50() {
		int integer = mNumerals.convertToInteger("L");
		assertEquals(50, integer);
	}
	
	@Test
	public void testConvertToInteger_C_100() {
		int integer = mNumerals.convertToInteger("C");
		assertEquals(100, integer);
	}

	@Test
	public void testConvertToInteger_D_500() {
		int integer = mNumerals.convertToInteger("D");
		assertEquals(500, integer);
	}

	@Test
	public void testConvertToInteger_M_1000() {
		int integer = mNumerals.convertToInteger("M");
		assertEquals(1000, integer);
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
	public void testConvertToInteger_VII_7() {
		int integer = mNumerals.convertToInteger("VII");
		assertEquals(7, integer);
	}
}
