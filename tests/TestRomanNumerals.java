import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {
	
	RomanNumerals numeral = new RomanNumerals();

	@Test
	public void testConverter_convert_I_shouldBe1() {
		assertRomanNumebrEqual("I", 1);
	}
	
	@Test
	public void testConverter_convert_V_shouldBe5() {
		assertRomanNumebrEqual("V", 5);
	}
	
	@Test
	public void testConverter_convert_X_shouldBe10() {
		assertRomanNumebrEqual("X", 10);
	}
	
	@Test
	public void testConverter_convert_L_shouldBe50() {
		assertRomanNumebrEqual("L", 50);
	}
	
	@Test
	public void testConverter_convert_C_shouldBe100() {
		assertRomanNumebrEqual("C", 100);
	}
	
	@Test
	public void testConverter_convert_D_shouldBe500() {
		assertRomanNumebrEqual("D", 500);
	}
	
	@Test
	public void testConverter_convert_M_shouldBe1000() {
		assertRomanNumebrEqual("M", 1000);
	}
	
	@Test
	public void testConverter_nonRomanNumeralJShouldBe0() {
		assertRomanNumebrEqual("J", 0);
	}
	
	@Test
	public void testConverter_ConvertIII_shouldBe3() {
		assertRomanNumebrEqual("III", 3);
	}
	
	@Test
	public void testConverter_ConvertXXX_shouldBe30() {
		assertRomanNumebrEqual("XXX", 30);
	}
	
	@Test
	public void testConverter_ConvertCCC_shouldBe300() {
		assertRomanNumebrEqual("CCC", 300);
	}
	
	@Test
	public void testConverter_ConvertMMM_shouldBe3000() {
		assertRomanNumebrEqual("MMM", 3000);
	}
	
	@Test
	public void testConverter_ConvertII_shouldBe2() {
		assertRomanNumebrEqual("II", 2);
	}
	
	@Test
	public void testConverter_ConvertMM_shouldBe2000() {
		assertRomanNumebrEqual("MM", 2000);
	}
	
	private void assertRomanNumebrEqual(String romanNumeral, int expectedNumber){
		int number = numeral.convertToInteger(romanNumeral);
		
		assertEquals(expectedNumber, number);
	}

}
