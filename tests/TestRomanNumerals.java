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
	
}
