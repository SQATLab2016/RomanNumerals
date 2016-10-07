
public class RomanNumerals {
	
	int convertedInteger = 0;
	int decimal = 0;
	int lastNumeral = 0;
	int lastV = 0;
	int numOfInts = 0;
	
	
	public int convertToInteger(String romanNum) {
		
		String[] characters = new String[romanNum.length()];
		
		for (int i = romanNum.length() - 1; i >= 0; i--) {
			char currentRomanNumeral = romanNum.charAt(i);
			
			switch (currentRomanNumeral){
			case 'I':
				convertedInteger += 1;
			break;
			
			case 'V':
				convertedInteger += 5;
			break;
			
			case 'X':
				convertedInteger += 10;
			break;
				
			case 'L':
				convertedInteger += 50;
			break;
			
			case 'C':
				convertedInteger += 100;
			break;
			
			case 'D':
				convertedInteger += 500;
			break;
			}
		}	
		if (romanNum.contains("IV")){
			
			convertedInteger -= 2;
		}
		if (romanNum.contains("XL")){
			
			convertedInteger -= 10;
		}
		if (romanNum.contains("XC")){
			
			convertedInteger -= 20;
		}
		if (romanNum.contains("CD")){
			
			convertedInteger -= 200;
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
