import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void ConvertNumberlength1() {
		
		RomanNumerals romannumerals = new RomanNumerals();
		
		assertEquals(6, romannumerals.get_Roman_Number("VI"));
	}
	
	@Test
	public void ConvertNumber1284() {
		
		RomanNumerals romannumerals = new RomanNumerals();
		
		assertEquals(6, romannumerals.get_Roman_Number("MCCLXXXIV"));
	}

}
