import java.util.HashSet;
import java.util.Set;

public class RomanNumerals {
	
	public int convertToInteger(String romanNum) {
		
		if(romanNum.isEmpty()) {
			return 0;
		}
		
		int sum = 0;
		
		for(int i = 0; i < romanNum.length(); i++) {
			char roman = romanNum.charAt(i);
			
			int value = 0;
			
			switch(roman) {
			
			case 'I':
				value = 1;
			
			case 'V':
				value = 5;
			
			case 'X':
				value = 10;
				
			case 'L':
				value = 50;
			
			case 'C':
				value = 100;
			
			case 'D':
				value = 500;
				
			case 'M':
				value = 1000;
				
				
			}
			sum = sum + value;
		}
		
		return sum;
		
	}
}
