import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void testConvertingI() {
		RomanNumerals rn = new RomanNumerals();
		try {
			int converted = rn.convertToInteger("I");
			assertEquals(1, converted);
		}
		catch(Exception e) {
		}
	}
	
	@Test
	public void testConverting1() {
		RomanNumerals rn = new RomanNumerals();
		boolean thrown = false;
		try {
			rn.convertToInteger("1");
		}
		catch(Exception e) {
			thrown = true;
		}
		assertEquals(true, thrown);
	}
	
	@Test
	public void testConvertingA() {
		RomanNumerals rn = new RomanNumerals();
		boolean thrown = false;
		try {
			rn.convertToInteger("A");
		}
		catch(Exception e) {
			thrown = true;
		}
		assertEquals(true, thrown);
	}
	
	@Test
	public void testConvertingII() {
		RomanNumerals rn = new RomanNumerals();
		try {
			int converted = rn.convertToInteger("II");
			assertEquals(2, converted);
		}
		catch(Exception e) {
		}
		
	}
	
	@Test
	public void testConvertingIII(){
		RomanNumerals rn = new RomanNumerals();
		try {
			int converted = rn.convertToInteger("III");
			assertEquals(3, converted);
		}
		catch(Exception e) {
		}
	
	}
	
	@Test
	public void testConvertingIIII() {
		RomanNumerals rn = new RomanNumerals();
		boolean thrown = false;
		try {
			rn.convertToInteger("IIII");
		}
		catch(RomanNumeralsException e) {
			thrown = true;
		}
		assertEquals(true, thrown);
	}
	
	@Test
	public void testConvertingXXXIIII(){
		RomanNumerals rn = new RomanNumerals();
		boolean thrown = false;
		try {
			rn.convertToInteger("XXXIIII");
		}
		catch(RomanNumeralsException e) {
			thrown = true;
		}
		assertEquals(true, thrown);
	}
	
	@Test
	public void testConvertingIV(){
		RomanNumerals rn = new RomanNumerals();
		try {
			int converted = rn.convertToInteger("IV");
			assertEquals(4, converted);
		}
		catch(RomanNumeralsException e) {
		}
	}
	
	@Test
	public void testConvertingVV() {
		RomanNumerals rn = new RomanNumerals();
		boolean thrown = false;
		try {
			rn.convertToInteger("VV");
		}
		catch(RomanNumeralsException e) {
			thrown = true;
		}
		assertEquals(true, thrown);
	}
	
	@Test
	public void testConvertingX() {
		RomanNumerals rn = new RomanNumerals();
		try {
			int converted = rn.convertToInteger("X");
			assertEquals(10, converted);
		}
		catch(RomanNumeralsException e) {
		}
	}
	
	@Test
	public void testConvertingXX() {
		RomanNumerals rn = new RomanNumerals();
		try {
			int converted = rn.convertToInteger("XX");
			assertEquals(20, converted);
		}
		catch(RomanNumeralsException e) {
		}
	}
	
	@Test
	public void testConvertingL() {
		RomanNumerals rn = new RomanNumerals();
		try {
			int converted = rn.convertToInteger("L");
			assertEquals(50, converted);
		}
		catch(RomanNumeralsException e) {
		}
	}
	
	@Test
	public void testConvertingLL() {
		RomanNumerals rn = new RomanNumerals();
		boolean thrown = false;
		try {
			rn.convertToInteger("LL");
		}
		catch(RomanNumeralsException e) {
			thrown = true;
		}
		assertEquals(true, thrown);
	}
	
	@Test
	public void testConvertingC() {
		RomanNumerals rn = new RomanNumerals();
		try {
			int converted = rn.convertToInteger("C");
			assertEquals(100, converted);
		}
		catch(RomanNumeralsException e) {
		}
	}
	
	@Test
	public void testConvertingCC() {
		RomanNumerals rn = new RomanNumerals();
		try {
			int converted = rn.convertToInteger("CC");
			assertEquals(200, converted);
		}
		catch(RomanNumeralsException e) {
		}
	}
	
	@Test
	public void testConvertingD() {
		RomanNumerals rn = new RomanNumerals();
		try {
			int converted = rn.convertToInteger("D");
			assertEquals(500, converted);
		}
		catch(RomanNumeralsException e) {
		}
	}
	
	@Test
	public void testConvertingDD() {
		RomanNumerals rn = new RomanNumerals();
		boolean thrown = false;
		try {
			rn.convertToInteger("DD");
		}
		catch(RomanNumeralsException e) {
			thrown = true;
		}
		assertEquals(true, thrown);
	}
	
	@Test
	public void testConvertingM() {
		RomanNumerals rn = new RomanNumerals();
		try {
			int converted = rn.convertToInteger("M");
			assertEquals(1000, converted);
		}
		catch(RomanNumeralsException e) {
		}
	}
	
	@Test
	public void testConvertingMM() {
		RomanNumerals rn = new RomanNumerals();
		try {
			int converted = rn.convertToInteger("MM");
			assertEquals(2000, converted);
		}
		catch(RomanNumeralsException e) {
		}
	}
	
	@Test
	public void testConvertingXIX() {
		RomanNumerals rn = new RomanNumerals();
		try {
			int converted = rn.convertToInteger("XIX");
			assertEquals(19, converted);
		}
		catch(RomanNumeralsException e) {
		}
	}
	
	@Test
	public void testConvertingVX() {
		RomanNumerals rn = new RomanNumerals();
		boolean thrown = false;
		try {
			rn.convertToInteger("VX");
		}
		catch(RomanNumeralsException e) {
			thrown = true;
		}
		assertEquals(true, thrown);
	}
	
}
