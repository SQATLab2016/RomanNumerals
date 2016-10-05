
public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		if (romanNum.equals("V")) {
			return -1;
		}

		return romanNum.length() * getSingularValue(String.valueOf(romanNum.charAt(0)));

	}

	private int getSingularValue(String roman) {
		if (roman.equals("I")) {
			return 1;
		} else if (roman.equals("V")) {
			return 5;
		} else if (roman.equals("X")) {
			return 10;
		} else if (roman.equals("L")) {
			return 50;
		} else if (roman.equals("C")) {
			return 100;
		} else if (roman.equals("D")) {
			return 500;
		} else if (roman.equals("M")) {
			return 1000;
		}
		return -1;
	}
}
