import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	RomanNumerals romanNumerals= new RomanNumerals();

	@Test
	public void test() {
		fail("Not yet implemented");



	}

	@Test
	public void test_checkFor3I() {
		//The	symbols	'I',	'X',	'C',	and	'M'	can	be	repeated	
		//		at	most	3	times	in	a	row.	
		String num="MCMLXXXIV";
		assertTrue(romanNumerals.checkFor3I(num));
	}
	@Test
	public void test_checkFor3X() {
		//The	symbols	'I',	'X',	'C',	and	'M'	can	be	repeated	
		//		at	most	3	times	in	a	row.	
		String num="MCMLXXXIV";
		assertTrue(romanNumerals.checkFor3X(num));
	}

	@Test
	public void test_checkFor3C() {
		//The	symbols	'I',	'X',	'C',	and	'M'	can	be	repeated	
		//		at	most	3	times	in	a	row.	
		String num="MCMLXXXIV";
		assertTrue(romanNumerals.checkFor3C(num));
	}
	@Test
	public void test_checkFor3M() {
		//The	symbols	'I',	'X',	'C',	and	'M'	can	be	repeated	
		//		at	most	3	times	in	a	row.	
		String num="MCMLXXXIV";
		assertTrue(romanNumerals.checkFor3M(num));
	}

	@Test
	public void test_checkForNoV() {
		//	The	symbols	'V',	'L',	and	'D'	can	never	be	repeated.	
		String num="MCMLXXXIV";
		assertTrue(romanNumerals.checkForNorepeatV(num));



	}
}
