import java.util.HashMap;

public class RomanNumerals {
	public static int convertToInteger(String romanNum) {
		// To be Implemented
		
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();  
		hashMap.put("I",1);
		hashMap.put("IV",4);
		hashMap.put("V",5);
		hashMap.put("IX",9);
		hashMap.put("X",10);
		hashMap.put("XL",40);
		hashMap.put("L",50);
		hashMap.put("XC",90);
		hashMap.put("C",100);
		hashMap.put("CD",400);
		hashMap.put("D",500);
		hashMap.put("CM",900);
		hashMap.put("M",1000);
		
		int i = 0;
		int arabicNum = 0;
		int subsequence = 0;
		
		while(i<romanNum.length()){	
			if(i<romanNum.length()-1){
				if(hashMap.containsKey(romanNum.subSequence(i,i+2))){
					subsequence = hashMap.get(romanNum.subSequence(i,i+2));
					arabicNum += subsequence;
					i += 2;
				}
				else{
					subsequence = hashMap.get(romanNum.subSequence(i,i+1));
					arabicNum += subsequence;
					i += 1;
				}
			}	
			else{
				subsequence = hashMap.get(romanNum.subSequence(i,i+1));
				arabicNum += subsequence;
				i += 1;
			}
		}
		
		return arabicNum;
		
	}
}
