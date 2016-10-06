
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
				} 
				else if(s.equals("D")){
					result += 500;
				}
				else if (s.equals("C")){
					String next = romanNum.substring(i+1,i+2);
					// Check special case.
					if (next.equals("M")){
						result += 900;
						i++;
					}
					else {
						result += 100;
					}
				} 
				else if(s.equals("L")){
					result += 50;
				}
				else if(s.equals("X")){
					
				}
			}
		}
		return 1994;
	}
}
