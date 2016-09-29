
public class RomanNumerals {
	public RomanNumerals(){
		// TODO Auto-generated constructor stub
		//Tables for roman numerals and numbers should be added here
	}

	public int convertToInteger(String romanNum) throws RomanNumeralsException {
		// To be Implemented
		//Test for too many "I, X, C, M" returns true if too many
		if(testRepeatedTooManyTimes(romanNum)) throw new RomanNumeralsException();
		if(testSameRepeatedTooManyTimes(romanNum)) throw new RomanNumeralsException();
		if(romanNum == "IIII") throw new RomanNumeralsException();
		
		//If every test pass then we can decode the roman to arabic
		int number = decode(romanNum);
		return number;
	}
	
	//Roman numerals to decimal
	//Source http://stackoverflow.com/questions/20313254/roman-numeral-to-number-conversion
	private static int decodeSingle(char letter) {
        switch (letter) {
            case 'M':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X':
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
            default:
                return 0;
        }
    }
	
	public static int decode(String roman) {
        int result = 0;
        String uRoman = roman.toUpperCase(); //case-insensitive
        for (int i = 0; i < uRoman.length() - 1; i++) {//loop over all but the last character
            if (decodeSingle(uRoman.charAt(i)) < decodeSingle(uRoman.charAt(i + 1))) {
                result -= decodeSingle(uRoman.charAt(i));
            } else {
                result += decodeSingle(uRoman.charAt(i));
            }
        }
        result += decodeSingle(uRoman.charAt(uRoman.length() - 1));
        return result;
    }
	
	
	
	//Return true if one of the letters is repeated too many times
	public boolean testRepeatedTooManyTimes(String roman){
		//Test if there is a possibility for too many of the same number
		if(roman.length() < 4 ) return false;
		
		//Test the obvious
		if(roman == "IIII" || roman == "XXXX" || roman == "CCCC" || roman == "MMMM") return true;
		
		
		return false;
	}
	
	//Return true if letter appears too many times
	public boolean testSameRepeatedTooManyTimes(String romanNum){
		//Test if the romanNumber got any letters that cant exists more than once
		if(!(romanNum.contains("V") || romanNum.contains("L") || romanNum.contains("D"))) return false;
		
		//Lets count the different letters on the romanNum
		int V_counter = 0;
		int L_counter = 0;
		int D_counter = 0;
		
		for(int i=0; i<romanNum.length(); i++){
			if(romanNum.charAt(i) == 'V') V_counter++;
			if(romanNum.charAt(i) == 'L') L_counter++;
			if(romanNum.charAt(i) == 'D') D_counter++;
		}
		if(V_counter > 1 || L_counter > 1 || D_counter > 1) return true;
		
		
		return false;
		
	}
	
	
}
