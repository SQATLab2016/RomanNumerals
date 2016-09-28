import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void testCreateRomanNumeral() {
		// Create RomanNumeral object
		RomanNumerals numeral = new RomanNumerals();
		// Check if it created;
		assertNotNull(numeral);	
	}
	
	@Test
	public void testGetRomanNumeral(){
		RomanNumerals numeral = new RomanNumerals();
		String num = numeral.getRomanNumeral();
		
		assertEquals("I", num);
	}
	
	@Test
	public void testReturnArabicNumber(){
		RomanNumerals numeral = new RomanNumerals();
		int num = numeral.returnArabicNumber();
		
		assertEquals(1, num);
	}
	
	@Test
	public void testConvertEachRomanNumeralToCorrespondingArabicNumber(){
		RomanNumerals numeral = new RomanNumerals();
		int num = numeral.convertEachRomanNumToArabicNum();
		
		assertEquals(1,num);
		
	}
	

}
