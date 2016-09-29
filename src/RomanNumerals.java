
public class RomanNumerals {
	
	private static final int I_VALUE = 1;
	private static final int V_VALUE = 5;
	private static final int X_VALUE = 10;
	private static final int L_VALUE = 50;
	private static final int C_VALUE = 100;
	private static final int D_VALUE = 500;
	private static final int M_VALUE = 1000;
	
	public int convertToInteger(String romanNum) {

		if (hasSubstractiveNumber(romanNum)) {
			return getSubstractiveRomanNumberValue(romanNum);
		}
		else if (romanNum == "IX") {
			return getRomanCharValue(getCharFromRomanNum(romanNum, 2)) - getRomanCharValue(getCharFromRomanNum(romanNum, 1)) - getRomanCharValue(getCharFromRomanNum(romanNum, 0));
		}
		else return getRomanNumberValue(romanNum);
		
	}

	private int getSubstractiveRomanNumberValue(String romanNum) {
		int value = getRomanCharValue(getCharFromRomanNum(romanNum, romanNum.length() - 1));
		for (int i = romanNum.length() - 2; i >= 0; i--) {
			value -= getRomanCharValue(getCharFromRomanNum(romanNum, i));
		}
		return value;
	}

	private boolean hasSubstractiveNumber(String romanNum) {
		if (getCharFromRomanNum(romanNum, romanNum.length() - 1) != 'I') {
			return true;
		}
		else return false;
	}

	private int getRomanNumberValue(String romanNum) {
		int value = 0;
		for (int i = 0; i < romanNum.length(); i++) {
			value += getRomanCharValue(getCharFromRomanNum(romanNum, i));
		}
		return value;
	}

	private char getCharFromRomanNum(String romanNum, int index) {
		return romanNum.charAt(index);
	}
	
	public int getRomanCharValue(char romanChar) {
		if (romanChar == 'I') return I_VALUE;
		else if (romanChar == 'V') return V_VALUE;
		else if (romanChar == 'X') return X_VALUE;
		else if (romanChar == 'L') return L_VALUE;
		else if (romanChar == 'C') return C_VALUE;
		else if (romanChar == 'D') return D_VALUE;
		else if (romanChar == 'M') return M_VALUE;
		else return 1;
	}
}
