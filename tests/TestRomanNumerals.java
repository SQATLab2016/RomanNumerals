import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	RomanNumerals romanNumerals= new RomanNumerals();

	@Test
	public void test() {
		fail("Not yet implemented");



	}

	@Test
	public void test_CherFor3I() {
		//The	symbols	'I',	'X',	'C',	and	'M'	can	be	repeated	
		//		at	most	3	times	in	a	row.	
		String num="MCMLXXXIV";
		assertTrue(romanNumerals.cherFor3I(num));
	}
	@Test
	public void test_CherFor3X() {
		//The	symbols	'I',	'X',	'C',	and	'M'	can	be	repeated	
		//		at	most	3	times	in	a	row.	
		String num="MCMLXXXIV";
		assertTrue(romanNumerals.cherFor3X(num));
	}
	
	@Test
	public void test_CherFor3C() {
		//The	symbols	'I',	'X',	'C',	and	'M'	can	be	repeated	
		//		at	most	3	times	in	a	row.	
		String num="MCMLXXXIV";
		assertTrue(romanNumerals.cherFor3C(num));
	}
	@Test
	public void test_CherFor3M() {
		//The	symbols	'I',	'X',	'C',	and	'M'	can	be	repeated	
		//		at	most	3	times	in	a	row.	
		String num="MCMLXXXIV";
		assertTrue(romanNumerals.cherFor3M(num));
	}
}
