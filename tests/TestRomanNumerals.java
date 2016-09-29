import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void test_I_1() {
		//Arrange
		//Act
		int num = RomanNumerals.convertToInteger("I");
		//Assert
		assertEquals(1, num);
	}
	
	@Test
	public void test_V_5() {
		//Arrange
		//Act
		int num = RomanNumerals.convertToInteger("V");
		//Assert
		assertEquals(5, num);
	}
	
	@Test
	public void test_X_10() {
		//Arrange
		//Act
		int num = RomanNumerals.convertToInteger("X");
		//Assert
		assertEquals(10, num);
	}
	
	@Test
	public void test_L_50() {
		//Arrange
		//Act
		int num = RomanNumerals.convertToInteger("L");
		//Assert
		assertEquals(50, num);
	}
	
	@Test
	public void test_C_100() {
		//Arrange
		//Act
		int num = RomanNumerals.convertToInteger("C");
		//Assert
		assertEquals(100, num);
	}
	
	@Test
	public void test_D_500() {
		//Arrange
		//Act
		int num = RomanNumerals.convertToInteger("D");
		//Assert
		assertEquals(500, num);
	}
	
	@Test
	public void test_M_1000() {
		//Arrange
		//Act
		int num = RomanNumerals.convertToInteger("M");
		//Assert
		assertEquals(1000, num);
	}
	
	@Test
	public void test_II_2() {
		//Arrange
		//Act
		int num = RomanNumerals.convertToInteger("II");
		//Assert
		assertEquals(2, num);
	}
	
	@Test
	public void test_IV_4() {
		//Arrange
		//Act
		int num = RomanNumerals.convertToInteger("IV");
		//Assert
		assertEquals(4, num);
	}
	
	@Test
	public void test_IIII_minus1() {
		//Arrange
		//Act
		int num = RomanNumerals.convertToInteger("IIII");
		//Assert
		assertEquals(-1, num);
	}
	
	@Test
	public void test_XXXX_minus1() {
		//Arrange
		//Act
		int num = RomanNumerals.convertToInteger("XXXX");
		//Assert
		assertEquals(-1, num);
	}
	
	@Test
	public void test_CCCC_minus1() {
		//Arrange
		//Act
		int num = RomanNumerals.convertToInteger("CCCC");
		//Assert
		assertEquals(-1, num);
	}
	
	@Test
	public void test_MMMM_minus1() {
		//Arrange
		//Act
		int num = RomanNumerals.convertToInteger("MMMM");
		//Assert
		assertEquals(-1, num);
	}
	
	@Test
	public void test_VMV_minus1() {
		//Arrange
		//Act
		int num = RomanNumerals.convertToInteger("VMV");
		//Assert
		assertEquals(-1, num);
	}
	
	@Test
	public void test_IC_minus1() {
		//Arrange
		//Act
		int num = RomanNumerals.convertToInteger("IC");
		//Assert
		assertEquals(-1, num);
	}
	
	@Test
	public void test_VX_minus1() {
		//Arrange
		//Act
		int num = RomanNumerals.convertToInteger("VX");
		//Assert
		assertEquals(-1, num);
	}

}
