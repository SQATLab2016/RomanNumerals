import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	// Test "prime" values
	@Test
	public void testOnes_one() {
		RomanNumerals rn = new RomanNumerals();
		int value = rn.convertToInteger("I");
		assertEquals(1, value);
	}

	@Test
	public void testFive() {
		RomanNumerals rn = new RomanNumerals();
		int value = rn.convertToInteger("V");
		assertEquals(5, value);
	}

	@Test
	public void testTen() {
		RomanNumerals rn = new RomanNumerals();
		int value = rn.convertToInteger("X");
		assertEquals(10, value);
	}
	
	@Test
	public void testFifty() {
		RomanNumerals rn = new RomanNumerals();
		int value = rn.convertToInteger("L");
		assertEquals(50, value);
	}

	@Test
	public void testHundred() {
		RomanNumerals rn = new RomanNumerals();
		int value = rn.convertToInteger("C");
		assertEquals(100, value);
	}

	@Test
	public void testFiveHundred() {
		RomanNumerals rn = new RomanNumerals();
		int value = rn.convertToInteger("D");
		assertEquals(500, value);
	}
	
	@Test
	public void testThousand() {
		RomanNumerals rn = new RomanNumerals();
		int value = rn.convertToInteger("M");
		assertEquals(1000, value);
	}
	
	// Test "odd, under and over"
	@Test
	public void testFour() {
		RomanNumerals rn = new RomanNumerals();
		int value = rn.convertToInteger("IV");
		assertEquals(4, value);
	}

	@Test
	public void testNine() {
		RomanNumerals rn = new RomanNumerals();
		int value = rn.convertToInteger("IX");
		assertEquals(9, value);
	}

	@Test
	public void testThree() {
		RomanNumerals rn = new RomanNumerals();
		int value = rn.convertToInteger("III");
		assertEquals(3, value);
	}

	@Test
	public void testHundredNine() {
		RomanNumerals rn = new RomanNumerals();
		int value = rn.convertToInteger("CIX");
		assertEquals(109, value);
	}

	@Test
	public void testTwoThousandSixteen() {
		RomanNumerals rn = new RomanNumerals();
		int value = rn.convertToInteger("MMXVI");
		assertEquals(2016, value);
	}

	@Test
	public void testNineHundredEightyEight() {
		RomanNumerals rn = new RomanNumerals();
		int value = rn.convertToInteger("DCCCCLXXXVIII");
		assertEquals(988, value);
	}

	@Test
	public void testNineThousandNineHundredNinetyNine() {
		RomanNumerals rn = new RomanNumerals();
		int value = rn.convertToInteger("MMMMMMMMMIM");
		assertEquals(9999, value);
	}
}
