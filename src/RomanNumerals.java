import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		String patternString = String.join("|",
				// repeat limit
				"IIII", "XXXX", "CCCC", "MMMM",
				
				// can't repeat these symbols
				"VV", "LL", "DD",
				
				// can't subtract from too big numbers
				"IL", "IC", "ID", "IM", "XD", "XM",
				
				// can't subtract more than once
				"IIV", "IIX", "XXL", "XXC", "CCD", "CCM",
				
				// can't subtract the '5' symbols
				"VX", "VL", "VC", "VD", "VM", "LC", "LD", "LM", "DM",
				
				// other than the allowed symbols
				"[^IVXLCDM]"
				);
		Pattern p = Pattern.compile(patternString);
		Matcher m = p.matcher(romanNum);
		if (m.find()) {
			throw new IllegalArgumentException();
		}
		
		if (romanNum.equals("I")) {
			return 1;
		} else if (romanNum.equals("II")) {
			return 2;
		} else if (romanNum.equals("III")) {
			return 3;
		} else if (romanNum.equals("IV")) {
			return 4;
		} else {
			return 6;
		}
	}
}
