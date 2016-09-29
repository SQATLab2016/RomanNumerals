import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void test() throws RomanNumeralsException {
		RomanNumerals rm = new RomanNumerals();
		assertNotNull(rm);
	}
	
	@Test
	public void testReturnWith_I() throws RomanNumeralsException{
		RomanNumerals rm = new RomanNumerals();
		int number = rm.convertToInteger("I");
		assertEquals("I was not 1", 1, number);
	}
	
	@Test (expected = RomanNumeralsException.class)
	public void testMoreThanThree_I_X_C_M_s() throws RomanNumeralsException {
		RomanNumerals rm = new RomanNumerals();
		rm.convertToInteger("IIII");
		rm.convertToInteger("XXXX");
		rm.convertToInteger("CCCC");
		rm.convertToInteger("MMMM");
	}
	
	

}
