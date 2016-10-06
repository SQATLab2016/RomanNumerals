import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestRomanNumerals {
	
	@Rule
	public ExpectedException expectedEx = ExpectedException.none();

	@Test
	public void createObjectRomanNumerals() {
		RomanNumerals romanNumerals = new RomanNumerals();
		assertNotNull(romanNumerals);
	}
	
	@Test
	public void convertToIntegerReturnsZeroWithEmptyString() {
		RomanNumerals romanNumerals = new RomanNumerals();
		assertEquals("0", 0, romanNumerals.convertToInteger(""));
	}
	
	@Test
	public void convertI() {
		RomanNumerals romanNumerals = new RomanNumerals();
		assertEquals("1", 1, romanNumerals.convertToInteger("I"));
	}

	@Test
	public void convertX() {
		RomanNumerals romanNumerals = new RomanNumerals();
		assertEquals("10", 10, romanNumerals.convertToInteger("X"));
	}
	
	@Test
	public void convertIII() {
		RomanNumerals romanNumerals = new RomanNumerals();
		assertEquals("3", 3, romanNumerals.convertToInteger("III"));
	}

	@Test
	public void convertIIII() throws IllegalArgumentException {
		expectedEx.expect(IllegalArgumentException.class);
		expectedEx.expectMessage("This roman number can't be repeated over three times in a row");
		RomanNumerals romanNumerals = new RomanNumerals();
		romanNumerals.convertToInteger("IIII");
	}
	
	@Test
	public void convertVV() throws IllegalArgumentException {
		expectedEx.expect(IllegalArgumentException.class);
		expectedEx.expectMessage("This roman number can't be repeated");
		RomanNumerals romanNumerals = new RomanNumerals();
		romanNumerals.convertToInteger("VV");
	}
	
	@Test
	public void convertIX() {
		RomanNumerals romanNumerals = new RomanNumerals();
		assertEquals("9", 9, romanNumerals.convertToInteger("IX"));
	}
	
	@Test
	public void convertIV() {
		RomanNumerals romanNumerals = new RomanNumerals();
		assertEquals("4", 4, romanNumerals.convertToInteger("IV"));
	}

	
	
	

}
