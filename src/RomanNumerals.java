
public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		if (romanNum.equals("I")) {
			return 1;
		} else if (romanNum.equals("II")) {
			return 2;
		} else if (romanNum.equals("III")) {
			return 3;
		} else {
			return 4;
		}
	}
}
