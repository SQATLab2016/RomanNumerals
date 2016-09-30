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
		int num = 0;
		String[] n = romanNum.split("");
		String prev = "";
		for(int i = 0; i < romanNum.length(); i++){
			if(prev.equals(n[i]) && (n[i].equals("V") || n[i].equals("L") || n[i].equals("D"))){
				num = 0;
				break;
			}
			if(prev.equals("I") && (n[i].equals("V") || n[i].equals("X"))){
				num -= 2;
			}
			else if(prev.equals("X") && n[i].equals("C") || n[i].equals("D")){
				num -= 20;
			}
			else if(prev.equals("C") && n[i].equals("D") || n[i].equals("M")){
				num -= 200;
			}
			num += numbers.get(n[i]);
			prev = n[i];
			
		}
		return num;
	}
	
}
