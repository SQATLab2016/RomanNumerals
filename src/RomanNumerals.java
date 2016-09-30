
public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		
		int decimalNum = 0;
		
		// Convert romanNums to upper case, if they are lower case
		String romanNum = romanNum.toUpperCase();
		
		for (int x romanNum.length() - 1; x >= 0; x--) {
			char convertToDecimalNum = romanNum.charAt(x);
			
			switch (convertToDecimalNum) {
			
			case 'I':
				decimalNum = 1;
				break;
				
			case 'V':
				decimalNum = 5;
				break;
				
			case 'X':
				decimalNum = 10;
				break;
			
			}
		}
		
		return decimalNum;
		
	}
}
