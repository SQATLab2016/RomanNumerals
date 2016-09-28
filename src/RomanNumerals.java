
public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		int result = 0;
    	if (romanNum.equals("I")) {
    		result = 1;
   		} else if (romanNum.equals("V")) {
   			result = 5;
   		} else if (romanNum.equals("X")) {
    		result = 10;
    	} else if (romanNum.equals("L")) {
    		result = 50;
   		} else if (romanNum.equals("C")) {
   			result = 100;
   		} else if (romanNum.equals("D")) {
   			result = 500;
   		} else if (romanNum.equals("M")) {
   			result = 1000;
   		}
    	return result;
    	
    	// Change the above to loop the string char by char to be able to 
    	// calculate longer roman numbers
    	// 
/*    	for (int i = romanNum.length(); i >= 0; i--) {
    		char prime =  romanNum.charAt(i);
    		// Not implemented, time is up
    	}
*/    	
	}
}
