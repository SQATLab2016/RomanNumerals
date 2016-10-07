public class RomanNumerals {
	
	
	
	private static final String ROMAN10 = "X";
	private static final String ROMAN5 = "V";
	private static final String ROMAN1 = "I";
	
	public int convertToInteger(String romanNum) {
		
		// if literal repeats sum
					
		
		if(romanNum.length() == 2)
			return ReturnDoubleValue(romanNum);		
		
		if(romanNum.length() == 3)
			return ReturnTripleValue(romanNum);
		
		if(romanNum.equals("VIII"))
				return SumTwoValues(romanNum.substring(1,3))+ReturnSingleValue(romanNum.substring(0,1))+ReturnSingleValue(romanNum.substring(3,4));
		
		return ReturnSingleValue(romanNum);
	}


	private int SubstractTwoValues(String romanNum) {
		return ReturnSingleValue(romanNum.substring(1,2))-ReturnSingleValue(romanNum.substring(0,1));
	}


	private int SumTwoValues(String romanNum) {
		return ReturnSingleValue(romanNum.substring(0,1))+ReturnSingleValue(romanNum.substring(1,2));
	}	
	
	private int ReturnTripleValue(String romanNum) {
		
		if(CheckRepeats(romanNum.charAt(0), romanNum) == 2)
			return SumTwoValues(romanNum.substring(1,3))+ReturnSingleValue(romanNum.substring(0,1));
						
		if(romanNum.equals("VII"))
			return SumTwoValues(romanNum.substring(1,3))+ReturnSingleValue(romanNum.substring(0,1));
		
			
		return 0;
	}
	
	private int CheckRepeats(char c, String string) {
		int num = 0;
		for(int i = 1; i != string.length(); i++)
			if(string.charAt(i) == c)
				num++;
			else
				return -1;
		return num;
	}
	
	private int ReturnDoubleValue(String romanNum) {
		
		if(CheckRepeats(romanNum.charAt(0), romanNum) == 1)
			return SumTwoValues(romanNum);
		
		if(romanNum.equals("IV"))
			return SubstractTwoValues(romanNum);
		
		if(romanNum.equals("VI"))
			return SumTwoValues(romanNum);
		
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
