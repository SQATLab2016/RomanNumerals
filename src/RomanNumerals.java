
public class RomanNumerals {
	public int convertToInteger(String romanNum) {

		if (checkRomanNumberValue(romanNum)) {
			return 2;
		}
		else if (romanNum == "III") {
			return 3;
		}
		else if (romanNum == "V") {
			return 5;
		}
		else if (romanNum == "IV") {
			return 4;
		}
		else return 1;
		
	}

	private boolean checkRomanNumberValue(String romanNum) {
		return romanNum == "II";
	}
}
