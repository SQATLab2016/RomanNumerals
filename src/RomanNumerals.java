public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		
		int arabicNum = 0;
		
		String roman = romanNum.toUpperCase();
	    for(int x = 0;x<romanNum.length();x++)
	    {
	        char convertToDecimal = romanNum.charAt(x);
		
	        switch (convertToDecimal)  {
	        case 'M':
	            arabicNum += 1000;
	            break;

	        case 'D':
	        	arabicNum += 500;
	            break;

	        case 'C':
	        	arabicNum += 100;
	            break;

	        case 'L':
	        	arabicNum += 50;
	            break;

	        case 'X':
	        	arabicNum += 10;
	            break;

	        case 'V':
	        	arabicNum += 5;
	            break;

	        case 'I':
	        	arabicNum += 1;
	            break;
	        }
		}
	    if (roman.contains("IV"))
	    {
	    	arabicNum-=2;
	    }
	    if (roman.contains("IX"))
	    {
	    	arabicNum-=2;
	    }
	    if (roman.contains("XL"))
	    {
	    	arabicNum-=10;
	    }
	    if (roman.contains("XC"))
	    {
	    	arabicNum-=10;
	    }
	    if (roman.contains("CD"))
	    {
	    	arabicNum-=100;
	    }
	    if (roman.contains("CM"))
	    {
	    	arabicNum-=100;
	    }
	    return arabicNum;
	}
}