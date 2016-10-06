
public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		// To be Implemented
		return 0;
		
	}
	
	public static int convert(String string) {
		// TODO Auto-generated method stub
		return 2;
	}

	public static boolean checkCharacters(String string) {
		// TODO Auto-generated method stub
		for(int i=0; i<string.length(); i++){
			char ch = string.charAt(i);
			if(ch != 'I' & ch != 'V' & ch != 'X' & ch != 'L' & ch != 'C' & ch != 'D' & ch != 'M')
				return false;
		}
		return true;
	}

	public static boolean checkRepetition3(String string) {
		// TODO Auto-generated method stub
		int I = 0,X = 0 ,C = 0,M = 0;
		for(int i=0; i<string.length(); i++){
			char ch = string.charAt(i);
			switch(ch){
			case 'I':
				I += 1;
				break;
			case 'X':
				X += 1;
				break;
			case 'C':
				C += 1;
				break;
			case 'M':
				M += 1;
				break;
			}
			if (I == 3 | X == 3 | C == 3 | M == 3)
				return false;
		}
		return true;
	}
	
	public static boolean checkRepetition2(String string) {
		// TODO Auto-generated method stub
		int V = 0,L = 0 ,D = 0;
		for(int i=0; i<string.length(); i++){
			char ch = string.charAt(i);
			switch(ch){
			case 'V':
				V += 1;
				break;
			case 'L':
				L += 1;
				break;
			case 'D':
				D += 1;
				break;
			}
			if (V == 2 | L == 2 | D == 2)
				return false;
		}
		return true;
	}

	public static char checkSubstraction(String string) {
		// TODO Auto-generated method stub
		for(int i=0; i<string.length()-1; i++){
			char ch = string.charAt(i);
			char ch2 =string.charAt(i+1);
			switch(ch){
			case 'I':
				if(ch2 == 'X'|ch2 == 'V')
					return ch;
				break;
			case 'X':
				if(ch2 == 'L'|ch2 == 'C')
					return ch;
				break;
			case 'C':
				if(ch2 == 'D'|ch2 == 'M')
					return ch;
				break;
			}
		}
		return ' ';
	}

	public static boolean oneSubstraction(String string) {
		// TODO Auto-generated method stub
		for(int i=0; i<string.length()-1; i++){
			char ch = string.charAt(i);
			char ch2 = string.charAt(i+1);
			if((ch == ch2) & (string.charAt(i+2) != '\u0000'))
				return false;
		}
		return true;
	}
}
