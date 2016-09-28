import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestRomanNumerals {
	RomanNumerals mNumerals;
	
	@Before
	public void initialize() {
		mNumerals = new RomanNumerals();
	}

	@Test(expected=NumberFormatException.class)
	public void testConvertInteger_Throw_NumberFormatException() {
		mNumerals.convertToInteger("IO");
	}
	
	@Test(expected=NumberFormatException.class)
	public void testConvertInteger_ThreeX_Throw_NumberFormatException() {
		mNumerals.convertToInteger("XXX");
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
	public void testConvertToInteger_VI_6() {
		int integer = mNumerals.convertToInteger("VI");
		assertEquals(6, integer);
	}
	
	@Test
	public void testConvertToInteger_VII_7() {
		int integer = mNumerals.convertToInteger("VII");
		assertEquals(7, integer);
	}

	@Test
	public void testConvertToInteger_VIII_8() {
		int integer = mNumerals.convertToInteger("VIII");
		assertEquals(8, integer);
	}

	@Test
	public void testConvertToInteger_IX_9() {
		int integer = mNumerals.convertToInteger("IX");
		assertEquals(9, integer);
	}
	
	@Test
	public void testConvertToInteger_XX_20() {
		int integer = mNumerals.convertToInteger("XX");
		assertEquals(20, integer);
	}

	@Test
	public void testConvertToInteger_XXX_30() {
		int integer = mNumerals.convertToInteger("XXX");
		assertEquals(30, integer);
	}

	@Test
	public void testConvertToInteger_XL_40() {
		int integer = mNumerals.convertToInteger("XL");
		assertEquals(40, integer);
	}

	@Test
	public void testConvertToInteger_LX_60() {
		int integer = mNumerals.convertToInteger("LX");
		assertEquals(60, integer);
	}

	@Test
	public void testConvertToInteger_LXX_70() {
		int integer = mNumerals.convertToInteger("LXX");
		assertEquals(70, integer);
	}
	
	@Test
	public void testConvertToInteger_LXXX_80() {
		int integer = mNumerals.convertToInteger("LXXX");
		assertEquals(80, integer);
	}
	
	@Test
	public void testConvertToInteger_XC_90() {
		int integer = mNumerals.convertToInteger("XC");
		assertEquals(90, integer);
	}

	@Test
	public void testConvertToInteger_CC_200() {
		int integer = mNumerals.convertToInteger("CC");
		assertEquals(200, integer);
	}
	
	@Test
	public void testConvertToInteger_CCC_300() {
		int integer = mNumerals.convertToInteger("CCC");
		assertEquals(300, integer);
	}
	
	@Test
	public void testConvertToInteger_CD_400() {
		int integer = mNumerals.convertToInteger("CD");
		assertEquals(400, integer);
	}

	@Test
	public void testConvertToInteger_DC_600() {
		int integer = mNumerals.convertToInteger("DC");
		assertEquals(600, integer);
	}
	
	@Test
	public void testConvertToInteger_DCC_700() {
		int integer = mNumerals.convertToInteger("DCC");
		assertEquals(700, integer);
	}

	@Test
	public void testConvertToInteger_DCCC_800() {
		int integer = mNumerals.convertToInteger("DCCC");
		assertEquals(800, integer);
	}

	@Test
	public void testConvertToInteger_CM_900() {
		int integer = mNumerals.convertToInteger("CM");
		assertEquals(900, integer);
	}
	
	@Test
	public void testConvertToInteger_MCMLXXXIV_1984() {
		int integer = mNumerals.convertToInteger("MCMLXXXIV");
		assertEquals(1984, integer);
	}
	
	@Test
	public void testConvertToInteger_MMXIV_2014() {
		int integer = mNumerals.convertToInteger("MMXIV");
		assertEquals(2014, integer);
	}
}
