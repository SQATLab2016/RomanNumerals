
public class RomanNumerals {
	public int convertToInteger(String romanNum) throws RomanNumeralException {
		if (romanNum.equals("I"))
			return 1;
		
		throw new RomanNumeralException("No equivalent found for given roman number: " + romanNum);
	}
	
	public boolean isSubtraction(String romanNum) throws RomanNumeralException {
		// Only one subtraction can be made per numeral
		if (romanNum.length > 2)
			return false;
		
		/*if (convertToInteger(romanNum)) 
			return ;*/
	}
}
