
public class RomanNumerals {
	public int ArabicNumber = 0;
	public String RomanNumber;

	public int convertToInteger(String romanNum) {
		String[] RomanNumber = romanNum.split("");
		int i=0;
		for(i=0;i<RomanNumber.length;i++){
			if (RomanNumber[i]=="I"){
				ArabicNumber++;
			}
			if (RomanNumber[i]=="V"){
				ArabicNumber=ArabicNumber+5;
			}
			if (RomanNumber[i]=="X"){
				ArabicNumber=ArabicNumber+10;
			}
			if (RomanNumber[i]=="L"){
				ArabicNumber=ArabicNumber+50;
			}
			if (RomanNumber[i]=="C"){
				ArabicNumber=ArabicNumber+100;
			}
			if (RomanNumber[i]=="D"){
				ArabicNumber=ArabicNumber+500;
			}
			if (RomanNumber[i]=="M"){
				ArabicNumber=ArabicNumber+1000;
			}
		}
		return ArabicNumber;
		
	}
}
