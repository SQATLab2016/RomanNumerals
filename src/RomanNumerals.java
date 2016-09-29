
public class RomanNumerals {
	public int ArabicNumber = 0;
	public String RomanNumber;

	public int convertToInteger(String romanNum) {
		int i=0;
		for(i=0;i<romanNum.length();i++){
			String RomanNumber=romanNum.substring(i,i++);
			if (RomanNumber=="I"){ArabicNumber=ArabicNumber+1;}
			if (RomanNumber=="V"){ArabicNumber=ArabicNumber+5;}
			if (RomanNumber=="X"){ArabicNumber=ArabicNumber+10;}
			if (RomanNumber=="L"){ArabicNumber=ArabicNumber+50;}
			if (RomanNumber=="C"){ArabicNumber=ArabicNumber+100;}
			if (RomanNumber=="D"){ArabicNumber=ArabicNumber+500;}
			if (RomanNumber=="M"){ArabicNumber=ArabicNumber+1000;}
		}
		return ArabicNumber;
		
	}
}
