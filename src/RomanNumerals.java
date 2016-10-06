import java.util.ArrayList;
import java.util.List;

public class RomanNumerals {
	private List<String> subStrings = new ArrayList<String>();
	private List<Integer> subStringValues = new ArrayList<Integer>();
	public int convertToInteger(String romanNum) throws RomanNumeralsException{
		for(char c : romanNum.toCharArray()) {
			if(c == 'I' || c == 'V' || c == 'X' || c == 'L' || c == 'C' || c == 'D' || c == 'M') {
				
			}
			else 
				throw new RomanNumeralsException("Roman Numeral to be converted isn't valid");
		
		}
		
		char currentChar;
		int counter = 0, oldPos = 0;
		for(int c = 0; c < romanNum.length();c++) {
			currentChar = romanNum.charAt(c);
			counter = 1;
			oldPos = c;
			if(c+counter < romanNum.length()){
				while(romanNum.charAt(c+counter) == currentChar) {
					if(currentChar == 'V' || currentChar == 'L' || currentChar == 'D')
						throw new RomanNumeralsException("Roman Numeral to be converted isn't valid");
					if( c < romanNum.length()) {
						counter++;
						if(counter > 3)
							throw new RomanNumeralsException("Roman Numeral to be converted isn't valid");
					}
					if(c+counter >= romanNum.length())
						break;
				}
			}
			if(counter == 1)
				subStrings.add(romanNum.substring(oldPos, oldPos+1));
			else 
				subStrings.add(romanNum.substring(oldPos, oldPos+counter-1));	
			counter = 1;
		}
		
		for(String s: subStrings) {
			switch(s) {
			case "I": subStringValues.add(1);
			break;
			case "II": subStringValues.add(2);
			break;
			case "III": subStringValues.add(3);
			break;
			case "V": subStringValues.add(5);
			break;
			case "X": subStringValues.add(10);
			break;
			case "L": subStringValues.add(50);
			break;
			case "C": subStringValues.add(100);
			break;
			case "D": subStringValues.add(500);
			break;
			default: subStringValues.add(0);
			}
		}
		if(subStringValues.size() == 1)
			return subStringValues.get(0);
		else if(subStringValues.get(0)<subStringValues.get(1))
			return subStringValues.get(1)-subStringValues.get(0);
		else
			return subStringValues.get(1)+subStringValues.get(0);
	}
}
