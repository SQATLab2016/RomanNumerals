
public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		// To be Implemented
		
		
		
		return 0;
	
		
		
	}

	public boolean cherFor3I(String num) {
		// TODO Auto-generated method stub
		int numI=0;
		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i)=='I') {
				numI++;
			}
			
		}
		
		
		if (numI<=3) {
			return true;
		}else 	return false;
	}

	public boolean cherFor3X(String num) {
		// TODO Auto-generated method stub
		int numI=0;
		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i)=='X') {
				numI++;
			}
			
		}
		
		
		if (numI<=3) {
			return true;
		}else 	return false;	}

	public boolean cherFor3C(String num) {
		// TODO Auto-generated method stub
				int numI=0;
				for (int i = 0; i < num.length(); i++) {
					if (num.charAt(i)=='C') {
						numI++;
					}
					
				}
				
				
				if (numI<=3) {
					return true;
				}else 	return false;	
	}
}
