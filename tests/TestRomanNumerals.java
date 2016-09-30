import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void test_I_1() throws Exception {
		RomanNumerals RNs = new RomanNumerals();
		int result = RNs.convertToInteger("I");
		assertEquals(1,result);
	}
	
	@Test
	public void test_II_2() throws Exception{
		RomanNumerals RNs = new RomanNumerals();
		int result = RNs.convertToInteger("II");
		assertEquals(2,result);
	}
	@Test
	public void test_III_3() throws Exception{
		RomanNumerals RNs = new RomanNumerals();
		int result = RNs.convertToInteger("III");
		assertEquals(3,result);
	}
	@Test
	public void test_IV_4() throws Exception{
		RomanNumerals RNs = new RomanNumerals();
		int result = RNs.convertToInteger("IV");
		assertEquals(4,result);
	}
	@Test
	public void test_V_5() throws Exception{
		RomanNumerals RNs = new RomanNumerals();
		int result = RNs.convertToInteger("V");
		assertEquals(5,result);
	}
	@Test
	public void test_VI_6() throws Exception{
		RomanNumerals RNs = new RomanNumerals();
		int result = RNs.convertToInteger("VI");
		assertEquals(6,result);
	}
	@Test
	public void test_VII_7() throws Exception{
		RomanNumerals RNs = new RomanNumerals();
		int result = RNs.convertToInteger("VII");
		assertEquals(7,result);
	}
	@Test
	public void test_VIII_8() throws Exception{
		RomanNumerals RNs = new RomanNumerals();
		int result = RNs.convertToInteger("VIII");
		assertEquals(8,result);
	}
	@Test
	public void test_IX_9() throws Exception{
		RomanNumerals RNs = new RomanNumerals();
		int result = RNs.convertToInteger("IX");
		assertEquals(9,result);
	}
	@Test
	public void test_X_10() throws Exception{
		RomanNumerals RNs = new RomanNumerals();
		int result = RNs.convertToInteger("X");
		assertEquals(10,result);
	}
	@Test
	public void test_XI_11() throws Exception{
		RomanNumerals RNs = new RomanNumerals();
		int result = RNs.convertToInteger("XI");
		assertEquals(11,result);
	}
	@Test
	public void test_XX_20() throws Exception{
		RomanNumerals RNs = new RomanNumerals();
		int result = RNs.convertToInteger("XX");
		assertEquals(20,result);
	}
	@Test
	public void test_XXX_30() throws Exception{
		RomanNumerals RNs = new RomanNumerals();
		int result = RNs.convertToInteger("XXX");
		assertEquals(30,result);
	}
	
	@Test
	public void test_XL_40() throws Exception{
		RomanNumerals RNs = new RomanNumerals();
		int result = RNs.convertToInteger("XL");
		assertEquals(40,result);
	}
	
	@Test
	public void test_L_50() throws Exception{
		RomanNumerals RNs = new RomanNumerals();
		int result = RNs.convertToInteger("L");
		assertEquals(50,result);
	}
	
	@Test
	public void test_LX_60() throws Exception{
		RomanNumerals RNs = new RomanNumerals();
		int result = RNs.convertToInteger("LX");
		assertEquals(60,result);
	}
	
	@Test
	public void test_LXX_70() throws Exception{
		RomanNumerals RNs = new RomanNumerals();
		int result = RNs.convertToInteger("LXX");
		assertEquals(70,result);
	}
	
	@Test
	public void test_LXXX_80() throws Exception{
		RomanNumerals RNs = new RomanNumerals();
		int result = RNs.convertToInteger("LXXX");
		assertEquals(80,result);
	}
	
	@Test
	public void test_XC_90() throws Exception{
		RomanNumerals RNs = new RomanNumerals();
		int result = RNs.convertToInteger("XC");
		assertEquals(90,result);
	}
	
	@Test
	public void test_C_100() throws Exception{
		RomanNumerals RNs = new RomanNumerals();
		int result = RNs.convertToInteger("C");
		assertEquals(100,result);
	}
	
	@Test
	public void test_CC_200() throws Exception{
		RomanNumerals RNs = new RomanNumerals();
		int result = RNs.convertToInteger("CC");
		assertEquals(200,result);
	}
	
	@Test
	public void test_CCC_300() throws Exception{
		RomanNumerals RNs = new RomanNumerals();
		int result = RNs.convertToInteger("CCC");
		assertEquals(300,result);
	}
	
	@Test
	public void test_CD_400() throws Exception{
		RomanNumerals RNs = new RomanNumerals();
		int result = RNs.convertToInteger("CD");
		assertEquals(400,result);
	}
	
	@Test
	public void test_D_500() throws Exception{
		RomanNumerals RNs = new RomanNumerals();
		int result = RNs.convertToInteger("D");
		assertEquals(500,result);
	}
	
	@Test
	public void test_DC_600() throws Exception{
		RomanNumerals RNs = new RomanNumerals();
		int result = RNs.convertToInteger("DC");
		assertEquals(600,result);
	}
	
	@Test
	public void test_DCC_700() throws Exception{
		RomanNumerals RNs = new RomanNumerals();
		int result = RNs.convertToInteger("DCC");
		assertEquals(700,result);
	}
	
	@Test
	public void test_DCCC_800() throws Exception{
		RomanNumerals RNs = new RomanNumerals();
		int result = RNs.convertToInteger("DCCC");
		assertEquals(800,result);
	}
	
	@Test
	public void test_CM_900() throws Exception{
		RomanNumerals RNs = new RomanNumerals();
		int result = RNs.convertToInteger("CM");
		assertEquals(900,result);
	}
	
	@Test
	public void test_M_1000() throws Exception{
		RomanNumerals RNs = new RomanNumerals();
		int result = RNs.convertToInteger("M");
		assertEquals(1000,result);
	}
	
	@Test
	public void test_MCMLXXXIV_1984() throws Exception{
		RomanNumerals RNs = new RomanNumerals();
		int result = RNs.convertToInteger("MCMLXXXIV");
		assertEquals(1984,result);
	}
	
	@Test
	public void test_MMXIV_2014() throws Exception{
		RomanNumerals RNs = new RomanNumerals();
		int result = RNs.convertToInteger("MMXIV");
		assertEquals(2014,result);
	}
}
