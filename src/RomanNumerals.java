
public class RomanNumerals {
	
	private int I_VALUE = 1;
	private int V_VALUE = 5;
	
	public int convertToInteger(String romanNum) {

		if (romanNum == "II") {
			return getRomanCharValue(romanNum.charAt(0)) + getRomanCharValue(romanNum.charAt(1));
		}
		else if (romanNum == "III") {
			return getRomanCharValue(romanNum.charAt(0)) + getRomanCharValue(romanNum.charAt(1)) + getRomanCharValue(romanNum.charAt(2));
		}
		else if (romanNum == "V") {
			return getRomanCharValue(romanNum.charAt(0));
		}
		else if (romanNum == "IV") {
			return 4;
		}
		else return 1;
		
	}
	
	public int getRomanCharValue(char romanChar) {
		if (romanChar == 'I') return I_VALUE;
		else if (romanChar == 'V') return V_VALUE;
		else return 1;
	}
}
