
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
		
		for (int i = stringLength - 1; i >= 0; i--) {
			value += parseCharacterToValue(romanNum, i);
		}
		return value;
		
	}

	private int parseCharacterToValue(String romanNum, int i) {
		int currentVal, nextVal;
		currentVal = getCharValue(romanNum.charAt(i));
		try {
			nextVal = getCharValue(romanNum.charAt(i + 1));
			return getCurrentValue(currentVal, nextVal);
		}
		catch(Exception e) { // when trying to get next of last, it's intended to end up here
			return currentVal;
		}
	}

	private int getCurrentValue(int currentVal, int nextVal) {
		if (currentVal == nextVal) {
			return currentVal;
		}
		else if (currentVal < nextVal) {
			return -currentVal;
		}
		else if (currentVal > nextVal) {
			return currentVal;
		}
		return 0;
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
