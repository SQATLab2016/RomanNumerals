import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {
	RomanNumerals romanNumerals = new RomanNumerals();
	@Test
	public void testCheckRomanNumerals_null() {		
		assertNotNull(romanNumerals);
	}

	@Test
	public void testRomanNumeral_I_1(){
		assertRomanNumerals(1, "I");
	}
	
	@Test
	public void testRomanNumeral_V_5(){
		assertRomanNumerals(5, "V");
	}
	
	@Test
	public void testRomanNumeral_X_10(){
		assertRomanNumerals(10, "X");
	}
	
	@Test
	public void testRomanNumeral_L_50(){
		assertRomanNumerals(50, "L");
	}
	
	@Test
	public void testRomanNumeral_C_100(){
		assertRomanNumerals(100, "C");
	}
	
	@Test
	public void testRomanNumeral_D_500(){
		assertRomanNumerals(500, "D");
	}
	
	@Test
	public void testRomanNumeral_M_1000(){
		assertRomanNumerals(1000, "M");
	}
	
	@Test
	public void testRomanNumeral_IV_4(){
		assertRomanNumerals(4, "IV");
	}
	
	public void assertRomanNumerals(int expectedOutput, String input){
		int result = romanNumerals.convertToInteger(input);
		assertEquals(expectedOutput, result);
	}
	
}
