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
		RomanNumerals.convertToInteger(RomanNumerals.RomanNumber);
		assertEqualsNumber(1);
	}
	
	@Test
	public void test_Convert10(){
		
	}
	
	@Test
	public void test_Convert_1984(){
		RomanNumerals.RomanNumber="MCMLXXXIV";
		RomanNumerals.convertToInteger(RomanNumerals.RomanNumber);
		assertEqualsNumber(1984);
	}

	private void assertEqualsNumber(int Number) {
		assertEquals("",Number,RomanNumerals.ArabicNumber);
	}	
	

	
	
}
