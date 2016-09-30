import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestRomanNumerals {
	
	RomanNumerals roman = new RomanNumerals();

	@Test
	public void test_convert_I_to_1() {
		int i = roman.convertToInteger("I");
		assertEquals(1, i);
	}
	
	@Test
	public void test_convert_II_to_2() {
		int i = roman.convertToInteger("II");
		assertEquals(2, i);
	}
	
	@Test
	public void test_convert_III_to_3() {
		int i = roman.convertToInteger("III");
		assertEquals(3, i);
	}
	
	@Test
	public void test_convert_IV_to_4() {
		int i = roman.convertToInteger("IV");
		assertEquals(4, i);
	}

	@Test
	public void test_convert_V_to_5() {
		int i = roman.convertToInteger("V");
		assertEquals(5, i);
	}
	
	@Test
	public void test_convert_X_to_10() {
		int i = roman.convertToInteger("X");
		assertEquals(10, i);
	}
	
	@Test
	public void test_convert_C_to_100() {
		int i = roman.convertToInteger("C");
		assertEquals(100, i);
	}
	
	@Test
	public void test_convert_D_to_500() {
		int i = roman.convertToInteger("D");
		assertEquals(500, i);
	}
	
	@Test
	public void test_convert_M_to_1000() {
		int i = roman.convertToInteger("M");
		assertEquals(1000, i);
	}

}
