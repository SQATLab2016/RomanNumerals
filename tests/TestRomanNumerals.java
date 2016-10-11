import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

//@RunWith(Parameterized.class)
public class TestRomanNumerals {
	//private RomanNumerals = new RomanNumerals();
	
	/*private String romanTestNum;

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
	}*/
	
	@Test
	public void number_1_Generated() throws RomanNumeralException {
		RomanNumerals numerals = new RomanNumerals();
		assertTrue(1 == numerals.convertToInteger("I"));
	}

	@Test
	public void subtractionDetected() throws RomanNumeralException {
		RomanNumerals romans = new RomanNumerals();
		boolean caseFailed = false;
		int i = 0;

		String[] testCases = {
			"IV",
			"CM",
			"II",
		};
		
		boolean[] correctResults = {
				true,
				true,
				false
		};

		for (i = 0; i < testCases.length; i++) {
			System.out.println("correctResults[i] == " + correctResults[i]);
			System.out.println("subtraction test == " + romans.isSubtraction(testCases[i], 0));
			if (!correctResults[i] == romans.isSubtraction(testCases[i], 0)) {
				caseFailed = true;
				break;
			}
		}
		
		assertTrue("Subtraction not detected. Failed case number: " + i,
					false == caseFailed);
	}
}
