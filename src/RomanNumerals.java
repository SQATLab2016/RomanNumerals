
public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		char[] rommanNumArray = romanNum.toCharArray();
		int result = 0;
		int loop = 0;

		while (loop < rommanNumArray.length) {

			if (loop + 1 < rommanNumArray.length) {

			} else {
				result = result + checkSingleNumeral(rommanNumArray[loop]);
			}
			loop++;
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
