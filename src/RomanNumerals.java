
public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		if (romanNum == null) {
			throw new NumberFormatException("Null roman numeral.");
		}
		
		if (romanNum.isEmpty()) {
			throw new NumberFormatException("Empty roman numeral.");
		}
		
		int retValue = 0;
		int lastSub = 0;
		int duplicates = 0;
		
		for (int i = 0; i < romanNum.length(); i++) {
			if (i > 0) {
				if (romanNum.charAt(i - 1) == romanNum.charAt(i)) {
					++duplicates;
				} else {
					duplicates = 0;
				}
			}

			if (duplicates >= 1 && isOneTimeRepeatable(romanNum.charAt(i))) {
				throw new NumberFormatException("Too many duplicate numeral characters.");
			}
			
			if (duplicates >= 3 && isThreeTimesRepeatable(romanNum.charAt(i))) {
				throw new NumberFormatException("Too many duplicate numeral characters.");
			}
			
			if (lastSub == getElementaryValue(romanNum.charAt(i))) {
				throw new NumberFormatException("Illegal multiple subtractions");
			}
			
			if ((i + 1 < romanNum.length()) &&
				canBeSubtrahendElementaryValue(romanNum.charAt(i)) &&
				getElementaryValue(romanNum.charAt(i)) < getElementaryValue(romanNum.charAt(i + 1))) {
				
				int diff = getElementaryIndex(romanNum.charAt(i + 1))
						- getElementaryIndex(romanNum.charAt(i));
				
				if (diff > 2) {
					throw new NumberFormatException("Illegal subtraction format");
				}
				
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

	private boolean isOneTimeRepeatable(char character) {
		switch(character) {
		case 'V':
		case 'L':
		case 'D':
			return true;
		}
		
		return false;
		
	}
	
	private boolean isThreeTimesRepeatable(char character) {
		switch(character) {
		case 'I':
		case 'X':
		case 'C':
		case 'M':
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
		default:
			throw new NumberFormatException("Invalid numeral character.");
		}
	}
	
	private int getElementaryIndex(char character) {
		switch(character) {
		case 'I': return 0;
		case 'V': return 1;
		case 'X': return 2;
		case 'L': return 3;
		case 'C': return 4;
		case 'D': return 5;
		case 'M': return 6;
		default:
			throw new NumberFormatException("Invalid numeral character.");
		}
	}
}
