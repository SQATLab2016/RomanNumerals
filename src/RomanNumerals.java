
public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		int result = 0;
		for (int i = 0; i < romanNum.length(); i++) {
			// Check last character seperately
			if(i == romanNum.length()-1){
				String s = romanNum.substring(i, i+1);				
				if(s.equals("M"))
					result+=1000;
				else if (s.equals("D"))
					result+=500;
				else if (s.equals("C"))
					result += 100;
				else if (s.equals("L"))
					result += 50;
				else if (s.equals("X"))
					result += 10;
				else if (s.equals("I"))
					result += 1;
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
					else if(next.equals("D")){
						result += 400;
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
					// Check special case.
					String next = romanNum.substring(i+1,i+2);
					if (next.equals("C")){
						result += 90;
						i++;
					}
					else if(next.equals("L")){
						result += 40;
						i++;
					}
					else {
						result += 10;
					}
				}
				else if(s.equals("V")){
					result += 5;
				}
				else if(s.equals("I")){
					String next = romanNum.substring(i+1,i+2);
					if (next.equals("X")){
						result += 9;
						i++;
					}
					else if (next.equals("V")){
						result += 4;
						i++;
					}
					else {
						result += 1;
					}
				}
			}
		}
		return result;
	}
}
