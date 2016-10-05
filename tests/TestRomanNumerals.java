import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestRomanNumerals {
	//private RomanNumerals = new RomanNumerals();
	
	private String romanTestNum;

	public TestRomanNumerals(String parTestNum) {
		romanTestNum = parTestNum;
	}
	
	@Parameters
	public static Collection<Object[]> testData() {
		return Arrays.asList(new Object [][] {
			{"I"},
			{"II"},
			{"CM"},
		});
	}
	
	@Test
	public void number_1_Generated() throws RomanNumeralException {
		RomanNumerals numerals = new RomanNumerals();
		assertTrue(1 == numerals.convertToInteger("I"));
	}

	@Test
	public void isSubtraction() {
		
	}
}
