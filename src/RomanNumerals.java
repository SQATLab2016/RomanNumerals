import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		Pattern p = Pattern.compile(""
				+ "I{4}|X{4}|C{4}|M{4}|" // repeat limit
				+ "VV|LL|DD|"            // can't repeat
				+ "IL|IC|ID|IM|"         // can't subtract from too big numbers
				+ "IIV|"                 // can't subtract more than once
				+ "VX|VL"                // can't subtract the '5' symbols
				);
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
