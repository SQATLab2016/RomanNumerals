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
	public void test_VI_6() {
		int number = rn.convertToInteger("VI");
		assertEquals(6, number);
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
	public void test_I_cannot_be_subtracted_twice() {
		rn.convertToInteger("IIV");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_V_cannot_be_subtracted_from_X() {
		rn.convertToInteger("VX");
	}

}
