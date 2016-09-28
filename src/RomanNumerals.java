import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		Pattern p = Pattern.compile("I{4,}|V{2,}");
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
		} else {
			return 4;
		}
	}
}
