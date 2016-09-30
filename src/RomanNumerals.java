
public class RomanNumerals {
	

	
	public int convertToInteger(String romanNum) {
		if (romanNum == "I"){
			return convertSingleRoman(romanNum);
		}else if (romanNum == "II") {
			return 1 + 1;
		}else if (romanNum == "III"){
			return 1 + 1 + 1;
		}else if (romanNum ==  "IV"){
			return 5 - 1;
		}else if (romanNum == "V"){
			return convertSingleRoman(romanNum);
		}else if (romanNum == "VI"){
			return 5 + 1;
		}else if (romanNum == "VII"){
			return 5 + 1 + 1;
		}else if (romanNum == "VIII"){
			return 5 + 1 + 1 + 1;
		}else if (romanNum == "IX"){
			return 10 - 1;
		}else if (romanNum == "X"){
			return convertSingleRoman(romanNum);
		}else if (romanNum == "XX"){
			return 10 + 10;
		}else if (romanNum == "XXX"){
			return 10 + 10 + 10;
		}else if (romanNum == "XL"){
			return 50 - 10;
		}else if (romanNum == "L"){
			return convertSingleRoman(romanNum);
		}else if (romanNum == "LX"){
			return 50 + 10;
		}else if (romanNum == "LXX"){
			return 50 + 10 + 10;
		}else if (romanNum == "LXXX"){
			return 50 + 10 + 10 + 10;
		}else if (romanNum == "XC"){
			return 100 - 10;
		}else if (romanNum == "C"){
			return convertSingleRoman(romanNum);
		}else if (romanNum == "CC"){
			return 100 + 100;
		}else if (romanNum == "CCC"){
			return 100 + 100 + 100;
		}else if (romanNum == "CD"){
			return 500 - 100;
		}else if (romanNum == "D"){
			return convertSingleRoman(romanNum);
		}else if (romanNum == "DC"){
			return 500 + 100;
		}else if (romanNum == "DCC"){
			return 500 + 100 + 100;
		}else if (romanNum == "DCCC"){
			return 500 + 100 + 100 + 100;
		}else if (romanNum == "CM"){
			return 900;
		}else if (romanNum == "M"){
			return convertSingleRoman(romanNum);
		}
		return 0;
	}
	
	private int convertSingleRoman(String roman) {
		if (roman == "I")
			return 1;
		else if (roman == "V")
			return 5;
		else if (roman == "X")
			return 10;
		else if (roman == "L")
			return 50;
		else if (roman == "C")
			return 100;
		else if (roman == "D")
			return 500;
		else if (roman == "M")
			return 1000;
		else
			return 0;
				
	}
	
}
