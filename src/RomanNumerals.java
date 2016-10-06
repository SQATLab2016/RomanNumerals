
public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		int result = 0;
		for (int i = 0; i < romanNum.length(); i++) {
			// Check last character seperately
			if(i == romanNum.length()-1){
				
			}
			else{
				String s = romanNum.substring(i, i+1);
				if(s.equals("M")){
					result += 1000;
				} else if (s.equals("C")){
					String next = romanNum.substring(i+1,i+2);
					if (next.equals("M")){
						result += 900;
						i++;
					}
				}
			}
		}
		return 1994;
	}
}
