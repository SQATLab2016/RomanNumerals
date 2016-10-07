import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {
	
	RomanNumerals test = new RomanNumerals();
	

	@Test
	public void testAppCreated_NotNull() {
		
	assertNotNull(test);
	}
	@Test
	public void testRomanNumerals_One() {
		
	int integer = test.convertToInteger("I");
	assertEquals(1, integer);
	
	}
	@Test
	public void testRomanNumerals_Two() {
		
	int integer = test.convertToInteger("II");
	assertEquals(2, integer);
	
	}
	@Test
	public void testRomanNumerals_Three() {
		
	int integer = test.convertToInteger("III");
	assertEquals(3, integer);
	
	}
	@Test
	public void testRomanNumerals_Four() {
		
	int integer = test.convertToInteger("IV");
	assertEquals(4, integer);
	
	}
	
	@Test
	public void testRomanNumberals_Five() {
		
	int integer = test.convertToInteger("V");
	assertEquals(5, integer);
		
	}
	
	@Test
	public void testRomanNumberals_Six() {
		
	int integer = test.convertToInteger("VI");
	assertEquals(6, integer);
		
	}
	@Test
	public void testRomanNumberals_Seven() {
		
	int integer = test.convertToInteger("VII");
	assertEquals(7, integer);
		
	}
	@Test
	public void testRomanNumberals_Eleven() {
		
	int integer = test.convertToInteger("XI");
	assertEquals(11, integer);
		
	}
	@Test
	public void testRomanNumberals_Twelve() {
		
	int integer = test.convertToInteger("XII");
	assertEquals(12, integer);
		
	}
	@Test
	public void testRomanNumberals_Fourteen() {
		
	int integer = test.convertToInteger("XIV");
	assertEquals(14, integer);
		
	}
	@Test
	public void testRomanNumberals_Twenty() {
		
	int integer = test.convertToInteger("XX");
	assertEquals(20, integer);
		
	}
	@Test
	public void testRomanNumberals_TwentyFive() {
		
	int integer = test.convertToInteger("XXV");
	assertEquals(25, integer);
		
	}
	@Test
	public void testRomanNumberals_Fifty() {
		
	int integer = test.convertToInteger("L");
	assertEquals(50, integer);
		
	}
	@Test
	public void testRomanNumberals_Fourty() {
		
	int integer = test.convertToInteger("XL");
	assertEquals(50, integer);
		
	}
	@Test
	public void testRomanNumberals_Sixty() {
		
	int integer = test.convertToInteger("LX");
	assertEquals(60, integer);
		
	}
	@Test
	public void testRomanNumberals_SixtyFour() {
		
	int integer = test.convertToInteger("LXIV");
	assertEquals(64, integer);
		
	}
	@Test
	public void testRomanNumberals_Hundred() {
		
	int integer = test.convertToInteger("C");
	assertEquals(100, integer);
		
	}
	
	
	
	
	/*
	private void assertIntegerEquals(String roman) {
	//int integer = test.convertToInteger(roman);
		
		assertEquals(integer, roman);
				
	}*/
	


}
