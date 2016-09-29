
public class RomanNumerals {
	static int counterI = 0;
	static int counterX = 0;
	static int counterC = 0;
	static int counterM = 0;
	static int counterV = 0;
	static int counterL = 0;
	static int counterD = 0;
	
	public static int convertToInteger(String romanNum) {
		int num = 0;
		int sum  = 0;
		int prevNum = 0;

		char lastOperation = ' ';
		for(int i = romanNum.length()-1; i>=0; i--){
			num = basicConvert(romanNum.charAt(i));
			
			if(lastOperation == '-' && num == prevNum) return -1;
			
			if(check1NumbersAmount(num) == -1) return -1;
			if(check5NumbersAmount(num) == -1) return -1;
			
			if(num>=prevNum){
				sum = sum + num;
				lastOperation = '+';
			}
			else{
				if(num == 5 || num == 50 || num == 500) return -1;
				
				if(num == 1 && prevNum > 10) return -1;
				if(num == 10 && prevNum > 100) return -1;
				
				sum = sum - num;
				lastOperation = '-';
			}
			prevNum = num;
		}
		restartCounters();
		return sum;
		
	}
	
	private static void restartCounters(){
		counterI = 0;
		counterX = 0;
		counterC = 0;
		counterM = 0;
		counterV = 0;
		counterL = 0;
		counterD = 0;
	}
	
	private static int check1NumbersAmount(int num){
		switch(num){
		case 1: 
			counterI++;
			if(counterI > 3) return -1;
			break;
		case 10: 
			counterX++;
			if(counterX > 3) return -1;
			break;
		case 100: 
			counterC++;
			if(counterC > 3) return -1;
			break;
		case 1000: 
			counterM++;
			if(counterM > 3) return -1;
			break;
		default:
			return 0;
		}
		return 0;
	}
	
	private static int check5NumbersAmount(int num){
		switch(num){
		case 5: 
			counterV++;
			if(counterV > 1) return -1;
			break;
		case 50: 
			counterL++;
			if(counterL > 1) return -1;
			break;
		case 500: 
			counterD++;
			if(counterD > 1) return -1;
			break;
		default:
			return 0;
		
		}
		return 0;
	}
	
	private static int basicConvert(char romanNum){
		switch (romanNum){
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default: return -1;
		}
	}
}
