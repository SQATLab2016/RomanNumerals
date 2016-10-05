
public class RomanNumerals {
	private static final char I = 'I';
	private static final char V = 'V';
	private static final char X = 'X';
	private static final char L = 'L';
	private static final char C = 'C';
	private static final char D = 'D';
	private static final char M = 'M';

	public int convertToInteger(String romanNum) throws Exception {
		int value = 0;
		int lastIndexOfNum = romanNum.length() - 1;
		
		for (int i = lastIndexOfNum; i >= 0; i--) {
			checkRepetition(romanNum, lastIndexOfNum, i);
			value += parseCharacterToValue(romanNum, i);
		}
		return value;
	}

	private void checkRepetition(String romanNum, int lastIndexOfNum, int i) throws Exception {
		int repeated = 1;
		char c = romanNum.charAt(i);
		if (i < lastIndexOfNum) {
			for (int j = i + 1; j <= lastIndexOfNum; j++) {
				if (romanNum.charAt(i) == romanNum.charAt(j)) {
					repeated++;
				}
				else {
					break;
				}
			}
		}
		if ((c == I || c == X || c == C || c == M) && repeated > 3) {
			throw new Exception("Symbol repeated too many times");
		}
	}

	private int parseCharacterToValue(String romanNum, int i) {
		int currentVal, nextVal;
		currentVal = getCharValue(romanNum.charAt(i));
		try {
			nextVal = getCharValue(romanNum.charAt(i + 1));
			return getCurrentValue(currentVal, nextVal);
		}
		catch(Exception e) {
			return currentVal; // when trying to get next of last, it is intended to end up here
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
