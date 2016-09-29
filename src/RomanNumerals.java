
public class RomanNumerals {
	public int convertToInteger(String romanNum) throws RomanNumeralsException{
		for(char c : romanNum.toCharArray()) {
			if(c == 'I' || c == 'V' || c == 'X' || c == 'L' || c == 'C' || c == 'D' || c == 'M') {
				
			}
			else 
				throw new RomanNumeralsException("Roman Numeral to be converted isn't valid");
		
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
		char currentChar;
		int counter;
		for(int c = 0; c < romanNum.length();c++) {
			currentChar = romanNum.charAt(c);
			counter = 1;
			if(c+1 < romanNum.length()){
				while(romanNum.charAt(c+1) == currentChar) {
					if( c < romanNum.length()-1) {
						c++;
						counter++;
						if(counter > 3)
							throw new RomanNumeralsException("Roman Numeral to be converted isn't valid");
					}
				}
			}
		}
		
		return 0;
	}
}
