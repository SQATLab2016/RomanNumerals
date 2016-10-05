
public class RomanNumerals {
	public int convertToInteger(String romanNum) throws RomanNumeralException {
		char[] rommanNumArray = romanNum.toCharArray();
		int result = 0;
		int loop = 0;

		validateRomanString(rommanNumArray);

		while (loop < rommanNumArray.length) {
			if (loop + 1 < rommanNumArray.length
					&& checkIfFirstIsSmall(rommanNumArray[loop], rommanNumArray[loop + 1])) {
				result = result
						+ (checkSingleNumeral(rommanNumArray[loop + 1]) - checkSingleNumeral(rommanNumArray[loop]));
				loop = loop + 2;
			} else {
				result = result + checkSingleNumeral(rommanNumArray[loop]);
				loop++;
			}
		}
		return result;
	}

	private void validateRomanString(char[] rommanNumArray) throws RomanNumeralException {
		int countI = 0;
		int countX = 0;
		int countM = 0;
		int countC = 0;
		int countV = 0;
		int countL = 0;
		int countD = 0;

		for (int loop = 0; loop < rommanNumArray.length; loop++) {
			if (rommanNumArray[loop] == 'V')
				countV++;
			else if (rommanNumArray[loop] == 'X')
				countX++;
			else if (rommanNumArray[loop] == 'I')
				countI++;
			else if (rommanNumArray[loop] == 'M')
				countM++;
			else if (rommanNumArray[loop] == 'C')
				countC++;
			else if (rommanNumArray[loop] == 'L')
				countL++;
			else if (rommanNumArray[loop] == 'D')
				countD++;
		}

		if (countI > 3 || countX > 3 || countM > 3 || countC > 3 || countV > 1 || countL > 1 || countD > 1) {
			throw new RomanNumeralException();
		}
	}

	private boolean checkIfFirstIsSmall(char c, char d) {
		boolean result = false;
		if (checkSingleNumeral(c) < checkSingleNumeral(d)) {
			result = true;
		}
		return result;
	}

	public int checkSingleNumeral(char numberal) {
		if (numberal == 'V')
			return 5;
		else if (numberal == 'X')
			return 10;
		else if (numberal == 'L')
			return 50;
		else if (numberal == 'C')
			return 100;
		else if (numberal == 'D')
			return 500;
		else if (numberal == 'M')
			return 1000;
		else
			return 1;
	}
}
