
public class RomanNumerals {

	public RomanNumerals() {
	}

	public int convertToInteger(String roman) {

		int decimal = 0;

		roman = roman.toUpperCase();
		
		for (int i = 0; i < roman.length(); i++) {
			int convertToDecimal = roman.charAt(i);

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
		if (roman.contains("IV")) {
			decimal -= 2;
		}
		if (roman.contains("IX")) {
			decimal -= 2;
		}
		if (roman.contains("XL")) {
			decimal -= 10;
		}
		if (roman.contains("XC")) {
			decimal -= 10;
		}
		if (roman.contains("CD")) {
			decimal -= 100;
		}
		if (roman.contains("CM")) {
			decimal -= 100;
		}
		return decimal;
	}
}
