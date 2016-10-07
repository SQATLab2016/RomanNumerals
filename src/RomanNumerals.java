
public class RomanNumerals {
	
	
	
	private static final String ROMAN10 = "X";
	private static final String ROMAN5 = "V";
	private static final String ROMAN1 = "I";
	public int convertToInteger(String romanNum) {
		
		// if literal repeats sum
		
		
		if(romanNum.length() == 2)
			return ReturnDoubleValue(romanNum);		
			
		if(romanNum == "III")
			return SumDoubleRepeat(romanNum.substring(1,3))+ReturnSingleValue(romanNum.substring(0,1));
						
		if(romanNum == "VII")
			return SumDoubleRepeat(romanNum.substring(1,3))+ReturnSingleValue(romanNum.substring(0,1));
		
		if(romanNum == "VIII")
			return SumDoubleRepeat(romanNum.substring(1,3))+ReturnSingleValue(romanNum.substring(0,1))+ReturnSingleValue(romanNum.substring(3,4));
			
		
		return ReturnSingleValue(romanNum);
	}


	private int SubstractTwoValues(String romanNum) {
		return ReturnSingleValue(romanNum.substring(1,2))-ReturnSingleValue(romanNum.substring(0,1));
	}


	private int SumTwoValues(String romanNum) {
		return ReturnSingleValue(romanNum.substring(0,1))+ReturnSingleValue(romanNum.substring(1,2));
	}	
	
	private int ReturnDoubleValue(String romanNum) {
		
		if(romanNum == "II")
			return SumDoubleRepeat(romanNum);
		
		if(romanNum == "XX")
			return SumDoubleRepeat(romanNum);
		
		if(romanNum == "IV")
			return SubstractTwoValues(romanNum);
		
		if(romanNum.equals("VI"))
			return Sum
		
		if(romanNum.equals("IX"))
			return SubstractTwoValues(romanNum);		
		
		if(romanNum.equals("XL"))
			return SubstractTwoValues(romanNum);
		
		return 0;
	}
	
	
	private int ReturnSingleValue(String romanNum) {
		if(romanNum.equals(ROMAN1))
			return 1;			
		
		if(romanNum.equals(ROMAN5))
			return 5;
		
		if(romanNum.equals(ROMAN10))
			return 10;
		
		if(romanNum.equals("L"))
			return 50;
		
		if(romanNum.equals("C"))
			return 100;
		
		if(romanNum.equals("D"))
			return 500;
		
		if(romanNum.equals("M"))
			return 1000;
		
		
		return 0;
	}
}
