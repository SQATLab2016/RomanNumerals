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
						break;
			
					case 'V':
						value = 5;
						break;
			
					case 'X':
						value = 10;
						break;
				
					case 'L':
						value = 50;
						break;
			
					case 'C':
						value = 100;
						break;
			
					case 'D':
						value = 500;
						break;
				
					case 'M':
						value = 1000;
						break;
					
					default:
						throw new IllegalArgumentException("Something went horribly wrong");
					
			}
			sum = sum + value;
		}
		
		return sum;
		
	}
}
