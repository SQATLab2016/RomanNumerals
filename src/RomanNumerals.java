
public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		
		// total num
		// -> return this
		int num = 0;
		
		// to avoid input errors 
		// just upper case everything
		romanNum = romanNum.toUpperCase();
		
		// save the string to character array.
		char[] charArr = romanNum.toCharArray();
		
		// loop through the whole array.
		for(int i = 0; i < romanNum.length(); i++) {
		
			// current character
			char c = charArr[i];
			
			switch(c) {
			
			// 1
			case 'I':
				try {
					char next_c = charArr[i+1];
					
					if(next_c == 'V' || next_c == 'X') {
						num -= 1;
					} else {
						num += 1;
					}
				} catch (ArrayIndexOutOfBoundsException e) {
					num += 1;
				}
				break;
			
			// 10
			case 'X':
				try {
					char next_c = charArr[i+1];
					
					if(next_c == 'L' || next_c == 'C') {
						num -= 10;
					} else {
						num += 10;
					}
				} catch (ArrayIndexOutOfBoundsException e) {
					num += 10;
				}
				break;
				
			// 100
			case 'C':
				try {
					char next_c = charArr[i+1];
					
					if(next_c == 'D' || next_c == 'M') {
						num -= 100;
					} else {
						num += 100;
					}
				} catch (ArrayIndexOutOfBoundsException e) {
					num += 100;
				}
				break;
				
			// 1000
			case 'M':
				num += 1000;
				break;
				
			// 5
			case 'V':
				num += 5;
				break;
			
			// 50
			case 'L':
				num += 50;
				break;
				
			// 500
			case 'D':
				num += 500;
				break;
			
			// invalid
			default:
				break;
			}
		}
		return num;
	}
}
