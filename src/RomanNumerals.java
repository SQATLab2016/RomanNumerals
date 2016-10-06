
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

	public static boolean neverRepeatV(String numV){

		int repeat = 0;

		for (int i = 0; i < numV.length(); i++) {
			if(numV.charAt(i) == 'V'){
				repeat ++;
			}
		}
		if(repeat == 1){
			return true;
		}else{
			return false;
		}
	}

	public static boolean neverRepeatL(String numL){

		int repeat = 0;

		for (int i = 0; i < numL.length(); i++) {
			if(numL.charAt(i) == 'L'){
				repeat ++;
			}
		}
		if(repeat == 1){
			return true;
		}else{
			return false;
		}
	}

	public static boolean neverRepeatD(String numD){

		int repeat = 0;

		for (int i = 0; i < numD.length(); i++) {
			if(numD.charAt(i) == 'D'){
				repeat ++;
			}
		}
		if(repeat == 1 || repeat == 0){
			return true;
		}else{
			return false;
		}
	}

	
	public static String substracted(String oneSymbol){
		
		char J = 3;
		char K = 8;
		char R = 80;
		char Z = 30;
		char W = 300;
		char Y = 800;
		int repeat = 0;

		for (int i = 0; i < oneSymbol.length(); i++) {

			if(oneSymbol.charAt(i) == 'I'){
				repeat ++;
			}else{

				if(repeat == 1 && ( (oneSymbol.charAt(i) == 'V') || (oneSymbol.charAt(i) == 'X'))){
				
					if((oneSymbol.charAt(i) == 'V')){
						
						char[] l = oneSymbol.toCharArray();
						l[i] = J;
						oneSymbol = l.toString();
						
					}
				}else if(oneSymbol.charAt(i) == 'X'){

					char[] l = oneSymbol.toCharArray();
					l[i] = K;
					oneSymbol = l.toString();
					
				}
			}
			
			if(oneSymbol.charAt(i) == 'X'){
				repeat ++;
			}else{

				if(repeat == 1 && ( (oneSymbol.charAt(i) == 'C') || (oneSymbol.charAt(i) == 'L'))){
				
					if((oneSymbol.charAt(i) == 'C')){
						
						char[] l = oneSymbol.toCharArray();
						l[i] = R;
						oneSymbol = l.toString();
						
					}
				}else if(oneSymbol.charAt(i) == 'L'){

					char[] l = oneSymbol.toCharArray();
					l[i] = Z;
					oneSymbol = l.toString();
					
				}
			}
			
			if(oneSymbol.charAt(i) == 'C'){
				repeat ++;
			}else{

				if(repeat == 1 && ( (oneSymbol.charAt(i) == 'D') || (oneSymbol.charAt(i) == 'M'))){
				
					if((oneSymbol.charAt(i) == 'D')){
						
						char[] l = oneSymbol.toCharArray();
						l[i] = W;
						oneSymbol = l.toString();
						
					}
				}else if(oneSymbol.charAt(i) == 'M'){

					char[] l = oneSymbol.toCharArray();
					l[i] = Y;
					oneSymbol = l.toString();
					
				}
			}		
		}
	return oneSymbol;
	}
}
