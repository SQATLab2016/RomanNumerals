import java.util.*;

public class RomanNumerals {
	
	final String ONE = "I", FIVE = "V", TEN = "X", FIFTY = "L", HUNDRED = "C", FIVEHUNDRED= "D", THOUSAND = "M";
	//Trying out treeMap
	private TreeMap<String, Integer> numbers;
	
	public RomanNumerals(){
		numbers = new TreeMap<String, Integer>();
		numbers.put(ONE, 1);
		numbers.put(FIVE, 5);
		numbers.put(TEN, 10);
		numbers.put(FIFTY, 50);
		numbers.put(HUNDRED, 100);
		numbers.put(FIVEHUNDRED, 500);
		numbers.put(THOUSAND, 1000);
	}
	
	public int convertToInteger(String romanNum) {
		
		return convertMultiple(romanNum);
		
	}
	//If same number repeats
	private boolean checkRepetition(String prev, String current){
		boolean repeat = false;
		if(prev != null && prev.equals(current)){
			repeat = true;
		}
		else{
			repeat = false;
		}
		return repeat;
	}
	//If smaller
	private boolean checkIfSmallerNumber(String prev, String current){
		boolean ok = false;
		if(prev != null){
			if(current.equals(ONE)){
				if(prev.equals(FIVE) || prev.equals(TEN)){
					ok = true;
				}
			}
			else if(current.equals(TEN)){
				if(prev.equals(FIFTY) || prev.equals(HUNDRED)){
					ok = true;
				}
			}
			else if(current.equals(HUNDRED)){
				if(prev.equals(FIVEHUNDRED) || prev.equals(THOUSAND)){
					ok = true;
				}
			}
		}
		return ok;
	}
	private int convertMultiple(String romanNum){
		int num = 0;
		
		String[] n = romanNum.split("");
		String prev = null;
		int times = 0;
		boolean substract = false;
		
		for(int i = n.length - 1; i >= 0; i--){
			
			if(n[i].equals(FIVE) || n[i].equals(FIFTY) || n[i].equals(FIVEHUNDRED)){
				if(checkRepetition(prev, n[i])){
					num = 0;
					break;
				}
			}
			else{
				if(checkRepetition(prev, n[i])){
					times++;
					if(times == 3){
						break;
					}
				}
			}
			
			
			if(prev != null && numbers.get(prev) > numbers.get(n[i])){
				if(checkIfSmallerNumber(prev, n[i])){
					num -= numbers.get(n[i]);
					
				}
				substract = true;
				
			}
			else{
				num += numbers.get(n[i]);
			}
			if(substract && checkRepetition(prev, n[i])){
				num = 0;
				break;
			}
			
			prev = n[i];
		}
		return num;
	}
	
}
