
public class RomanNumerals {
	public int convertToInteger(String romanNum) throws RomanNumeralException {
		// To be Implemented
		if (romanNum.equals("I"))
			return 1;
		
		throw new RomanNumeralException("No equivalent found for given roman number: " + romanNum);
	}
	
	public boolean isSubtraction(String) {
		
	}
}
