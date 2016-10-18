
public class RomanNumerals {
	
	//test2
	public int convertToInteger(String romanNum) {
		if(romanNum.length()==1){
		
			return returnValue(romanNum);
		}else if(romanNum.length()==2){
			if(returnValue(romanNum.substring(0, 1))<returnValue(romanNum.substring(1))){
		    	return returnValue(romanNum.substring(1)) - returnValue(romanNum.substring(0, 1));
		    }else{
		    	return returnValue(romanNum.substring(1)) + returnValue(romanNum.substring(0, 1));
		    }
		}else {
			if(returnValue(romanNum.substring(0,1))<returnValue(romanNum.substring(1,2))){
				return convertToInteger(romanNum.substring(1))-convertToInteger(romanNum.substring(0,1));
			}else{
				return convertToInteger(romanNum.substring(0,1))+convertToInteger(romanNum.substring(1));
			}
			
		}
	
		
		
	}
	public int returnValue(String rom) {
		if(rom.equals("I")){
			return 1;
		}else if(rom.equals("V")){
			return 5;
		}else if(rom.equals("X")){
			return 10;
		}else if(rom.equals("L")){
			return 50;
		}else if(rom.equals("C")){
			return 100;
		}else if(rom.equals("D")){
			return 500;
		}else if(rom.equals("M")){
			return 1000;
		}else {
			return 0;
		}
	
	
	}
}
