
public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		if (romanNum == null)
			throw new NumberFormatException("Null roman numeral.");
		
		if (romanNum.isEmpty())
			throw new NumberFormatException("Empty roman numeral.");
		
		int retValue = 0;
		int duplicates = 0;

		for (int i = 01; i < romanNum.length(); i++) {
			if (i > 0)
				duplicates = (romanNum.charAt(i - 1) == romanNum.charAt(i)) ? duplicates + 1 : 0;
			
			if (duplicates >= 1 && isOneTimeRepeatable(romanNum.charAt(i)))
				throw new NumberFormatException("Too many duplicate numeral characters.");
			
			if (duplicates >= 3 && isThreeTimesRepeatable(romanNum.charAt(i)))
				throw new NumberFormatException("Too many duplicate numeral characters.");
		}
		
		for (int i = romanNum.length() - 1; i >= 0; i--) {
			char c0 = romanNum.charAt(i);
			
			int subtrahend = 0;
			
			for (int j = i - 1; j >= 0; j--) {
				char c1 = romanNum.charAt(j);
				if (canBeSubtrahendElementaryValue(c1) && getElementaryValue(c0) > getElementaryValue(c1)) {
					int diff = getElementaryIndex(c0) - getElementaryIndex(c1);
					
					if (diff > 2)
						throw new NumberFormatException("Illegal subtraction format.");
					
					if (subtrahend != 0)
						throw new NumberFormatException("Illegal multiple subtractions.");
					
					subtrahend = getElementaryValue(c1);
					i--;
				} else if (!canBeSubtrahendElementaryValue(c1)) {
					if (getElementaryValue(c1) < getElementaryValue(c0))
						throw new NumberFormatException("Illegal subtraction format.");
					
					break;
				}
			}
			
			retValue += getElementaryValue(c0) - subtrahend;
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
