import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void ConvertNumberlength1() {
		
		RomanNumerals romannumerals = new RomanNumerals();
		
		assertEquals(6, romannumerals.get_Roman_Number("VI"));
	}
	
	@Test
	public void ConvertNumber1334() {
		
		RomanNumerals romannumerals = new RomanNumerals();
		
		assertEquals(1134, romannumerals.get_Roman_Number("MCCCLXXXIV"));
	}

}