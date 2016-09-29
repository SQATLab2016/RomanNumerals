
public class RomanNumerals {
	public int convertToInteger(String romanNum) throws RomanNumeralsException{
		for(char c : romanNum.toCharArray()) {
			if(c != 'I' || c != 'V' || c != 'X' || c != 'L' || c != 'C' || c != 'D' || c != 'M') {
				throw new RomanNumeralsException("Roman Numeral to be converted isn't valid");
			}
		
		}
		
		if(romanNum.equals("I")) {
			return 1;		
		}
		else if (romanNum.equals("II")) {
			return 2;
		}
		else if (romanNum.equals("III")) {
			return 3;
		}
		
		for(int c = 0; c < romanNum.length();c++) {
			
		}
		
		return 0;
	}
}
