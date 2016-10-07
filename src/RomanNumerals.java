import java.util.Scanner;

public class RomanNumerals {
	
	public String romanNum;
	public int arabicNum;

	
	public static void main(String [ ] args)
	{
		RomanNumerals rm = new RomanNumerals();
		rm.readRomanNumeralLetterByLetter();
	}
	
	
	public int convertToInteger(String romanNum) {
		// To be Implemented
		return 0;
		
	}

	public String getRomanNumeral() {
		
		return "MMX";
	}

	public int returnArabicNumber() {
		
		return 1;
	}

	public int convertEachRomanNumToArabicNum(String letter) {
		
		//romanNum = getRomanNumeral();
		if(letter.equals("I")){
			return 1;
		} else if (letter.equals("V")){
			return 5;
		} else if (letter.equals("X")){
			return 10;
		} else if (letter.equals("L")){
			return 50;
		} else if (letter.equals("C")){
			return 100;
		} else if (letter.equals("D")){
			return 500;
		} else if (letter.equals("M")){
			return 1000;
		} else {
			return 0;
		}
	}
	
	public int readRomanNumeralLetterByLetter(){
		
		int addValue = 0;
		String romanNumeral = getRomanNumeral();
		for(int i = 0; i <romanNumeral.length(); i++){
			if(Character.toString(romanNumeral.charAt(i)).equals("I") && Character.toString(romanNumeral.charAt(i = i+1)).equals("V")){
				addValue = 4;
			} else if (Character.toString(romanNumeral.charAt(i)).equals("I") && Character.toString(romanNumeral.charAt(i = i+1)).equals("X")){
				addValue = 9;
			} else if (Character.toString(romanNumeral.charAt(i)).equals("X") && Character.toString(romanNumeral.charAt(i = i+1)).equals("L")){
				addValue = 40;
			} else if (Character.toString(romanNumeral.charAt(i)).equals("X") && Character.toString(romanNumeral.charAt(i = i+1)).equals("C")){
				addValue = 90;
			} else if (Character.toString(romanNumeral.charAt(i)).equals("C") && Character.toString(romanNumeral.charAt(i = i+1)).equals("D")){
				addValue = 400;
			} else if (Character.toString(romanNumeral.charAt(i)).equals("C") && Character.toString(romanNumeral.charAt(i = i+1)).equals("M")){
				addValue = 900;
			}else{
			addValue = convertEachRomanNumToArabicNum(Character.toString(romanNumeral.charAt(i)));
			}
			arabicNum = arabicNum + addValue;
		}
		return arabicNum;
	}
}



	
	
	

