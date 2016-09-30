
public class RomanNumerals {
	

	
	public int convertToInteger(String romanNum) {
		if (romanNum == "I"){
		return 1;
		}else if (romanNum == "IV"){
		return 4;
		}else if (romanNum == "V"){
		return 5;
		}
		return 0;
	}
}
