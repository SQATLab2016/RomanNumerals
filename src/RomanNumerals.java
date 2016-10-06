
public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		// To be Implemented
		//1984	=	MCMLXXXIV
		int num=0, tempNum=0, tempNum2=0, tempNum3=0;
		char tempChar;
		if (checkFor3C(romanNum)&&checkFor3I(romanNum)&&checkFor3M(romanNum)&&checkFor3X(romanNum)) {
			if (checkForNorepeatD(romanNum)&&checkForNorepeatL(romanNum)&&checkForNorepeatV(romanNum)) {

				for (int i = romanNum.length(); i < 0; i--) {
					tempChar= romanNum.charAt(i);
					tempNum= convertCharToNum(tempChar);
					tempNum2=convertCharToNum(romanNum.charAt(i-1));
					tempNum3=convertCharToNum(romanNum.charAt(i-2));
					if (tempNum>tempNum2&&tempNum<tempNum3) {
						num= num+(tempNum-tempNum2);
					} else if (tempNum>tempNum&&tempNum>tempNum3) {
						num= num+(tempNum-tempNum2-tempNum3);
					}
				}
			}
		}
		return 0;
	}

	public int convertCharToNum(Character a){
		int num=0;

		if (a=='I') {
			num=1;

		}else if(a=='V') {
			num=5;

		}else if(a=='X') {
			num=10;

		}else if(a=='L') {
			num=50;

		}else if (a=='C') {
			num=100;

		}else if(a=='M') {
			num=1000;

		}
		return num;

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
	public int wahtIsIVis4(String num) {

		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i)=='I' &&(num.charAt(i+1)=='V')) {
				return 4;
			}else return -1;


		}
		return -1;
	}
	public Object wahtIsIXis9(String num) {
		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i)=='I' &&(num.charAt(i+1)=='X')) {
				return 9;
			}else return -1;


		}
		return -1;
	}
	public Object wahtIsILis49(String num) {
		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i)=='I' &&(num.charAt(i+1)=='L')) {
				return 49;
			}else return -1;


		}
		return -1;
	}
	public Object wahtIsICis99(String num) {
		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i)=='I' &&(num.charAt(i+1)=='C')) {
				return 99;
			}else return -1;


		}
		return -1;
	}
	public Object wahtIsIDis499(String num) {
		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i)=='I' &&(num.charAt(i+1)=='D')) {
				return 499;
			}else return -1;


		}
		return -1;
	}
	public Object wahtIsXLis40(String num) {
		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i)=='X' &&(num.charAt(i+1)=='L')) {
				return 40;
			}else return -1;


		}
		return -1;
	}
	public Object wahtIsXCis90(String num) {
		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i)=='X' &&(num.charAt(i+1)=='C')) {
				return 90;
			}else return -1;


		}
		return -1;
	}
	public Object wahtIsXDis490(String num) {
		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i)=='X' &&(num.charAt(i+1)=='D')) {
				return 490;
			}else return -1;


		}
		return -1;
	}
	public Object wahtIsCDis400(String num) {
		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i)=='C' &&(num.charAt(i+1)=='D')) {
				return 400;
			}else return -1;


		}
		return -1;
	}
	public Object wahtIsCMis900(String num) {
		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i)=='C' &&(num.charAt(i+1)=='M')) {
				return 900;
			}else return -1;


		}
		return -1;
	}
}
