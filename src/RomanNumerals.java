
public class RomanNumerals {
	

	
	public int convertToInteger(String romanNum) {
		if (romanNum == "I"){
			return 1;
		}else if (romanNum == "II") {
			return 2;
		}else if (romanNum.contains("III") == true){
		return 3;
		}else if (romanNum.contains("IV") == true){
		return 4;
		}
		return 0;
	}
}
