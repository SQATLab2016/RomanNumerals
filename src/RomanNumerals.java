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
			
			subStrings.add(romanNum.substring(oldPos, oldPos+1));
			if(counter>1 && currentChar == 'V' || currentChar == 'L' || currentChar == 'D')
				c += counter-1;
			counter = 1;
		}
		System.out.println(subStrings.toString());
		
		for(String s: subStrings) {
			switch(s) {
			case "I": subStringValues.add(1);
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
			case "M": subStringValues.add(1000);
			break;
			default: subStringValues.add(0);
			}
		}
		if(subStringValues.size() == 1)
			return subStringValues.get(0).intValue();
		else {
			int sum = 0;
			int size = subStringValues.size();
			for(int i = 0;i<size-1;i++) {
				if(size-i > 2 && subStringValues.get(i).intValue()==subStringValues.get(i+1).intValue()) {
					if(subStringValues.get(i).intValue()==subStringValues.get(i+1).intValue() && subStringValues.get(i).intValue()==subStringValues.get(i+2).intValue()) {
						sum += subStringValues.get(i).intValue() + subStringValues.get(i+1).intValue() + subStringValues.get(i+2).intValue();
						i++;
						i++;
					}
				}
				else if(subStringValues.get(i).intValue()==subStringValues.get(i+1).intValue()) {
					sum += subStringValues.get(i).intValue() + subStringValues.get(i+1).intValue();
					i++;
				}
				else if(subStringValues.get(i)<subStringValues.get(i+1)) {
					if(subStringValues.get(i)==5)
						throw new RomanNumeralsException("Roman Numeral to be converted isn't valid");
					sum += subStringValues.get(i+1)-subStringValues.get(i);
					i++;
				}
				else if(subStringValues.get(i)>subStringValues.get(i+1)){
					if(subStringValues.get(i+1)<subStringValues.get(i+2)) {
						sum += subStringValues.get(i+2)-subStringValues.get(i+1)+subStringValues.get(i);
						System.out.println("joo");
						i++;
					}
					else
						sum += subStringValues.get(1)+subStringValues.get(0);
					i++;
				}
			}
			return sum;
		}
	}
}
