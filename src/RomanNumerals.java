
public class RomanNumerals {

	public RomanNumerals() {
	}

	public int convertToInteger(String romanNum) {

		romanNum = romanNum.toUpperCase();

		if (romanNum.equals("I")) {
			return 1;

		} else if (romanNum.equals("II")) {

			return 2;
		} else if (romanNum == "III") {

			return 3;
		} else if (romanNum.equals("IV")) {

			return 4;
		} else if (romanNum.equals("V")) {

			return 5;
		} else if (romanNum.equals("VI")) {

			return 6;
		} else if (romanNum.equals("VII")) {

			return 7;
		} else if (romanNum.equals("VIII")) {

			return 8;
		} else if (romanNum.equals("IX")) {

			return 9;
		}

		// To be Implemented
		return 0;

	}
}
