
public class RomanNumerals {
	private Hashtable<String, int> numTable;  
	
	public RomanNumerals() {
		
	}
	
	public int convertToInteger(String romanNum) throws RomanNumeralException {
		if (romanNum.equals("I"))
			return 1;
		
		throw new RomanNumeralException("No equivalent found for given roman number: " + romanNum);
	}
	
	public boolean isSubtraction(String romanNum, int pos) throws RomanNumeralException {
		if ((romanNum.length() - 1) < pos)
			throw new RomanNumeralException(
						"Position to check for subtraction is out of bounds. roman num length was: " +
						romanNum.length() + " position was: " + pos);

		// Character at pos is the last character
		if ((pos + 2) >  romanNum.length())
			return false;

		if (convertToInteger(romanNum.substring(pos, pos)) < convertToInteger(romanNum.substring((pos + 1), (pos + 1))))
			return true;

		return false;
	}
}
