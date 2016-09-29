import java.util.HashSet;
import java.util.Set;

public class RomanNumerals {
	
	public int convertToInteger(String romanNum) {
		
		if(romanNum.isEmpty()) {
			return 0;
		}
		
		int sum = 0;
		int counter = 0;
		int lastValue = 0;
		int value = 0;	
		
		for(int i = 0; i < romanNum.length(); i++) {
			char roman = romanNum.charAt(i);
				
			
			
								
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

			
			if(i == 0) {
				lastValue = value;
			}
			
			if(lastValue != value) {
				counter = 0;
			}
						
			if((value == 1 || value == 10 
					|| value == 100 || value == 1000) 
					&& counter == 3 ) {
						throw new IllegalArgumentException("This roman number can't be repeated over three times in a row");
					}
			
			if((value == 5 || value == 50 || value == 500) 
					&& lastValue == value) {
				throw new IllegalArgumentException("This roman number can't be repeated");
			}
			
			if(((value == 5 || value == 10) && lastValue == 1)) {
				sum = sum + (value - lastValue);
			}

			else {
			sum = sum + value;
			}
			counter++;
			
			System.out.println("Sum: " + sum);
			System.out.println("Value: " + value);
			System.out.println("Counter: " + counter);
			
		}
		
		return sum;
		
	}
}
