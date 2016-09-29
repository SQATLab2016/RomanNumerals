import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void test_I_1() {
		int romanNum = RomanNumerals.convertToInteger("I");
		assertEquals(1, romanNum);

	}

	@Test
	public void test_V_5() {
		int romanNum = RomanNumerals.convertToInteger("V");
		assertEquals(5, romanNum);

	}

	@Test
	public void test_X_10() {
		int romanNum = RomanNumerals.convertToInteger("X");
		assertEquals(10, romanNum);

	}

	@Test
	public void test_L_50() {
		int romanNum = RomanNumerals.convertToInteger("L");
		assertEquals(50, romanNum);

	}

	@Test
	public void test_C_100() {
		int romanNum = RomanNumerals.convertToInteger("C");
		assertEquals(100, romanNum);

	}
	@Test
	public void test_D_500() {
		int romanNum = RomanNumerals.convertToInteger("D");
		assertEquals(500, romanNum);

	}

	@Test
	public void test_M_1000() {
		int romanNum = RomanNumerals.convertToInteger("M");
		assertEquals(1000, romanNum);

	}

	@Test
	public void test_RepeatLessThanThreeTimesI(){
		String numI = ("XIII");
		assertTrue(RomanNumerals.repeatLessThanThreeTimesI(numI));
	}
	@Test
	public void test_RepeatLessThanThreeTimesX(){
		String numX = ("XX");
		assertTrue(RomanNumerals.repeatLessThanThreeTimesX(numX));
	}
	@Test
	public void test_RepeatLessThanThreeTimesC(){
		String numC = ("C");
		assertTrue(RomanNumerals.repeatLessThanThreeTimesC(numC));
	}
	@Test
	public void test_RepeatLessThanThreeTimesM(){
		String numM = ("M");
		assertTrue(RomanNumerals.repeatLessThanThreeTimesM(numM));
	}

}
