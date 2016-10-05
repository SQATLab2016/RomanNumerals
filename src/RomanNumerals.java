
public class RomanNumerals {
	
	private String number;

	public RomanNumerals(String string) {
		number = string;
	}

	public int convertToInteger(String romanNum) {
		// To be Implemented
		return 0;
		
	}

	public Boolean atMost3CharCheck() {
		int counter1 = 0;
		int counter2 = 0;
		int counter3 = 0;
		int counter4 = 0;
		
		for(int i = 0; i<number.length(); ++i) {
			
			if('I' == number.charAt(i)) {
				++counter1;
			}
			if('X' == number.charAt(i)) {
				++counter2;
			}
			if('C' == number.charAt(i)) {
				++counter3;
			}
			if('M' == number.charAt(i)) {
				++counter4;
			}
			
		}
		
		if(counter1>3 || counter2>3 || counter3>3 || counter4>3) {
			return false;
		}
		
		return true;
		
	}
	
}
