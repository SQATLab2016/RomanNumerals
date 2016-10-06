
public class RomanNumerals {
	public int convertToInteger(String romanNum) {

		int result = 0;
		int currentDigit = 0;
		int previousDigit = 0;
		
    	for (int i = romanNum.length() - 1; i >= 0; i--) {
    		char romanDigit = romanNum.charAt(i);

    		if (romanDigit == 'I') {
        		currentDigit = 1;
       		} else if (romanDigit == 'V') {
       			currentDigit = 5;
       		} else if (romanDigit == 'X') {
       			currentDigit = 10;
        	} else if (romanDigit == 'L') {
        		currentDigit = 50;
       		} else if (romanDigit == 'C') {
       			currentDigit = 100;
       		} else if (romanDigit == 'D') {
       			currentDigit = 500;
       		} else if (romanDigit == 'M') {
       			currentDigit = 1000;
       		}
    		if (previousDigit > currentDigit) {
    			result -= currentDigit;
    		} else {
    			result += currentDigit;
    		}
    		previousDigit = currentDigit;
    	}
    	return result;
	}
}
