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
	
	@Test
	public void test_checkForNoL() {
		//	The	symbols	'V',	'L',	and	'D'	can	never	be	repeated.	
		String num="MCMLXXXIV";
		assertTrue(romanNumerals.checkForNorepeatL(num));
	}
	@Test
	public void test_checkForNoD() {
		//	The	symbols	'V',	'L',	and	'D'	can	never	be	repeated.	
		String num="MCMLXXXIV";
		assertTrue(romanNumerals.checkForNorepeatD(num));
	}
	
	
//rule 3
	
	@Test
	public void test_checkIfIVis4(){
//		The	'1'	symbols	('I',	'X',	and	'C')	can	only	be	subtracted	from	the	2	next	highest	values	('IV'	and	
//		'IX',	'XL'	and	'XC',	'CD'	and	'CM').	
	
		String num="IV";
		assertEquals(4, (romanNumerals.wahtIsIVis4(num)));
	}
	@Test
	public void test_checkIfIVis9(){
//		The	'1'	symbols	('I',	'X',	and	'C')	can	only	be	subtracted	from	the	2	next	highest	values	('IV'	and	
//		'IX',	'XL'	and	'XC',	'CD'	and	'CM').	
	
		String num="IX";
		assertEquals(9, (romanNumerals.wahtIsIVis9(num)));
	}
	@Test
	public void test_checkIfIVis49(){
//		The	'1'	symbols	('I',	'X',	and	'C')	can	only	be	subtracted	from	the	2	next	highest	values	('IV'	and	
//		'IX',	'XL'	and	'XC',	'CD'	and	'CM').	
	
		String num="IL";
		assertEquals(49, (romanNumerals.wahtIsIVis49(num)));
	}
	@Test
	public void test_checkIfIVis99(){
//		The	'1'	symbols	('I',	'X',	and	'C')	can	only	be	subtracted	from	the	2	next	highest	values	('IV'	and	
//		'IX',	'XL'	and	'XC',	'CD'	and	'CM').	
	
		String num="IC";
		assertEquals(99, (romanNumerals.wahtIsIVis99(num)));
	}
	@Test
	public void test_checkIfIVis499(){
//		The	'1'	symbols	('I',	'X',	and	'C')	can	only	be	subtracted	from	the	2	next	highest	values	('IV'	and	
//		'IX',	'XL'	and	'XC',	'CD'	and	'CM').	
	
		String num="ID";
		assertEquals(499, (romanNumerals.wahtIsIVis499(num)));
	}
}
