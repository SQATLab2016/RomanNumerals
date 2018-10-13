import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {
	Map<Character, Integer> numberMapping = new HashMap<>();

	public int getCharVal(char currentChar) {
		if (!(numberMapping.containsKey(currentChar))) {
			return 0;
		}
		return numberMapping.get(currentChar);
	}
	
    public boolean isIMorethan4(String s){
        return s.matches("(.*)([I]){4,}(.*)");
    }
    
    public boolean isXMorethan4(String s){
        return s.matches("(.*)([X]){4,}(.*)");
    }
    
    public boolean isCMorethan4(String s){
        return s.matches("(.*)([C]){4,}(.*)");
    }
    
    public boolean isMMorethan4(String s){
        return s.matches("(.*)([M]){4,}(.*)");
    }
    
    public boolean isIsubtractedfrom2NextHighestValue(String s) {
    	return s.matches("(.*)([I][LC])(.*)");
    }
    
    public boolean isXsubtractedfrom2NextHighestValue(String s) {
    	return s.matches("(.*)([X][DM])(.*)");
    }
  
    public boolean isRepeatedV(String s) {
    	return s.matches("(.*)V{2,}(.*)");
    }
    
    public boolean isRepeatedL(String s) {
    	return s.matches("(.*)L{2,}(.*)");
    }
    
    public boolean isRepeatedD(String s) {
    	return s.matches("(.*)D{2,}(.*)");
    }
	
	public void checkFormat(String romanNum) {
		if (isIMorethan4(romanNum)) {
			throw new NumberFormatException("I can't be More than4");
		} else if (isXMorethan4(romanNum)) {
			throw new NumberFormatException("X can't be More than4");
		} else if (isCMorethan4(romanNum)) {
			throw new NumberFormatException("C can't be More than4");
		} else if (isMMorethan4(romanNum)) {
			throw new NumberFormatException("M can't be More than4");
		} else if (isIsubtractedfrom2NextHighestValue(romanNum)) {
			throw new NumberFormatException("I can only subtract from 2 Next Highest Value");
		} else if (isXsubtractedfrom2NextHighestValue(romanNum)) {
			throw new NumberFormatException("X can only subtract from 2 Next Highest Value");
		} else if (isRepeatedV(romanNum)) {
			throw new NumberFormatException("V can't be repeated");
		} else if (isRepeatedL(romanNum)) {
			throw new NumberFormatException("L can't be repeated");
		} else if (isRepeatedD(romanNum)) {
			throw new NumberFormatException("D can't be repeated");
		}
	}

	public int convertToInteger(String romanNum) {

		checkFormat(romanNum);
		
		int intResult = 0;
		int currentVal;
		int nextVal;
		for(int i=0; i < romanNum.length()-1;i+=1) {
			currentVal = getCharVal(romanNum.charAt(i));
			nextVal = getCharVal(romanNum.charAt(i+1));
			if (currentVal < nextVal) {
				intResult -= currentVal; 
			} else {
				intResult += currentVal;
			}
		}
		intResult += getCharVal(romanNum.charAt(romanNum.length()-1));
		return intResult;
	}

	public RomanNumerals() {
		numberMapping.put('M', 1000);
		numberMapping.put('D', 500);
		numberMapping.put('C', 100);
		numberMapping.put('L', 50);
		numberMapping.put('X', 10);
		numberMapping.put('V', 5);
		numberMapping.put('I', 1);
	}
}
