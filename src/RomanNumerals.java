
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
		}else if (romanNum == "XX"){
			return 20;
		}else if (romanNum == "XXX"){
			return 30;
		}else if (romanNum == "XL"){
			return 40;
		}else if (romanNum == "L"){
			return 50;
		}else if (romanNum == "LX"){
			return 60;
		}else if (romanNum == "LXX"){
			return 70
		}
		return 0;
	}
}
