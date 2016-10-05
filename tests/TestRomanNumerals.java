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
	
	@Test
	public void test_V_5() {
		int number = rn.convertToInteger("V");
		assertEquals(5, number);
	}
	
	@Test
	public void test_VI_6() {
		int number = rn.convertToInteger("VI");
		assertEquals(6, number);
	}
	
	@Test
	public void test_VII_7() {
		int number = rn.convertToInteger("VII");
		assertEquals(7, number);
	}
	
	@Test
	public void test_VIII_8() {
		int number = rn.convertToInteger("VIII");
		assertEquals(8, number);
	}
	
	@Test
	public void test_IX_9() {
		int number = rn.convertToInteger("IX");
		assertEquals(9, number);
	}
	
	@Test
	public void test_XIV_14() {
		int number = rn.convertToInteger("XIV");
		assertEquals(14, number);
	}
	
	@Test
	public void test_XV_15() {
		int number = rn.convertToInteger("XV");
		assertEquals(15, number);
	}
	
	@Test
	public void test_XVI_16() {
		int number = rn.convertToInteger("XVI");
		assertEquals(16, number);
	}
	
	@Test
	public void test_XX_20() {
		int number = rn.convertToInteger("XX");
		assertEquals(20, number);
	}
	
	@Test
	public void test_XXX_30() {
		int number = rn.convertToInteger("XXX");
		assertEquals(30, number);
	}
	
	@Test
	public void test_XL_40() {
		int number = rn.convertToInteger("XL");
		assertEquals(40, number);
	}
	
	@Test
	public void test_LXIV_64() {
		int number = rn.convertToInteger("LXIV");
		assertEquals(64, number);
	}
	
	@Test
	public void test_LXXXI_81() {
		int number = rn.convertToInteger("LXXXI");
		assertEquals(81, number);
	}
	
	@Test
	public void test_CCXXVI_226() {
		int number = rn.convertToInteger("CCXXVI");
		assertEquals(226, number);
	}
	
	@Test
	public void test_DCCC_800() {
		int number = rn.convertToInteger("DCCC");
		assertEquals(800, number);
	}
	
	@Test
	public void test_MCMLXXXIV_1984() {
		int number = rn.convertToInteger("MCMLXXXIV");
		assertEquals(1984, number);
	}
	
	@Test
	public void test_MMXIV_2014() {
		int number = rn.convertToInteger("MMXIV");
		assertEquals(2014, number);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_I_cannot_repeat_four_times() {
		rn.convertToInteger("IIII");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_X_cannot_repeat_four_times() {
		rn.convertToInteger("XXXX");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_C_cannot_repeat_four_times() {
		rn.convertToInteger("CCCC");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_M_cannot_repeat_four_times() {
		rn.convertToInteger("MMMM");
	}

	@Test (expected = IllegalArgumentException.class)
	public void test_V_cannot_repeat() {
		rn.convertToInteger("VV");
	}

	@Test (expected = IllegalArgumentException.class)
	public void test_L_cannot_repeat() {
		rn.convertToInteger("LL");
	}

	@Test (expected = IllegalArgumentException.class)
	public void test_D_cannot_repeat() {
		rn.convertToInteger("DD");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_I_cannot_be_subtracted_from_L() {
		rn.convertToInteger("IL");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_I_cannot_be_subtracted_from_C() {
		rn.convertToInteger("IC");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_I_cannot_be_subtracted_from_D() {
		rn.convertToInteger("ID");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_I_cannot_be_subtracted_from_M() {
		rn.convertToInteger("IM");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_I_cannot_be_subtracted_twice_from_V() {
		rn.convertToInteger("IIV");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_I_cannot_be_subtracted_twice_from_X() {
		rn.convertToInteger("IIX");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_V_cannot_be_subtracted_from_X() {
		rn.convertToInteger("VX");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_V_cannot_be_subtracted_from_L() {
		rn.convertToInteger("VL");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_V_cannot_be_subtracted_from_C() {
		rn.convertToInteger("VC");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_V_cannot_be_subtracted_from_D() {
		rn.convertToInteger("VD");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_V_cannot_be_subtracted_from_M() {
		rn.convertToInteger("VM");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_X_cannot_be_subtracted_from_D() {
		rn.convertToInteger("XD");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_X_cannot_be_subtracted_from_M() {
		rn.convertToInteger("XM");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_X_cannot_be_subtracted_twice_from_L() {
		rn.convertToInteger("XXL");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_X_cannot_be_subtracted_twice_from_C() {
		rn.convertToInteger("XXC");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_L_cannot_be_subtracted_from_C() {
		rn.convertToInteger("LC");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_L_cannot_be_subtracted_from_D() {
		rn.convertToInteger("LD");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_L_cannot_be_subtracted_from_M() {
		rn.convertToInteger("LM");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_C_cannot_be_subtracted_twice_from_D() {
		rn.convertToInteger("CCD");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_C_cannot_be_subtracted_twice_from_M() {
		rn.convertToInteger("CCM");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_D_cannot_be_subtracted_from_M() {
		rn.convertToInteger("DM");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_numbers() {
		rn.convertToInteger("123");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_other_letters() {
		rn.convertToInteger("ABEFG");
	}

}
