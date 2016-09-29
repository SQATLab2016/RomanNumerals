
public class RomanNumerals {
	
	private int I_VALUE = 1;
	private int V_VALUE = 5;
	
	public int convertToInteger(String romanNum) {

		if (romanNum == "II") {
			return getRomanNumberValue(romanNum);
		}
		else if (romanNum == "III") {
			return getRomanNumberValue(romanNum);
		}
		else if (romanNum == "V") {
			return getRomanCharValue(getCharFromRomanNum(romanNum, 0));
		}
		else if (romanNum == "IV") {
			return getRomanCharValue(romanNum.charAt(1)) - getRomanCharValue(getCharFromRomanNum(romanNum, 0));
		}
		else return 1;
		
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
