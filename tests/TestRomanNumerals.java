import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {
	
	@Test
	public void convertToInteger_MultipleCombination_HappyPath() {
		RomanNumerals r = new RomanNumerals();
		String inputString = "MCMLXXXIV";
		int expected = 1984;
		int actual = r.convertToInteger(inputString);
		assertEquals("Multiple Combination is not correct",expected, actual);
	}
	
	@Test
	public void convertToInteger_MultipleCombination_HappyPath2() {
		RomanNumerals r = new RomanNumerals();
		String inputString = "MMXIV";
		int expected = 2014;
		int actual = r.convertToInteger(inputString);
		assertEquals("Not Equal",expected, actual);
	}
	
	@Test
	public void convertToInteger_Single_HappyPath() {
		RomanNumerals r = new RomanNumerals();
		String inputString = "I";
		int expected = 1;
		int actual = r.convertToInteger(inputString);
		assertEquals("Not Equal",expected, actual);
	}
	
	@Test
	public void convertToInteger_Single_HappyPath2() {
		RomanNumerals r = new RomanNumerals();
		String inputString = "V";
		int expected = 5;
		int actual = r.convertToInteger(inputString);
		assertEquals("Not Equal",expected, actual);
	}
	
	@Test
	public void convertToInteger_Single_HappyPath3() {
		RomanNumerals r = new RomanNumerals();
		String inputString = "X";
		int expected = 10;
		int actual = r.convertToInteger(inputString);
		assertEquals("Not Equal",expected, actual);
	}
	
	@Test
	public void convertToInteger_Single_HappyPath4() {
		RomanNumerals r = new RomanNumerals();
		String inputString = "L";
		int expected = 50;
		int actual = r.convertToInteger(inputString);
		assertEquals("Not Equal",expected, actual);
	}
	
	@Test
	public void convertToInteger_Single_HappyPath5() {
		RomanNumerals r = new RomanNumerals();
		String inputString = "C";
		int expected = 100;
		int actual = r.convertToInteger(inputString);
		assertEquals("Not Equal",expected, actual);
	}

	@Test
	public void convertToInteger_Single_HappyPath6() {
		RomanNumerals r = new RomanNumerals();
		String inputString = "D";
		int expected = 500;
		int actual = r.convertToInteger(inputString);
		assertEquals("Not Equal",expected, actual);
	}
	
	@Test
	public void convertToInteger_Single_HappyPath7() {
		RomanNumerals r = new RomanNumerals();
		String inputString = "M";
		int expected = 1000;
		int actual = r.convertToInteger(inputString);
		assertEquals("Not Equal",expected, actual);
	}
	
	@Test
	public void convertToInteger_BasicCombination_HappyPath1() {
		RomanNumerals r = new RomanNumerals();
		String inputString = "IV";
		int expected = 4;
		int actual = r.convertToInteger(inputString);
		assertEquals("Not Equal",expected, actual);
	}
	
	@Test
	public void convertToInteger_BasicCombination_HappyPath2() {
		RomanNumerals r = new RomanNumerals();
		String inputString = "IX";
		int expected = 9;
		int actual = r.convertToInteger(inputString);
		assertEquals("Not Equal",expected, actual);
	}
	
	@Test
	public void convertToInteger_BasicCombination_HappyPath3() {
		RomanNumerals r = new RomanNumerals();
		String inputString = "XL";
		int expected = 40;
		int actual = r.convertToInteger(inputString);
		assertEquals("Not Equal",expected, actual);
	}
	
	
	@Test
	public void convertToInteger_BasicCombination_HappyPath4() {
		RomanNumerals r = new RomanNumerals();
		String inputString = "XC";
		int expected = 90;
		int actual = r.convertToInteger(inputString);
		assertEquals("Not Equal",expected, actual);
	}
	
	@Test
	public void convertToInteger_BasicCombination_HappyPath5() {
		RomanNumerals r = new RomanNumerals();
		String inputString = "CD";
		int expected = 400;
		int actual = r.convertToInteger(inputString);
		assertEquals("Not Equal",expected, actual);
	}
	
	@Test
	public void convertToInteger_BasicCombination_HappyPath6() {
		RomanNumerals r = new RomanNumerals();
		String inputString = "CM";
		int expected = 900;
		int actual = r.convertToInteger(inputString);
		assertEquals("Not Equal",expected, actual);
	}
	
	@Test(expected=Exception.class)
	public void convertToInteger_Imorethan4_ThrowsFormatException() throws Exception {
		RomanNumerals r = new RomanNumerals();
		String inputString = "IIII";
		int actual = r.convertToInteger(inputString);
	}
	
	@Test(expected=Exception.class)
	public void convertToInteger_Xmorethan4_ThrowsFormatException() throws Exception {
		RomanNumerals r = new RomanNumerals();
		String inputString = "XXXX";
		int actual = r.convertToInteger(inputString);
	}
	
	@Test(expected=Exception.class)
	public void convertToInteger_Cmorethan4_ThrowsFormatException() throws Exception {
		RomanNumerals r = new RomanNumerals();
		String inputString = "CCCC";
		int actual = r.convertToInteger(inputString);
	}
	
	@Test(expected=Exception.class)
	public void convertToInteger_IL_ThrowsFormatException() throws Exception {
		RomanNumerals r = new RomanNumerals();
		String inputString = "IL";
		int actual = r.convertToInteger(inputString);
	}
	
	@Test(expected=Exception.class)
	public void convertToInteger_IC_ThrowsFormatException() throws Exception {
		RomanNumerals r = new RomanNumerals();
		String inputString = "IC";
		int actual = r.convertToInteger(inputString);
	}
	
	@Test(expected=Exception.class)
	public void convertToInteger_XD_ThrowsFormatException() throws Exception {
		RomanNumerals r = new RomanNumerals();
		String inputString = "XD";
		int actual = r.convertToInteger(inputString);
	}
	
	@Test(expected=Exception.class)
	public void convertToInteger_XM_ThrowsFormatException() throws Exception {
		RomanNumerals r = new RomanNumerals();
		String inputString = "XM";
		int actual = r.convertToInteger(inputString);
	}
	
	@Test(expected=Exception.class)
	public void convertToInteger_RepeatedV_ThrowsFormatException() throws Exception {
		RomanNumerals r = new RomanNumerals();
		String inputString = "VV";
		int actual = r.convertToInteger(inputString);
	}
	
	@Test(expected=Exception.class)
	public void convertToInteger_RepeatedL_ThrowsFormatException() throws Exception {
		RomanNumerals r = new RomanNumerals();
		String inputString = "LL";
		int actual = r.convertToInteger(inputString);
	}
	
	@Test(expected=Exception.class)
	public void convertToInteger_RepeatedD_ThrowsFormatException() throws Exception {
		RomanNumerals r = new RomanNumerals();
		String inputString = "DD";
		int actual = r.convertToInteger(inputString);
	}
	
}
