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
	public void testConverter_nonRomanNumeralJShouldBenegativeOne() {
		assertRomanNumebrEqual("J", -1);
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
	
	@Test
	public void testConverter_ConvertVV_shouldBe_minus1(){
		assertRomanNumebrEqual("VV", -1);
	}
	
	@Test
	public void testConverter_ConvertLL_shouldBe_minus1(){
		assertRomanNumebrEqual("LL", -1);
	}
	
	@Test
	public void testConverter_ConvertDD_shouldBe_minus1(){
		assertRomanNumebrEqual("DD", -1);
	}
	
	@Test
	public void testConverter_ConvertXXXX_shouldBe_minus1(){
		assertRomanNumebrEqual("XXXX", -1);
	}
	
	@Test
	public void testConverter_ConvertIV_shouldBe_4(){
		assertRomanNumebrEqual("IV", 4);
	}
	
	@Test
	public void testConverter_ConvertIX_shouldBe_9(){
		assertRomanNumebrEqual("IX", 9);
	}
	
	@Test
	public void testConverter_ConvertIL_shouldBe_Minus1(){
		assertRomanNumebrEqual("IL", -1);
	}
	
	@Test
	public void testConverter_ConvertXC_shouldBe_90(){
		assertRomanNumebrEqual("XC", 90);
	}
	
	@Test
	public void testConverter_ConvertXD_shouldBe_Minus1(){
		assertRomanNumebrEqual("XD", -1);
	}
	
	@Test
	public void testConverter_ConvertXXC_shouldBe_Minus1(){
		assertRomanNumebrEqual("XXC", -1);
	}
	
	@Test
	public void testConverter_ConvertVX_shouldBe_Minus1(){
		assertRomanNumebrEqual("VX", -1);
	}
	
	@Test
	public void testConverter_ConvertVI_shouldBe_6(){
		assertRomanNumebrEqual("VI", 6);
	}
	
	@Test
	public void testConverter_ConvertXI_shouldBe_11(){
		assertRomanNumebrEqual("XI", 11);
	}
	
	@Test
	public void testConverter_ConvertVII_shouldBe_7(){
		assertRomanNumebrEqual("VII", 7);
	}
	
	@Test
	public void testConverter_ConvertVIII_shouldBe_8(){
		assertRomanNumebrEqual("VIII", 8);
	}
	
	@Test
	public void testConverter_ConvertXL_shouldBe_40(){
		assertRomanNumebrEqual("XL", 40);
	}
	
	private void assertRomanNumebrEqual(String romanNumeral, int expectedNumber){
		int number = numeral.convertToInteger(romanNumeral);
		
		assertEquals(expectedNumber, number);
	}

}
