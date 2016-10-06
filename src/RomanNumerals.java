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

	private int getSubstractiveRomanNumberValue(String romanNum) {
		int value = getRomanCharValue(getCharFromRomanNum(romanNum, romanNum.length() - 1));
		for (int i = romanNum.length() - 2; i >= 0; i--) {
			value -= getRomanCharValue(getCharFromRomanNum(romanNum, i));
		}
		return value;
	}

	private boolean hasSubstractiveNumber(String romanNum) {
		return romanNum == "IV";
	}

	private int getRomanNumberValue(String romanNum) {
		int value = 0;
		for (int i = romanNum.length() - 1; i > 0; i--) {
			if (getRomanCharValue(getCharFromRomanNum(romanNum, i-1)) >= getRomanCharValue(getCharFromRomanNum(romanNum, i))) {
				value += getRomanCharValue(getCharFromRomanNum(romanNum, i));
			}
			else
			{
				value -= getRomanCharValue(getCharFromRomanNum(romanNum, i));
			}
		}
		
		value += getRomanCharValue(getCharFromRomanNum(romanNum, 0));
		return value;
	}

	private char getCharFromRomanNum(String romanNum, int index) {
		return romanNum.charAt(index);
	}
	
	private List<String> parseRomanNumStringToTokens(String romanNum) {
		List<String> tokens = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		char prevChar;
		for(int i = 0; i < romanNum.length(); i++) {
			prevChar = romanNum.charAt(i);
			if(prevChar == romanNum.charAt(i)) {
				sb.append(prevChar);
				continue;
			}
			else {
				sb.append(romanNum.charAt(i));
				tokens.add(sb.toString());
				sb.setLength(0);
			}
		}
		return tokens;
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
