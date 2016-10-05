
public class RomanNumerals {
	
	private String number;

	public RomanNumerals(String string) {
		number = string;
	}

	public int convertToInteger(String romanNum) {
		// To be Implemented
		return 0;
		
	}

	public Boolean atMost3CharCheck(char ch) {
		int counter = 0;
		
		for(int i = 0; i<number.length(); ++i) {
			
			if(ch == number.charAt(i)) {
				++counter;
			}
			
		}
		
		if(counter>3) {
			return false;
		}
		
		return true;
		
	}
	
}
