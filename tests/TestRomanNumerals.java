import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void atMost3CharTest() {
		RomanNumerals rm = new RomanNumerals("CCCCXIV");
		Boolean valid = false;
		valid = rm.atMost3CharCheck('C'); 
		
		assertEquals(false, valid);
	}
	
	
	
}
