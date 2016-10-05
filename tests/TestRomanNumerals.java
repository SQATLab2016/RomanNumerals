import static org.junit.Assert.*;



import org.junit.Test;

public class TestRomanNumerals {
	
	private RomanNumerals rn = new RomanNumerals();

	@Test public void testRomanNumerals_emptyString() throws Exception {
		int num = rn.convertToInteger("");
		assertEquals(0, num);
	}
	
	@Test public void testRomanNumerals_I_1() throws Exception  {
		int num = rn.convertToInteger("I");
		assertEquals(1, num);
	}
	
	@Test public void testRomanNumerals_II_2() throws Exception  {
		int num = rn.convertToInteger("II");
		assertEquals(2, num);
	}
	
	@Test public void testRomanNumerals_III_3() throws Exception  {
		int num = rn.convertToInteger("III");
		assertEquals(3, num);
	}
	
	@Test public void testRomanNumerals_V_5() throws Exception  {
		int num = rn.convertToInteger("V");
		assertEquals(5, num);
	}
	
	@Test public void testRomanNumerals_IV_4() throws Exception  {
		int num = rn.convertToInteger("IV");
		assertEquals(4, num);
	}
	
	@Test public void testRomanNumerals_VI_6() throws Exception  {
		int num = rn.convertToInteger("VI");
		assertEquals(6, num);
	}
	
	@Test public void testRomanNumerals_X_10() throws Exception  {
		int num = rn.convertToInteger("X");
		assertEquals(10, num);
	}
	
	@Test public void testRomanNumerals_L_50() throws Exception  {
		int num = rn.convertToInteger("L");
		assertEquals(50, num);
	}
	
	@Test public void testRomanNumerals_C_100() throws Exception  {
		int num = rn.convertToInteger("C");
		assertEquals(100, num);
	}
	
	@Test public void testRomanNumerals_D_500() throws Exception  {
		int num = rn.convertToInteger("D");
		assertEquals(500, num);
	}
	
	@Test public void testRomanNumerals_M_1000() throws Exception  {
		int num = rn.convertToInteger("M");
		assertEquals(1000, num);
	}
	
	@Test public void testRomanNumerals_XX_20() throws Exception  {
		int num = rn.convertToInteger("XX");
		assertEquals(20, num);
	}
	
	@Test public void testRomanNumerals_XC_90() throws Exception  {
		int num = rn.convertToInteger("XC");
		assertEquals(90, num);
	}
	
	@Test public void testRomanNumerals_LXX_70() throws Exception  {
		int num = rn.convertToInteger("LXX");
		assertEquals(70, num);
	}
	
	@Test public void testRomanNumerals_CM_900() throws Exception  {
		int num = rn.convertToInteger("CM");
		assertEquals(900, num);
	}
	
	@Test public void testRomanNumerals_MCMLXXXIV_1984() throws Exception  {
		int num = rn.convertToInteger("MCMLXXXIV");
		assertEquals(1984, num);
	}
	
	@Test public void testRomanNumerals_MMXIV_2014() throws Exception  {
		int num = rn.convertToInteger("MMXIV");
		assertEquals(2014, num);
	}
	
	@Test(expected=Exception.class) public void testRomanNumerals_IIII_err() throws Exception  {
		rn.convertToInteger("IIII");
	}
	
	@Test(expected=Exception.class) public void testRomanNumerals_LC_err() throws Exception  {
		rn.convertToInteger("LC");
	}
	
	@Test(expected=Exception.class) public void testRomanNumerals_VV_err() throws Exception  {
		rn.convertToInteger("VV");
	}
	
	@Test(expected=Exception.class) public void testRomanNumerals_DD_err() throws Exception  {
		rn.convertToInteger("DD");
	}
	
	@Test(expected=Exception.class) public void testRomanNumerals_XM_err() throws Exception  {
		rn.convertToInteger("XM");
	}
	
	@Test(expected=Exception.class) public void testRomanNumerals_XXC_err() throws Exception  {
		rn.convertToInteger("XXC");
	}
	
	@Test(expected=Exception.class) public void testRomanNumerals_VX_err() throws Exception  {
		rn.convertToInteger("VX");
	}
	
	@Test(expected=Exception.class) public void testRomanNumerals_DM_err() throws Exception  {
		rn.convertToInteger("DM");
	}
	
	@Test public void testRomanNumerals_2014_2014() throws Exception  {
		RomanNumeral testValue = new RomanNumeral(2014);
		int converted = rn.convertToInteger(testValue.toString());
		assertEquals(testValue.toInt(), converted);
	}

}
