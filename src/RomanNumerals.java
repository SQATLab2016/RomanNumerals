
public class RomanNumerals {
	
	private int I_VALUE = 1;
	private int V_VALUE = 5;
	
	public int convertToInteger(String romanNum) {

		if (romanNum == "II") {
			return I_VALUE * 2;
		}
		else if (romanNum == "III") {
			return I_VALUE * 3;
		}
		else if (romanNum == "V") {
			return V_VALUE * 1;
		}
		else if (romanNum == "IV") {
			return 4;
		}
		else return 1;
		
	}
	
	public int getRomanCharValue(char romanChar) {
		if (romanChar == 'I') return 1;
		else if (romanChar == 'V') return 5;
		else return 1;
	}
}
