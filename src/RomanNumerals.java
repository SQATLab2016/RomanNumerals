
public class RomanNumerals {
	
	int convertedInteger = 0;
	int decimal = 0;
	int lastNumeral = 0;
	
	
	public int convertToInteger(String romanNum) {
		
		String[] characters = new String[romanNum.length()];
		
		for (int i = romanNum.length() - 1; i >= 0; i--) {
			char currentRomanNumeral = romanNum.charAt(i);
			
			switch (currentRomanNumeral){
			case 'I':
				
				if (lastNumeral > 1) {
					
					convertedInteger = decimal - 1;
				}
				else {
					convertedInteger = 1 + decimal;
				}
				decimal = 1;
				lastNumeral = 1;
				break;
			}
				
			switch (currentRomanNumeral){
			case 'V':

				if (lastNumeral > 5) {
						
					convertedInteger = decimal - 5;
				}
				else {
					convertedInteger = 1 + 5;
				}
				decimal = 5;
				lastNumeral = 5;
				break;
				}
			}
			
		return convertedInteger;
		
	}
/*
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
		
	}*/
}
