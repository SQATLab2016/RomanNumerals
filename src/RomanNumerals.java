import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanNumerals {
	private enum Numeral {
		I(1),
		V(5),
		X(10),
		L(50),
		C(100),
		D(500),
		M(1000);
		
		private int number;
		
		private Numeral(int number) {
			this.number = number;
		}
		
		public static int getValue(char numeral) {
			return Numeral.valueOf(String.valueOf(numeral)).number;
		}
	}
	
	private Map<Character, Integer> numerals = new HashMap<Character, Integer>();
	numerals.put('I', 1);
	
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
			char numeral = romanNum.charAt(i);
			int number = Numeral.getValue(numeral);
			
			// last numeral
			if (i + 1 == romanNum.length()) {
				sum += number;
				break;
			}
			
			char nextNumeral = romanNum.charAt(i + 1);
			int nextNumber = Numeral.getValue(nextNumeral);

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
			
			char thirdNumeral = romanNum.charAt(i + 1);
			int thirdNumber = Numeral.getValue(thirdNumeral);
			
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
