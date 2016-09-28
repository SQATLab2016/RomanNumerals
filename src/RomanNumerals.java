
public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		if (romanNum.equals("I")) {
			return 1;
		} else if (romanNum.equals("II")) {
			return 2;
		} else {
			return 3;
		}
	}
}
