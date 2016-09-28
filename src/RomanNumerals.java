
public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		if(romanNum.equals("V"))
			return 5;
		else if (romanNum.equals("X"))
			return 10;
		else if (romanNum.equals("L"))
			return 50;
		else if (romanNum.equals("C"))
			return 100;
		else if (romanNum.equals("D"))
			return 500;
		else if (romanNum.equals("M"))
			return 1000;
		
		return 1;
	}
}
