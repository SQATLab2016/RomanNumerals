import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	RomanNumerals rn = new RomanNumerals();
	
	@Test
	public void test_RomanNumerals_notNull() {
		assertNotNull(rn);
	}

	@Test
	public void test_RomanNumerals_return_one() {
		assertEquals(1, rn.convertToInteger("i"));
	}
	
	@Test
	public void test_RomanNumerals_return_two() {
		assertEquals(2, rn.convertToInteger("ii"));
	}
	
	@Test
	public void test_RomanNumerals_return_three() {
		assertEquals(3, rn.convertToInteger("iii"));
	}
	
	@Test
	public void test_RomanNumerals_return_four() {
		assertEquals(4, rn.convertToInteger("iv"));
	}
	
	@Test
	public void test_RomanNumerals_return_five() {
		assertEquals(5, rn.convertToInteger("v"));
	}
	
	@Test
	public void test_RomanNumerals_return_six() {
		assertEquals(6, rn.convertToInteger("vi"));
	}
	
	@Test
	public void test_RomanNumerals_return_seven() {
		assertEquals(7, rn.convertToInteger("vii"));
	}
	
	@Test
	public void test_RomanNumerals_return_eight() {
		assertEquals(8, rn.convertToInteger("viii"));
	}
	
	@Test
	public void test_RomanNumerals_return_nine() {
		assertEquals(9, rn.convertToInteger("ix"));
	}
	
	@Test
	public void test_RomanNumerals_return_ten() {
		assertEquals(10, rn.convertToInteger("x"));
	}
	
	@Test
	public void test_RomanNumerals_return_nineteen() {
		assertEquals(19, rn.convertToInteger("ixx"));
	}
	
	@Test
	public void test_RomanNumerals_return_twenty() {
		assertEquals(20, rn.convertToInteger("xx"));
	}
	
	@Test
	public void test_RomanNumerals_return_ninetyNine() {
		assertEquals(99, rn.convertToInteger("XCIX"));
	}
	
	@Test
	public void test_RomanNumerals_return_999() {
		assertEquals(999, rn.convertToInteger("CMXCIX"));
	}
	
	@Test
	public void test_RomanNumerals_return_1984() {
		assertEquals(1984, rn.convertToInteger("mcmlxxxiv"));
	}
	
	@Test
	public void test_RomanNumerals_return_2014() {
		assertEquals(2014, rn.convertToInteger("mmxiv"));
	}
	
}
