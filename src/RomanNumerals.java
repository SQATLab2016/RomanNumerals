
public class RomanNumerals {
	private static final char I = 'I';
	private static final char V = 'V';
	private static final char X = 'X';
	private static final char L = 'L';
	private static final char C = 'C';
	private static final char D = 'D';
	private static final char M = 'M';
	
	private int[] occurencies;

	public int convertToInteger(String romanNum) {
		occurencies = new int[] {0,0,0,0,0,0,0};
		int value = 0;
		
		for (int i = romanNum.length() - 1; i >= 0; i--) {
			value += parseCharacterToValue(romanNum, i);
		}
		System.out.println(occurencies);
		return value;
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
			occurencies[0]++;
			return 1;
		}
		else if (romanNum == V) {
			occurencies[1]++;
			return 5;
		}
		else if (romanNum == X) {
			occurencies[2]++;
			return 10;
		}
		else if (romanNum == L) {
			occurencies[3]++;
			return 50;
		}
		else if (romanNum == C) {
			occurencies[4]++;
			return 100;
		}
		else if (romanNum == D) {
			occurencies[5]++;
			return 500;
		}
		else if (romanNum == M) {
			occurencies[6]++;
			return 1000;
		}
		return 0;
	}

}
