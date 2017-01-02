
public class RomanNumerals {
	
	private int totalArabic;
	private int lastNumber;
	private boolean x = false;
	
	public RomanNumerals() {
        this.totalArabic = 0;
        this.lastNumber = 0;
	}
	
	public int convertToInteger(String romanNum) throws RomanNumeralsException {	
			checkHowManySimilarRomanNums(romanNum);
			checkIfValidSubtraction(romanNum);
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
		for(int i = romanNum.length() - 1; i >= 0 ; i--) {
			   if(romanNum.charAt(i) == 'I')
			      romanI++;
			   if(romanNum.charAt(i) == 'V')
				   romanV++;
			   if(romanNum.charAt(i) == 'X')
				   romanX++;
			   if(romanNum.charAt(i) == 'L')
				   romanL++;
			   if(romanNum.charAt(i) == 'C')
				   romanC++;
			   if(romanNum.charAt(i) == 'D')
				   romanD++;
			   if(romanNum.charAt(i) == 'M')
				   romanM++; 
			}
		if(romanI > 3 || romanX > 3 || romanC > 3 || romanM > 3 || romanV > 1 || romanL > 1 || romanD > 1)
			throw new RomanNumeralsException();
		
    }
    
    public void checkIfValidSubtraction(String romanNum) throws RomanNumeralsException {
    	char lastChar = 0;
    	for(int i = romanNum.length() - 1; i >= 0 ; i--) {
    		switch (romanNum.charAt(i)) {
			    case 'L':
			    	processTheChar('L', lastChar);
			        lastChar = 'L';
			        break;
			    case 'I':
			    	processTheChar('I', lastChar);
			    	lastChar = 'I';
			    	break;
			    case 'X':
			    	processTheChar('X', lastChar);
			    	lastChar = 'X';
			    	break;
			    case 'D':
			    	processTheChar('D', lastChar);
			    	lastChar = 'D';
			    	break;
			    case 'C':
			    	processTheChar('C', lastChar);
			    	lastChar = 'C';
			    	break;
    		}
		}
    }

	private void processTheChar(char c, char lastChar) throws RomanNumeralsException {
		if( c == 'I' )
			if( lastChar == 'L' )
				throw new RomanNumeralsException();
		if ( c == 'X' )
			if(lastChar == 'X' && x == true)
				throw new RomanNumeralsException();
				x = false;
		if ( c == 'C' )
			if( lastChar == 'X' && x == true)
				throw new RomanNumeralsException();
				x = false;
		if( c == 'X' )
			if( lastChar == 'D' )
				throw new RomanNumeralsException();
			if( lastChar == 'X')
				x = true;
	}
}
