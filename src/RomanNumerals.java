
public class RomanNumerals {
	public int convertToInteger(String romanNum) throws RomanNumeralException {
		if (romanNum.equals("I"))
			return 1;
		
		throw new RomanNumeralException("No equivalent found for given roman number: " + romanNum);
	}
	
	public boolean isSubtraction(String romanNum, int pos) {
		if ((romanNum.length() - 1) < pos)
			throw new RomanNumeralException(
						"Position to check for subtraction is out of bounds. roman num length was: " +
						romanNum.length() + " position was: " + pos);
		
		// Only one subtraction can be made per numeral
		if ((pos) romanNum.length())
			return false;
		
		
		
		if (romanNum.charAt(pos) < )
		
		/*if (convertToInteger(romanNum)) 
			return ;*/
		
		return true; // this ok or something else?
	}
}
