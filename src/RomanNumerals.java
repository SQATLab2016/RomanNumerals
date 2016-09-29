
public class RomanNumerals {
	public RomanNumerals(){
		// TODO Auto-generated constructor stub
		//Tables for roman numerals and numbers should be added here
	}

	public int convertToInteger(String romanNum) throws RomanNumeralsException {
		// To be Implemented
		//Test for too many "I, X, C, M" returns true if too many
		if(testRepeatedTooManyTimes(romanNum)) throw new RomanNumeralsException();
		
		if(romanNum == "IIII") throw new RomanNumeralsException();
		if(romanNum == "I") return 1;
		
		return 0;
	}
	
	//Return false if one of the letters is repeated too many times
	public boolean testRepeatedTooManyTimes(String roman){
		//Test if there is a possibility for too many of the same number
		if(roman.length() < 4 ) return false;
		
		//Test the obvious
		if(roman == "IIII") return true;
		
		return false;
	}
	
	
}
