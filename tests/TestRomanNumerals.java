import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void ConvertNumberlength1() {
		
		RomanNumerals romannumerals = new RomanNumerals();
		
		assertEquals(6, romannumerals.get_Roman_Number("VI"));
	}
	
	@Test
	public void ConvertNumberlength2() {
		
		RomanNumerals romannumerals = new RomanNumerals();
		
		assertEquals(8, romannumerals.get_Roman_Number("VIII"));
	}
	
	@Test
	public void ConvertNumber1384() {
		
		RomanNumerals romannumerals = new RomanNumerals();
		
		assertEquals(1384, romannumerals.get_Roman_Number("MCCCLXXXIV"));
	}
	
	@Test
	public void ConvertNumber1210() {
		
		RomanNumerals romannumerals = new RomanNumerals();
		
		assertEquals(1210, romannumerals.get_Roman_Number("MCCX"));
	}

}
