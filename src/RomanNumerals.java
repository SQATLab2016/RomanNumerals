
public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		int retValue = 0;
		
		int lastSub = 0;
		
		for (int i = 0; i < romanNum.length(); i++) {
			if ((i + 1 < romanNum.length()) &&
				canBeSubtrahendElementaryValue(romanNum.charAt(i)) &&
				getElementaryValue(romanNum.charAt(i)) < getElementaryValue(romanNum.charAt(i + 1))) {
				lastSub = getElementaryValue(romanNum.charAt(i));
				
			} else {
				retValue += getElementaryValue(romanNum.charAt(i)) - lastSub;
				lastSub = 0;
			}
		}
		
		return retValue;
	}
	
	private boolean canBeSubtrahendElementaryValue(char character) {
		switch(character) {
		case 'I':
		case 'X':
		case 'C':
			return true;
		}
		
		return false;
	}
	
	private int getElementaryValue(char character) {
		switch(character) {
		case 'I': return 1;
		case 'V': return 5;
		case 'X': return 10;
		case 'L': return 50;
		case 'C': return 100;
		case 'D': return 500;
		case 'M': return 1000;
		default: return 0;
		}
	}
}
