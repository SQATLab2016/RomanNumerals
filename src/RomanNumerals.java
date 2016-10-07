import java.util.*;

public class RomanNumerals {
	
	private TreeMap<String, Integer> numbers;
	
	public RomanNumerals(){
		numbers = new TreeMap<String, Integer>();
		numbers.put("I", 1);
		numbers.put("V", 5);
		numbers.put("X", 10);
		numbers.put("L", 50);
		numbers.put("C", 100);
		numbers.put("D", 500);
		numbers.put("M", 1000);
	}
	
	public int convertToInteger(String romanNum) {
		
		return convertMultiple(romanNum);
		
	}
	private int convertMultiple(String romanNum){
		String[] n = romanNum.split("");
		if(checkThreeTimes(n) && substractOkay(n)){
			return count(n);
		}
		return 0;
		
	}
	//count for checking the total
	private int count(String[] n){
		int c = numbers.get(n[n.length - 1]);
		String prev = n[n.length - 1];
		for(int i = n.length -2; i >= 0; i--){
			if(numbers.get(prev) > numbers.get(n[i])){
				c -= numbers.get(n[i]);
			}
			else{
				c += numbers.get(n[i]);
			}
			prev = n[i];
		}
		return c;
	}
	private boolean substractOkay(String[] n){
		String prev = n[n.length - 1];
		int times = 0;
		for(int i = n.length - 2; i >= 0; i--){
			if(prev.equals("M") || prev.equals("D")){
				if(!n[i].equals("C")){
					return false;
				}
				else{
					times++;
				}
			}
			if(prev.equals("C") || prev.equals("L")){
				if(!n[i].equals("X")){
					return false;
				}
				else{
					times++;
				}
			}
			if(prev.equals("X") || prev.equals("V")){
				if(!n[i].equals("I")){
					return false;
				}
				else{
					times++;
				}
			}
			if(n[i].equals("V") || n[i].equals("L") || n[i].equals("D")){
				if(numbers.get(n[i]) < numbers.get(prev)){
					return false;
				}
			}
			if(!n[i].equals("I") || !n[i].equals("X") || !n[i].equals("C")){
				times = 0;
			}
			if(times > 1){
				return false;
			}
			prev = n[i];
		}
		return true;
	}
	private boolean checkThreeTimes(String[] n){
		
		String prev = n[n.length - 1];
		int times = 0;
		for(int i = n.length - 2; i >= 0; i--){
			if(prev.equals(n[i])){
				times++;
			}
			if(times > 2){
				return false;
			}
			if(!prev.equals(n[i])){
				times = 0;
			}
			prev = n[i];
		}
		return true;
		
	}
	
}
