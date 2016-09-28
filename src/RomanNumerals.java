
public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		int retValue = -1;
		
		int lastSub = 0;
		for (int i = 0; i < romanNum.length(); i++) {
			if (i == 0 && romanNum.length() > 1) {
				lastSub = 1;
				continue;
			}
			
			retValue += getElementaryValue(romanNum.charAt(i));
		}
		
		return retValue;
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
		default: return -1;
		}
	}
}
