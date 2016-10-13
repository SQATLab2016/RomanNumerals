
public class RomanNumerals {
	public int ArabicNumber = 0;
	public String RomanNumber;

	public int convertToInteger(String romanNum) {
		int i=0;
		for(i=0;i<romanNum.length();i++){
			char RomanNumber=romanNum.charAt(i);
			if (RomanNumber=='I'){
				
				ArabicNumber=ArabicNumber+1;
				}
			if (RomanNumber=='V'){
				if(i!=0){if (romanNum.charAt(i-1)=='I')ArabicNumber=ArabicNumber-2;}
			
				ArabicNumber=ArabicNumber+5;
			}
			if (RomanNumber=='X'){
				if(i!=0){if (romanNum.charAt(i-1)=='I')ArabicNumber=ArabicNumber-2;}
				ArabicNumber=ArabicNumber+10;
				}
			if (RomanNumber=='L'){
				if(i!=0){if (romanNum.charAt(i-1)=='X')ArabicNumber=ArabicNumber-20;}
				ArabicNumber=ArabicNumber+50;
			}
			if (RomanNumber=='C'){
				if(i!=0){if (romanNum.charAt(i-1)=='X')ArabicNumber=ArabicNumber-20;}
				ArabicNumber=ArabicNumber+100;
				}
			if (RomanNumber=='D'){
				if(i!=0){if (romanNum.charAt(i-1)=='C')ArabicNumber=ArabicNumber-200;}
				ArabicNumber=ArabicNumber+500;
			}
			if (RomanNumber=='M'){
				if(i!=0){if (romanNum.charAt(i-1)=='C')ArabicNumber=ArabicNumber-200;}
				ArabicNumber=ArabicNumber+1000;
			}
		}
		return ArabicNumber;
		
	}
}
