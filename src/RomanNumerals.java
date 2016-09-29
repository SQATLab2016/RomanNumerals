
public class RomanNumerals {
	
	private int I_VALUE = 1;
	private int V_VALUE = 5;
	private int X_VALUE = 10;
	
	public int convertToInteger(String romanNum) {

		if (romanNum == "IV") {
			return getRomanCharValue(getCharFromRomanNum(romanNum, 1)) - getRomanCharValue(getCharFromRomanNum(romanNum, 0));
		}
		else return getRomanNumberValue(romanNum);
		
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
		else return 1;
	}
}
