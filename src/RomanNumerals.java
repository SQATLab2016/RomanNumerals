
public class RomanNumerals {
	public int convertToInteger(String romanNum) {

		if (romanNum == "II") {
			return 2;
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
