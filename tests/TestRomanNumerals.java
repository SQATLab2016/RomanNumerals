import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {
	
	 private static void assertRomanNumeralsEquals(String romanNum, int arabNum) {
	        //assertThat(roman, is(RomanNumerals.convert(arabNum)));
	}

	@Test
	public void testIs1() {
		assertRomanNumeralsEquals("I", 200);
	}
	
	@Test
	public void IXCMcanBeRepated3() {
		fail("Not yet implemented");
	}

	@Test
	public void VLDcannotBeRepeated() {
		fail("Not yet implemented");
	}
}
