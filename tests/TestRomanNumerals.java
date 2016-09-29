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
		assertEquals(9, (romanNumerals.wahtIsIXis9(num)));
	}
	/*@Test
	public void test_checkIfIVis49(){
//		The	'1'	symbols	('I',	'X',	and	'C')	can	only	be	subtracted	from	the	2	next	highest	values	('IV'	and	
//		'IX',	'XL'	and	'XC',	'CD'	and	'CM').	

		String num="IL";
		assertEquals(49, (romanNumerals.wahtIsILis49(num)));
	}
	@Test
	public void test_checkIfIVis99(){
//		The	'1'	symbols	('I',	'X',	and	'C')	can	only	be	subtracted	from	the	2	next	highest	values	('IV'	and	
//		'IX',	'XL'	and	'XC',	'CD'	and	'CM').	

		String num="IC";
		assertEquals(99, (romanNumerals.wahtIsICis99(num)));
	}
	@Test
	public void test_checkIfIVis499(){
//		The	'1'	symbols	('I',	'X',	and	'C')	can	only	be	subtracted	from	the	2	next	highest	values	('IV'	and	
//		'IX',	'XL'	and	'XC',	'CD'	and	'CM').	

		String num="ID";
		assertEquals(499, (romanNumerals.wahtIsIDis499(num)));
	}
	 */





	@Test
	public void test_checkIfIVis40(){
		//		The	'1'	symbols	('I',	'X',	and	'C')	can	only	be	subtracted	from	the	2	next	highest	values	('IV'	and	
		//		'IX',	'XL'	and	'XC',	'CD'	and	'CM').	

		String num="XL";
		assertEquals(40, (romanNumerals.wahtIsXLis40(num)));
	}
	@Test
	public void test_checkIfIVis90(){
		//		The	'1'	symbols	('I',	'X',	and	'C')	can	only	be	subtracted	from	the	2	next	highest	values	('IV'	and	
		//		'IX',	'XL'	and	'XC',	'CD'	and	'CM').	

		String num="XC";
		assertEquals(90, (romanNumerals.wahtIsXCis90(num)));
	}
	/*	@Test
	public void test_checkIfIVis490(){
//		The	'1'	symbols	('I',	'X',	and	'C')	can	only	be	subtracted	from	the	2	next	highest	values	('IV'	and	
//		'IX',	'XL'	and	'XC',	'CD'	and	'CM').	

		String num="XD";
		assertEquals(490, (romanNumerals.wahtIsXDis490(num)));
	}*/

	@Test
	public void test_checkIfCDis400(){
		//	The	'1'	symbols	('I',	'X',	and	'C')	can	only	be	subtracted	from	the	2	next	highest	values	('IV'	and	
		//	'IX',	'XL'	and	'XC',	'CD'	and	'CM').	

		String num="CD";
		assertEquals(400, (romanNumerals.wahtIsCDis400(num)));
	}
	@Test
	public void test_checkIfIVis900(){
		//	The	'1'	symbols	('I',	'X',	and	'C')	can	only	be	subtracted	from	the	2	next	highest	values	('IV'	and	
		//	'IX',	'XL'	and	'XC',	'CD'	and	'CM').	

		String num="CM";
		assertEquals(900, (romanNumerals.wahtIsCMis900(num)));
	}


}
