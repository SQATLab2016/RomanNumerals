

public class RomanNumerals {
	public int convertToInteger(String romanNum) throws RomanNumeralsException {		
		
		int length=romanNum.length();
		int i=0;
		int number = 0;
		
		if (romanNum.indexOf("IIII") >= 0)
			throw new RomanNumeralsException("More than three I's in row is not accepted.");
		else if (romanNum.indexOf("XXXX") >= 0)
			throw new RomanNumeralsException("More than three X's in row is not accepted.");
		else if (romanNum.indexOf("CCCC") >= 0)
			throw new RomanNumeralsException("More than three C's in row is not accepted.");
		else if (romanNum.indexOf("MMMM") >= 0)
			throw new RomanNumeralsException("More than three M's in row is not accepted.");
		
		if (romanNum.indexOf("VV") >= 0)
			throw new RomanNumeralsException("More than two V's in row is not accepted.");
		else if (romanNum.indexOf("LL") >= 0)
			throw new RomanNumeralsException("More than two L's in row is not accepted.");
		else if (romanNum.indexOf("DD") >= 0)
			throw new RomanNumeralsException("More than two D's in row is not accepted.");
		
		// todo: two or more smaller before big results exception
		
		while(i<length)
	    {
			
			if ((i+1)<length && valueOfLetter(romanNum.charAt(i)) < valueOfLetter(romanNum.charAt(i+1))){
				number += valueOfLetter(romanNum.charAt(i+1)) - valueOfLetter(romanNum.charAt(i));
				i+=2;
			}
			else {
				number += valueOfLetter(romanNum.charAt(i));
				i++;
			}
	    }
		
		return number;
	}
	
	private int valueOfLetter(Character  letter) {
		int number = 0;
		
		switch (letter) {
		case 'I':
			number = 1;
            break;
        case 'V':
        	number = 5;
            break;
        case 'X':
        	number = 10;
            break;
        case 'L':
        	number = 50;
            break;
        case 'C':
        	number = 100;
            break;  
        case 'D':
        	number = 500;
            break;   
        case 'M':
        	number = 1000;
            break;  
		}
		
		return number;
	}
}
