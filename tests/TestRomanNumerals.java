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
	
	@Test
	public void testThree_I_X_C_M_s() throws RomanNumeralsException {
		RomanNumerals rm = new RomanNumerals();
		rm.convertToInteger("III");
		rm.convertToInteger("XXX");
		rm.convertToInteger("CCC");
		rm.convertToInteger("MMM");
	}
	
	@Test (expected = RomanNumeralsException.class)
	public void testRepetition_V_L_D_s() throws RomanNumeralsException {
		RomanNumerals rm = new RomanNumerals();
		rm.convertToInteger("VVV");
		rm.convertToInteger("LL");
		rm.convertToInteger("DDDD");
	}
	
	@Test 
	public void testRepetition_V_L_D_s_pass() throws RomanNumeralsException {
		RomanNumerals rm = new RomanNumerals();
		rm.convertToInteger("V");
		rm.convertToInteger("L");
		rm.convertToInteger("D");
	}
	
	@Test (expected = RomanNumeralsException.class)
	public void testSubtractionFrom2NextHighest() throws RomanNumeralsException {
		RomanNumerals rm = new RomanNumerals();
		rm.convertToInteger("IX");
	}
	
	@Test
	public void testBigNumber() throws RomanNumeralsException {
		RomanNumerals rm = new RomanNumerals();
		int number = rm.convertToInteger("MCMLXXXIV");
		assertEquals("Expected MCMLXXXIV to be 1984", 1984, number);
	}
	
	

}
