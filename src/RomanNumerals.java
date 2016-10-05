
public class RomanNumerals {
	
	private int totalArabic;
	private int lastNumber;
	
	public RomanNumerals() {
        this.totalArabic = 0;
        this.lastNumber = 0;
	}
	
	public int convertToInteger(String romanNum) throws RomanNumeralsException {	
		checkHowManySimilarRomanNums(romanNum);
        for (int i = romanNum.length() - 1; i >= 0 ; i--) {
            handleRomanNumbers(romanNum, i);
        }
       return totalArabic;
		 
    }

	private void handleRomanNumbers(String romanNum, int i) {
		switch (romanNum.charAt(i)) {
		    case 'M':
		        processtotalArabic(1000);
		        lastNumber = 1000;
		        break;

		    case 'D':
		    	processtotalArabic(500);
		        lastNumber = 500;
		        break;

		    case 'C':
		    	processtotalArabic(100);
		        lastNumber = 100;
		        break;

		    case 'L':
		    	processtotalArabic(50);
		        lastNumber = 50;
		        break;

		    case 'X':
		    	processtotalArabic(10);
		        lastNumber = 10;
		        break;

		    case 'V':
		    	processtotalArabic(5);
		        lastNumber = 5;
		        break;

		    case 'I':
		    	processtotalArabic(1);
		        lastNumber = 1;
		        break;
		}
	}
	

    private void processtotalArabic(int arabic) {
        if (lastNumber > arabic) {
           totalArabic -= arabic;
        } else {
          totalArabic += arabic;
        }
    }
    
    private void checkHowManySimilarRomanNums(String romanNum) throws RomanNumeralsException {
 		int romanD = 0;
		int romanC = 0;
		int romanL = 0;
		int romanX = 0;
		int romanV = 0;
		int romanI = 0;
		int romanM = 0;
    	for( int i = 1 ; i <= romanNum.length() ; i++ ) {
			switch (romanNum.charAt(i)) {
		    	case 'M':
		    		romanM++;
		    		break;
			    case 'D':
			    	romanD++;
			        break;
			    case 'C':
			    	romanC++;
			        break;
			    case 'L':
			    	romanL++;
			        break;
			    case 'X':
			    	romanX++;
			        break;
			    case 'V':
			    	romanV++;
			        break;
	
			    case 'I':
			    	romanI++;
			        break;	
    		}
    		if (romanI > 3 || romanX > 3 || romanC > 3 || romanM > 3 || romanV > 1 || romanL > 1 || romanD > 1) 
    			throw new RomanNumeralsException();    			
    	}
   }
}
