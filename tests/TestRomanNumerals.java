import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	RomanNumerals num = new RomanNumerals();
	@Test
	public void test_ConvertToInteger() {
		
		int arabic = num.convertToInteger("I");
		assertEquals("Number is not one", 1, arabic);
	}
	@Test
	public void test_ConvertToIntegerThree(){
		
		int arabic = num.convertToInteger("III");
		assertEquals("Number is not three", 3, arabic);
	}
	@Test
	public void test_ConvertToIntegerFive(){
		
		int arabic = num.convertToInteger("V");
		assertEquals("Number is not five", 5, arabic);
	}
	@Test
	public void test_ConvertToIntegerTen(){
		
		int arabic = num.convertToInteger("X");
		assertEquals("Number is not ten", 10, arabic);
	}
	@Test
	public void test_ConvertToIntegerFifty(){
		
		int arabic = num.convertToInteger("L");
		assertEquals("Number is not fifty", 50, arabic);
	}
	@Test
	public void test_ConvertToIntegerHundred(){
		
		int arabic = num.convertToInteger("C");
		assertEquals("Number is not hundred", 100, arabic);
	}
	@Test
	public void test_ConvertToIntegerFour(){
		
		int arabic = num.convertToInteger("IV");
		assertEquals("Number is not four", 4, arabic);
	}
	@Test
	public void test_ConvertToIntegerSeve(){
		int arabic = num.convertToInteger("VII");
		assertEquals("Number is not seven", 7, arabic);
	}
	@Test
	public void test_ConvertToIntegerNine(){
		int arabic = num.convertToInteger("IX");
		assertEquals("Number is not nine", 9, arabic);
	}
	@Test
	public void test_NotRepeated(){
		int arabic = num.convertToInteger("VV");
		assertEquals("Number cannot be repeated", 0, arabic);
	}
	@Test
	public void test_Substraction(){
		int arabic = num.convertToInteger("XXC");
		assertEquals("Number is substracted even though not possible", 0, arabic);
	}
	

}
