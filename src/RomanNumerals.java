

public class RomanNumerals {
	public int convertToInteger(String romanNum) {		
		
		int length=romanNum.length();
		int i=0;
		int number = 0;
		while(i<length)
	    {
			
			if ((i+1)<length && valueOfLetter(romanNum.charAt(i)) < valueOfLetter(romanNum.charAt(i+1))){ //substract
				number += valueOfLetter(romanNum.charAt(i));
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
