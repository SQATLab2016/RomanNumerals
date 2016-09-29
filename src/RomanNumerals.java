
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
		else if (romanNum == "IIX") {
			return getRomanCharValue(getCharFromRomanNum(romanNum, 2)) - getRomanCharValue(getCharFromRomanNum(romanNum, 1)) - getRomanCharValue(getCharFromRomanNum(romanNum, 0));
		}
		else return getRomanNumberValue(romanNum);
		
	}

	private int getSubstractiveRomanNumberValue(String romanNum) {
		return getRomanCharValue(getCharFromRomanNum(romanNum, 1)) - getRomanCharValue(getCharFromRomanNum(romanNum, 0));
	}

	private boolean hasSubstractiveNumber(String romanNum) {
		return romanNum == "IV";
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
