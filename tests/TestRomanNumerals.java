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
			if (correctResults[i] != romans.isSubtraction(testCases[i], 0)) {
				caseFailed = true;
				break;
			}
		}
		
		assertTrue("Subtraction not detected. Failed case number: " + i,
					false == caseFailed);
	}

	@Test
	public void maxThreeRepeats() throws RomanNumeralException {
		RomanNumerals romans = new RomanNumerals();
		boolean caseFailed = false;
		int i = 0;

		String[] testCases = {
			"VIII",
			"MCCCC",
			"XXX"
		};
		
		boolean[] correctResults = {
				true,
				false,
				true
		};
		
		for (i = 0; i < testCases.length; i++) {
			if (correctResults[i] != romans.repeatingOkOneSymbols(testCases[i])) {
				caseFailed = true;
				break;
			}
		}
		
		assertTrue("Repeating of '1' symbols is not ok for test case: " + i,
					false == caseFailed);
	}
	
	@Test
	public void fiveSymbolsNotRepeated() throws RomanNumeralException {
		RomanNumerals romans = new RomanNumerals();
		boolean caseFailed = false;
		int i = 0;

		String[] testCases = {
			"DCCLL",
			"MDDLX",
			"DCDLXIV"
		};
		
		boolean[] correctResults = {
				false,
				false,
				true
		};
		
		for (i = 0; i < testCases.length; i++) {
			if (correctResults[i] != romans.repeatingOkFiveSymbols(testCases[i])) {
				caseFailed = true;
				break;
			}
		}
		
		assertTrue("Repeating of '5' symbols is not ok for test case: " + i,
					false == caseFailed);
	}
}
