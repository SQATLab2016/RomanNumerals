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
		assertEquals("",1,RomanNumerals.ArabicNumber);
	}
	@Test
	public void test_Convert_1100(){
		RomanNumerals.RomanNumber="VI";
		RomanNumerals.convertToInteger(RomanNumerals.RomanNumber);
		assertEquals("",6,RomanNumerals.ArabicNumber);
	}	
	

	
	
}
