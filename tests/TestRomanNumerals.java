import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void atMost3CharTest() {
		RomanNumerals rm = new RomanNumerals("XXXMMMIIIV");
		Boolean valid = false;
		valid = rm.atMost3CharCheck(); 
		
		assertEquals(true, valid);
	}
	
	@Test
	public void repetitionCharTest() {
		RomanNumerals rm = new RomanNumerals("XXXMMMDIIIV");
		Boolean valid = false;
		valid = rm.repetitionCharCheck(); 
		
		assertEquals(true, valid);
	}
	
	
}
