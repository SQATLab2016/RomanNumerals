import java.util.ArrayList;
import java.util.List;

public class RomanNumerals {
	
	private static final int I_VALUE = 1;
	private static final int V_VALUE = 5;
	private static final int X_VALUE = 10;
	private static final int L_VALUE = 50;
	private static final int C_VALUE = 100;
	private static final int D_VALUE = 500;
	private static final int M_VALUE = 1000;
	
	public int convertToInteger(String romanNum) {
		return getRomanNumberValue(romanNum);		
	}

	private int getRomanNumberValue(String romanNum) {
		int index = romanNum.length() - 1;
		int value = getRomanCharValue(getCharFromRomanNum(romanNum, index));
		for (int i = index - 1; i > 0; i--) {
			if (getRomanCharValue(getCharFromRomanNum(romanNum, i)) >= getRomanCharValue(getCharFromRomanNum(romanNum, i + 1))) {
				value += getRomanCharValue(getCharFromRomanNum(romanNum, i));
			}
			else
			{
				value -= getRomanCharValue(getCharFromRomanNum(romanNum, i));
			}
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
