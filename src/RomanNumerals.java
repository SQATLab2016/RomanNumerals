
public class RomanNumerals {
	public int ArabicNumber = 0;
	public String RomanNumber;

	public int convertToInteger(String romanNum) {
		int i=0;
		for(i=0;i<romanNum.length();i++){
			char RomanNumber=romanNum.charAt(i);
			if (RomanNumber=='I'){
				if (romanNum.charAt(i-1)=='I')ArabicNumber=ArabicNumber-2;
				ArabicNumber=ArabicNumber+1;
				}
			if (RomanNumber=='V'){
				ArabicNumber=ArabicNumber+5;
			}
			if (RomanNumber=='X'){
				if (romanNum.charAt(i-1)=='I')ArabicNumber=ArabicNumber-2;
				ArabicNumber=ArabicNumber+10;
				}
			if (RomanNumber=='L'){
				if (romanNum.charAt(i-1)=='X')ArabicNumber=ArabicNumber-20;
				ArabicNumber=ArabicNumber+50;
			}
			if (RomanNumber=='C'){
				if (romanNum.charAt(i-1)=='X')ArabicNumber=ArabicNumber-20;
				ArabicNumber=ArabicNumber+100;
				}
			if (RomanNumber=='D'){
				if (romanNum.charAt(i-1)=='C')ArabicNumber=ArabicNumber-200;
				ArabicNumber=ArabicNumber+500;
			}
			if (RomanNumber=='M'){
				if (romanNum.charAt(i-1)=='C')ArabicNumber=ArabicNumber-200;
				ArabicNumber=ArabicNumber+1000;
			}
		}
		return ArabicNumber;
		
	}
}
