
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
		}else if (romanNum == "V"){
			return 5;
		}else if (romanNum == "VI"){
			return 6;
		}else if (romanNum == "VII"){
			return 7;
		}else if (romanNum == "VIII"){
			return 8;
		}else if (romanNum == "IX"){
			return 9;
		}else if (romanNum == "X"){
			return 10;
		}
		return 0;
	}
}
