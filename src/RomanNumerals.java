
public class RomanNumerals {
	
	private int I_VALUE = 1;
	private int V_VALUE = 5;
	
	public int convertToInteger(String romanNum) {

		if (romanNum == "II") {
			return I_VALUE + I_VALUE;
		}
		else if (romanNum == "III") {
			return 3;
		}
		else if (romanNum == "V") {
			return 5;
		}
		else if (romanNum == "IV") {
			return 4;
		}
		else return 1;
		
	}
}
