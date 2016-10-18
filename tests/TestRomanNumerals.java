import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {
	RomanNumerals test = new RomanNumerals();
	@Test
	public void test_ConverterCreated() {
		assertNotNull(test);
	}
	@Test
	public void test_1() {
		assertEquals(1,test.convertToInteger("I"));
	}@Test
	public void test_5() {
		
		assertEquals(5,test.convertToInteger("V"));
	}@Test
	public void test_10() {
		
		assertEquals(10,test.convertToInteger("X"));
	}@Test
	public void test_50() {
		
		assertEquals(50,test.convertToInteger("L"));
	}@Test
	public void test_100() {
		
		assertEquals(100,test.convertToInteger("C"));
	}@Test
	public void test_500() {
		
		assertEquals(500,test.convertToInteger("D"));
	}@Test
	public void test_1000() {
		
		assertEquals(1000,test.convertToInteger("M"));
	}
	
	@Test
	public void test_4() {		
      	assertEquals(4,test.convertToInteger("IV"));
	}
	@Test
	public void test_3() {		
      	assertEquals(3,test.convertToInteger("III"));
	}
	@Test
	public void test_8() {		
      	assertEquals(8,test.convertToInteger("VIII"));
	}
	
	@Test
	public void test_80() {		
      	assertEquals(80,test.convertToInteger("LXXX"));
	}
	@Test
	public void test_400() {		
      	assertEquals(400,test.convertToInteger("CD"));
	}
	
	@Test
	public void test_900() {		
      	assertEquals(900,test.convertToInteger("CM"));
	}
	@Test
	public void test_1984() {		
      	assertEquals(1984,test.convertToInteger("MCMLXXXIV"));
	}
	@Test
    public void test_2014() {		
      	assertEquals(2014,test.convertToInteger("MMXIV"));
	}
	
	
	
	
	
	
	

	
}
