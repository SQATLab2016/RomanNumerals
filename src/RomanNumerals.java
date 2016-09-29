
public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		// To be Implemented
		int num=0;
		if (checkFor3C(romanNum)&&checkFor3I(romanNum)&&checkFor3M(romanNum)&&checkFor3X(romanNum)) {







		}


		return 0;



	}
	//1 rule
	public boolean checkFor3I(String num) {
		// TODO Auto-generated method stub
		int numOfThatChar=0;
		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i)=='I') {
				numOfThatChar++;
			}

		}


		if (numOfThatChar<=3) {
			return true;
		}else 	return false;
	}

	public boolean checkFor3X(String num) {
		// TODO Auto-generated method stub
		int numOfThatChar=0;
		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i)=='X') {
				numOfThatChar++;
			}

		}


		if (numOfThatChar<=3) {
			return true;
		}else 	return false;	}

	public boolean checkFor3C(String num) {
		// TODO Auto-generated method stub
		int numOfThatChar=0;
		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i)=='C') {
				numOfThatChar++;
			}

		}


		if (numOfThatChar<=3) {
			return true;
		}else 	return false;	
	}

	public boolean checkFor3M(String num) {
		// TODO Auto-generated method stub
		int numOfThatChar=0;
		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i)=='M') {
				numOfThatChar++;
			}

		}


		if (numOfThatChar<=3) {
			return true;
		}else 	return false;
	}


	//2rule

	public boolean checkForNorepeatV(String num) {
		int numOfThatChar=0;
		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i)=='V') {
				numOfThatChar++;
			}
		}
		if (numOfThatChar>1) {
			return false;
		}else 	return true;
	}
	public boolean checkForNorepeatL(String num) {
		// TODO Auto-generated method stub
		int numOfThatChar=0;
		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i)=='L') {
				numOfThatChar++;
			}
		}
		if (numOfThatChar>1) {
			return false;
		}else 	return true;
	}
	public boolean checkForNorepeatD(String num) {
		// TODO Auto-generated method stub
				int numOfThatChar=0;
				for (int i = 0; i < num.length(); i++) {
					if (num.charAt(i)=='D') {
						numOfThatChar++;
					}
				}
				if (numOfThatChar>1) {
					return false;
				}else 	return true;
	}
}
