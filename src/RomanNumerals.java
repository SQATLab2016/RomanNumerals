
public class RomanNumerals {
	private static final char I = 'I';
	private static final char V = 'V';
	private static final char X = 'X';
	private static final char L = 'L';
	private static final char C = 'C';
	private static final char D = 'D';
	private static final char M = 'M';

	public int convertToInteger(String romanNum) {
		// To be Implemented
		int value = 0;
		int stringLength = romanNum.length();
		char currentChar, nextChar;
		
		if (stringLength > 0)
		{
			for (int i = stringLength - 1; i >= 0; i--) {
				currentChar = romanNum.charAt(i);
				if (i < stringLength - 1) {
					nextChar = romanNum.charAt(i + 1);
					if (currentChar == nextChar) {
						value += getCharValue(currentChar);
					}
					else if (getCharValue(currentChar) < getCharValue(nextChar)) {
						value -= getCharValue(currentChar);
					}
					else if (getCharValue(currentChar) > getCharValue(nextChar)) {
						value += getCharValue(currentChar);
					}
				}
				else {
					value += getCharValue(currentChar);
				}
			}
		}
		return value;
		
	}
	
	private int getCharValue(char romanNum) {
		if (romanNum == I) {
			return 1;
		}
		else if (romanNum == V) {
			return 5;
		}
		else if (romanNum == X) {
			return 10;
		}
		else if (romanNum == L) {
			return 50;
		}
		else if (romanNum == C) {
			return 100;
		}
		else if (romanNum == D) {
			return 500;
		}
		else if (romanNum == M) {
			return 1000;
		}
		return 0;
	}

}
