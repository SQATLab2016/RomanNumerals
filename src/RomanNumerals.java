import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanNumerals {
	private Map<Character, Integer> numerals = new HashMap<Character, Integer>();
	{
		numerals.put('I', 1);
		numerals.put('V', 5);
		numerals.put('X', 10);
		numerals.put('L', 50);
		numerals.put('C', 100);
		numerals.put('D', 500);
		numerals.put('M', 1000);
	}
	
	public int convertToInteger(String romanNum) {
		String patternString = String.join("|",
				// repeat limit
				"IIII", "XXXX", "CCCC", "MMMM",
				
				// can't repeat these symbols
				"VV", "LL", "DD",
				
				// can't subtract from too big numbers
				"IL", "IC", "ID", "IM",
				"XD", "XM",
				
				// can't subtract more than once
				"IIV", "IIX",
				"XXL", "XXC",
				"CCD", "CCM",
				
				// can't subtract the '5' symbols
				"VX", "VL", "VC", "VD", "VM",
				"LC", "LD", "LM",
				"DM",
				
				// other than the allowed symbols
				"[^IVXLCDM]"
				);
		Pattern p = Pattern.compile(patternString);
		Matcher m = p.matcher(romanNum);
		if (m.find()) {
			throw new IllegalArgumentException();
		}
		
		int sum = 0;
		for (int i = 0; i < romanNum.length(); i++) {
			int number = numerals.get(romanNum.charAt(i));
			
			// last numeral
			if (i + 1 == romanNum.length()) {
				sum += number;
				break;
			}
			
			int nextNumber = numerals.get(romanNum.charAt(i + 1));

			// subtract, e.g. IV
			if (number < nextNumber) {
				sum -= number;
				continue;
			}
			
			if (number > nextNumber) {
				sum += number;
				continue;
			}
			
			// second last numeral
			if (i + 2 == romanNum.length()) {
				if (number == nextNumber) {
					sum += number + nextNumber;
					break;
				}
			}
			
			int thirdNumber = numerals.get(romanNum.charAt(i + 2));
			
			if (number == nextNumber && nextNumber == thirdNumber) {
				sum += number + nextNumber + thirdNumber;
				i++;
				i++;
				continue;
			}
		}
		
		return sum;
	}
}
