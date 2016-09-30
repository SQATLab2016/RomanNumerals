
public class RomanNumerals {
	

	
	public int convertToInteger(String romanNum) {
		if (romanNum.contains("I")==true){
		return 1;
		}else if (romanNum.contains("II") == true){
		return 2;
		}else if (romanNum.contains("III") == true){
		return 3;
		}else if (romanNum.contains("IV") == true){
		return 4;
		}
		return 0;
	}
}
