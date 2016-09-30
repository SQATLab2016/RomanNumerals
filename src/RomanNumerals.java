
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
			return 6;
		}else if (romanNum == "VII"){
			return 7;
		}else if (romanNum == "VIII"){
			return 8;
		}else if (romanNum == "IX"){
			return 9;
		}else if (romanNum == "X"){
			return convertSingleRoman(romanNum);
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
			return 70;
		}else if (romanNum == "LXXX"){
			return 80;
		}else if (romanNum == "XC"){
			return 90;
		}else if (romanNum == "C"){
			return 100;
		}else if (romanNum == "CC"){
			return 200;
		}else if (romanNum == "CCC"){
			return 300;
		}else if (romanNum == "CD"){
			return 400;
		}else if (romanNum == "D"){
			return 500;
		}else if (romanNum == "DC"){
			return 600;
		}else if (romanNum == "DCC"){
			return 700;
		}else if (romanNum == "DCCC"){
			return 800;
		}else if (romanNum == "CM"){
			return 900;
		}else if (romanNum == "M"){
			return 1000;
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
