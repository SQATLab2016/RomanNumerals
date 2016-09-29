import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {
	
	RomanNumerals RomanNumerals = new RomanNumerals();
	
	
	@Test
	public void test_NewRomamNumerals(){
		assertNotNull(RomanNumerals);
	}
	
	@Test
	public void test_AssignDigit(){
		RomanNumerals.RomanNumber="I";
		assertEquals("","I",RomanNumerals.RomanNumber);
	}
	
	@Test
	public void test_Convert1(){
		RomanNumerals.RomanNumber="I";
		assertEqualsNumber(1);
	}
	
	@Test
	public void test_Convert5(){
		RomanNumerals.RomanNumber="V";
		assertEqualsNumber(5);
	}
	
	@Test
	public void test_Convert10(){
		RomanNumerals.RomanNumber="X";
		assertEqualsNumber(10);
	}
	
	@Test
	public void test_Convert50(){
		RomanNumerals.RomanNumber="L";
		assertEqualsNumber(50);
	}
	
	@Test
	public void test_Convert100(){
		RomanNumerals.RomanNumber="C";
		assertEqualsNumber(100);
	}
	
	@Test
	public void test_Convert500(){
		RomanNumerals.RomanNumber="D";
		assertEqualsNumber(500);
	}
	
	@Test
	public void test_Convert1000(){
		RomanNumerals.RomanNumber="M";
		assertEqualsNumber(1000);
	}
	
	@Test
	public void test_Convert_1984(){
		RomanNumerals.RomanNumber="MCMLXXXIV";
		assertEqualsNumber(1984);
	}

	private void assertEqualsNumber(int Number) {
		RomanNumerals.convertToInteger(RomanNumerals.RomanNumber);
		assertEquals("",Number,RomanNumerals.ArabicNumber);
	}	
	

	
	
}
