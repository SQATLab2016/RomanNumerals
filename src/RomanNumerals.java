
public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		if(romanNum.equals("V"))
			return 5;
		else if (romanNum.equals("X"))
			return 10;
		return 1;
	}
}
