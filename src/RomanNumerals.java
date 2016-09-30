
public class RomanNumerals {

	public RomanNumerals() {
	}

	public int convertToInteger(String romanNum) {

		romanNum = romanNum.toUpperCase();
		romanNum = romanNum.substring(0);

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

	public int romanConvert(String roman) {

		int decimal = 0;

		String romanNumeral = roman.toUpperCase();
		for (int i = 0; i < romanNumeral.length(); i++) {
			char convertToDecimal = roman.charAt(i);

			switch (convertToDecimal) {
			case 'M':
				decimal += 1000;
				break;

			case 'D':
				decimal += 500;
				break;

			case 'C':
				decimal += 100;
				break;

			case 'L':
				decimal += 50;
				break;

			case 'X':
				decimal += 10;
				break;

			case 'V':
				decimal += 5;
				break;

			case 'I':
				decimal += 1;
				break;
			}
		}
		if (romanNumeral.contains("IV")) {
			decimal -= 2;
		}
		if (romanNumeral.contains("IX")) {
			decimal -= 2;
		}
		if (romanNumeral.contains("XL")) {
			decimal -= 10;
		}
		if (romanNumeral.contains("XC")) {
			decimal -= 10;
		}
		if (romanNumeral.contains("CD")) {
			decimal -= 100;
		}
		if (romanNumeral.contains("CM")) {
			decimal -= 100;
		}
		return decimal;
	}
}
