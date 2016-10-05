
public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		if (romanNum.length() > 1
				&& (romanNum.charAt(0) == 'V' || romanNum.charAt(0) == 'L' || romanNum.charAt(0) == 'D')) {
			return -1;
		}

		if (romanNum.length() < 4) {
			if(romanNum.length()>1 && romanNum.charAt(0)!=romanNum.charAt(1)){
				return getSingularValue(getStringCharAt(romanNum,1))-getSingularValue(getStringCharAt(romanNum, 0));
			}
			return romanNum.length() * getSingularValue(getStringCharAt(romanNum,0));
		}
		
		return -1;

	}
	
	private String getStringCharAt(String theString, int index){
		return String.valueOf(theString.charAt(index));
	}

	private int getSingularValue(String roman) {
		if (roman.equals("I")) {
			return 1;
		} else if (roman.equals("V")) {
			return 5;
		} else if (roman.equals("X")) {
			return 10;
		} else if (roman.equals("L")) {
			return 50;
		} else if (roman.equals("C")) {
			return 100;
		} else if (roman.equals("D")) {
			return 500;
		} else if (roman.equals("M")) {
			return 1000;
		}
		return -1;
	}
}
