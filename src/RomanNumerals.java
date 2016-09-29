
public class RomanNumerals {
	public int convertToInteger(String romanNum) throws RomanNumeralsException{
		String s = romanNum;
		for(char c : romanNum.toCharArray()) {
			if(c != 'I' || c != 'V' || c != 'X' || c != 'L' || c != 'C' || c != 'D' || c != 'M') {
				throw new RomanNumeralsException("Roman Numeral to be converted isn't valid");
			}
		
		}
		
		if(romanNum.equals("I")) {
			return 1;		
		}
		else if (romanNum.equals("II")) {
			System.out.println("" + romanNum);
			return 2;
		}
		else if (romanNum.equals("III")) {
			System.out.println("" + romanNum);
			return 3;
		}
		else {
			System.out.println("" + romanNum);
		}
		
		for(int c = 0; c < romanNum.length();c++) {
			
		}
		
		return 0;
	}
}
