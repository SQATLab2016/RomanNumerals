
public class RomanNumerals {
	

	
	public int convertToInteger(String romanNum) {
		if (romanNum == "I"){
			return 1;
		}else if (romanNum == "II") {
			return 2;
		}else if (romanNum == "III"){
			return 3;
		}else if (romanNum ==  "IV"){
			return 4;
		}
		return 0;
	}
}
