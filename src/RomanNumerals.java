
public class RomanNumerals {

	private String numeralOrder = "IVXLCDM";

	public int convertToInteger(String romanNum) {
		if (romanNum.length() > 1 && allCharactersAreSame(romanNum)
				&& (romanNum.charAt(0) == 'V' || romanNum.charAt(0) == 'L' || romanNum.charAt(0) == 'D')) {
			return -1;
		}

		if (romanNum.length() == 2) {
				if (romanNum.charAt(0) != romanNum.charAt(1)) {
					if(numeralOrder.indexOf(romanNum.charAt(0)) > numeralOrder.indexOf(romanNum.charAt(1))){
						return addNumerals(romanNum);
					}
					if (numeralOrder.indexOf(romanNum.charAt(1)) - numeralOrder.indexOf(romanNum.charAt(0)) < 3) {
						if (getSingularValue(getStringCharAt(romanNum, 1)) > getSingularValue(
								getStringCharAt(romanNum, 0))) {
							if (!isAFiveNumber(romanNum.charAt(0))) {
								return getSingularValue(getStringCharAt(romanNum, 1))
										- getSingularValue(getStringCharAt(romanNum, 0));
							}
						} else {
							return getSingularValue(getStringCharAt(romanNum, 1))
									+ getSingularValue(getStringCharAt(romanNum, 0));
						}
					}
				} else {
					return romanNum.length() * getSingularValue(getStringCharAt(romanNum, 0));
				}
			} else {
				if (allCharactersAreSame(romanNum) && romanNum.length() < 4) {
					return romanNum.length() * getSingularValue(getStringCharAt(romanNum, 0));
				} else {
					if (isInOrder(romanNum))
						return addNumerals(romanNum);
				}
			}
	
		return -1;

	}

	private boolean isInOrder(String romanNum) {
		if (romanNum.length() > 2) {
			if (numeralOrder.indexOf(romanNum.charAt(0)) > numeralOrder.indexOf(romanNum.charAt(2))) {
				return true;
			}
		}
		return false;
	}

	private int addNumerals(String romanNum) {
		int total = 0;
		for (int i = 0; i < romanNum.length(); i++) {
			total = total + getSingularValue(getStringCharAt(romanNum, i));
		}
		return total;
	}

	private boolean isAFiveNumber(char c) {
		if (c == 'V' || c == 'L' || c == 'D') {
			return true;
		}
		return false;
	}

	private boolean allCharactersAreSame(String num) {
		for (int i = 1; i < num.toCharArray().length; i++) {
			if (num.charAt(i) != num.charAt(i - 1)) {
				return false;
			}
		}
		return true;
	}

	private String getStringCharAt(String theString, int index) {
		return String.valueOf(theString.charAt(index));
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
