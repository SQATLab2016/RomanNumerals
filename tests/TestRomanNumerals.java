import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestRomanNumerals {
	
	RomanNumerals roman = new RomanNumerals();

	@Test
	public void test_convert_I_to_1() throws RomanNumeralsException {
		int i = roman.convertToInteger("I");
		assertEquals(1, i);
	}
	
	@Test
	public void test_convert_II_to_2() throws RomanNumeralsException {
		int i = roman.convertToInteger("II");
		assertEquals(2, i);
	}
	
	@Test
	public void test_convert_III_to_3() throws RomanNumeralsException {
		int i = roman.convertToInteger("III");
		assertEquals(3, i);
	}
	
	@Test
	public void test_convert_IV_to_4() throws RomanNumeralsException {
		int i = roman.convertToInteger("IV");
		assertEquals(4, i);
	}

	@Test
	public void test_convert_V_to_5() throws RomanNumeralsException {
		int i = roman.convertToInteger("V");
		assertEquals(5, i);
	}
	
	@Test
	public void test_convert_VI_to_6() throws RomanNumeralsException {
		int i = roman.convertToInteger("VI");
		assertEquals(6, i);
	}
	
	@Test
	public void test_convert_VII_to_7() throws RomanNumeralsException {
		int i = roman.convertToInteger("VII");
		assertEquals(7, i);
	}
	
	@Test
	public void test_convert_VIII_to_8() throws RomanNumeralsException {
		int i = roman.convertToInteger("VIII");
		assertEquals(8, i);
	}
	
	@Test
	public void test_convert_IX_to_9() throws RomanNumeralsException {
		int i = roman.convertToInteger("IX");
		assertEquals(9, i);
	}
	
	@Test
	public void test_convert_X_to_10() throws RomanNumeralsException {
		int i = roman.convertToInteger("X");
		assertEquals(10, i);
	}
	
	@Test
	public void test_convert_XX_to_20() throws RomanNumeralsException {
		int i = roman.convertToInteger("XX");
		assertEquals(20, i);
	}
	
	@Test
	public void test_convert_XL_to_40() throws RomanNumeralsException {
		int i = roman.convertToInteger("XL");
		assertEquals(40, i);
	}
	
	@Test
	public void test_convert_C_to_100() throws RomanNumeralsException {
		int i = roman.convertToInteger("C");
		assertEquals(100, i);
	}
	
	@Test
	public void test_convert_D_to_500() throws RomanNumeralsException {
		int i = roman.convertToInteger("D");
		assertEquals(500, i);
	}
	
	@Test
	public void test_convert_M_to_1000() throws RomanNumeralsException {
		int i = roman.convertToInteger("M");
		assertEquals(1000, i);
	}
	
	@Test
	public void test_convert_MCMLXXXIV_to_1984() throws RomanNumeralsException {
		int i = roman.convertToInteger("MCMLXXXIV");
		assertEquals(1984, i);
	}
	
	@Test
	public void test_convert_MMXIV_to_2014() throws RomanNumeralsException {
		int i = roman.convertToInteger("MMXIV");
		assertEquals(2014, i);
	}
	
	@Test(expected=RomanNumeralsException.class)
	public void test_convert_XXC_throws_exception() throws RomanNumeralsException {
		int i = roman.convertToInteger("XXC");
	}
	
	@Test(expected=RomanNumeralsException.class)
	public void test_convert_IIIIM_throws_exception() throws RomanNumeralsException {
		int i = roman.convertToInteger("IIIIM");
	}
	
	@Test(expected=RomanNumeralsException.class)
	public void test_convert_XXXXM_throws_exception() throws RomanNumeralsException {
		int i = roman.convertToInteger("XXXXM");
	}
	
	@Test(expected=RomanNumeralsException.class)
	public void test_convert_CCCCM_throws_exception() throws RomanNumeralsException {
		int i = roman.convertToInteger("CCCCM");
	}
	
	@Test(expected=RomanNumeralsException.class)
	public void test_convert_MMMMM_throws_exception() throws RomanNumeralsException {
		int i = roman.convertToInteger("MMMMM");
	}
	
	@Test(expected=RomanNumeralsException.class)
	public void test_convert_VV_throws_exception() throws RomanNumeralsException {
		int i = roman.convertToInteger("VV");
	}
	
	@Test(expected=RomanNumeralsException.class)
	public void test_convert_LL_throws_exception() throws RomanNumeralsException {
		int i = roman.convertToInteger("LL");
	}
	
	@Test(expected=RomanNumeralsException.class)
	public void test_convert_DD_throws_exception() throws RomanNumeralsException {
		int i = roman.convertToInteger("DD");
	}

}
