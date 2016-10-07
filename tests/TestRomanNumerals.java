import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void test_CreateRomanNumerals() {		
		assertNotNull(converter);
	}
	
	private RomanNumerals converter = new RomanNumerals();
	
	@Test
	public void test_IReturns1() {
		AssertNumeral(1, "I");
	}
	
	@Test
	public void test_IIReturns2() {
		AssertNumeral(2, "II");
	}
	
	@Test
	public void test_IIIReturns3() {
		AssertNumeral(3, "III");
	}
	
	@Test
	public void test_IVReturns4() {
		AssertNumeral(4, "IV");
	}	
	
	
	@Test
	public void test_VReturns5() {
		AssertNumeral(5, "V");		
	}
	
	@Test
	public void test_VIReturns6() {
		AssertNumeral(6, "VI");		
	}
	
	@Test
	public void test_VIIReturns7() {
		AssertNumeral(7, "VII");		
	}
	
	@Test
	public void test_VIIIReturns8() {
		AssertNumeral(8, "VIII");		
	}
	
	@Test
	public void test_IXReturns9() {
		AssertNumeral(9, "IX");		
	}
	
	
	@Test
	public void test_XReturns10() {
		AssertNumeral(10, "X");
	}
	
	@Test
	public void test_XXReturns20() {
		AssertNumeral(20, "XX");
	}
	
	@Test 
	public void test_XLReturns40{
		AssertNumeral(40, "XL");
	}
	
	
	@Test
	public void test_LReturns50() {		
		AssertNumeral(50, "L");
	}
	
	@Test
	public void test_CReturns100() {		
		AssertNumeral(100, "C");
	}
	
	@Test
	public void test_DReturns500() {		
		AssertNumeral(500, "D");
	}
	
	@Test
	public void test_MReturns1000() {		
		AssertNumeral(1000, "M");
	}
	
	
	
	
	private void AssertNumeral(int arabic, String roman) {
		int result = converter.convertToInteger(roman);
		assertEquals(arabic, result);
	}
	


}
