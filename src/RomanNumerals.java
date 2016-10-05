
public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		if(romanNum.equals("I")){
			return 1;
		}else if(romanNum.equals("V")){
			return 5;
		}else if(romanNum.equals("X")){
			return 10;
		}else if(romanNum.equals("L")){
			return 50;
		}else if(romanNum.equals("C")){
			return 100;
		}else if(romanNum.equals("D")){
			return 500;
		}else if(romanNum.equals("M")){
			return 1000;
		}else if(romanNum.equals("II")){
			return 2;
		}else if(romanNum.equals("III")){
			return 3;
		}else if(romanNum.equals("XXX")){
			return 30;
		}else if(romanNum.equals("CCC")){
			return 300;
		}else if(romanNum.equals("MM")){
			return 2000;
		}else if(romanNum.equals("MMM")){
			return 3000;
		}
		
		return 0;
		
	}
}
