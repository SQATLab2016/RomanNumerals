
public class RomanNumerals {
	
	int convertedInteger = 0;
	
	
	
	public int convertToInteger(String romanNum) {
		
		String[] characters = new String[romanNum.length()];
		
		for (int i = 0; i < romanNum.length(); i++) {
		characters[i] = romanNum.substring(i, i+1);
		}
		convertTo(romanNum);
			
		return convertedInteger;
		
	}

	private void convertTo(String romanNum) {
		
		if (romanNum == "VII")
			convertedInteger += 7;
		
		else if (romanNum == "VI")
			convertedInteger += 6;
		
		else if (romanNum == "V")
			convertedInteger += 5;
		
		if (romanNum == "IV")
			convertedInteger += 4;
			
		else if (romanNum == "III")
			convertedInteger += 3;
		
		else if (romanNum == "II")
			convertedInteger += 2;
		
		else if (romanNum == "I")
			convertedInteger += 1;
		
	}
}
