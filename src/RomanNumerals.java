
public class RomanNumerals {

	public static int convertToInteger(String romanNum) {
		// To be Implemented
		if(romanNum == "I") return 1;

		else

			if(romanNum == "V") return 5;

			else

				if(romanNum == "X") return 10;

				else

					if(romanNum == "L") return 50;

					else

						if(romanNum == "C") return 100;

						else

							if(romanNum == "D") return 500;

							else

								if(romanNum == "M") return 1000;
		return 0;
	}
	//The symbols'I''X''C'and'M'can be repeated at most 3 times in a row.
	public static boolean repeatLessThanThreeTimesI(String numI) {

		// TODO Auto-generated method stub
		int repeat=0;
		for (int i = 0; i < numI.length(); i++) {
			if (numI.charAt(i)=='I') {
				repeat++;
			}
		}

		if (repeat<4) {
			return true;
		}else{
			return false;
		}

	}

	public static boolean repeatLessThanThreeTimesX(String numX) {

		// TODO Auto-generated method stub
		int repeat=0;
		for (int i = 0; i < numX.length(); i++) {
			if (numX.charAt(i)=='I') {
				repeat++;
			}
		}

		if (repeat<4) {
			return true;
		}else{
			return false;
		}

	}
	public static boolean repeatLessThanThreeTimesC(String numC) {

		// TODO Auto-generated method stub
		int repeat=0;
		for (int i = 0; i < numC.length(); i++) {
			if (numC.charAt(i)=='I') {
				repeat++;
			}
		}

		if (repeat<4) {
			return true;
		}else{
			return false;
		}

	}
	public static boolean repeatLessThanThreeTimesM(String numM) {

		// TODO Auto-generated method stub
		int repeat=0;
		for (int i = 0; i < numM.length(); i++) {
			if (numM.charAt(i)=='I') {
				repeat++;
			}
		}

		if (repeat<4) {
			return true;
		}else{
			return false;
		}

	}


}
