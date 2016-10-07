import sun.security.util.Length;

public class RomanNumerals {
	
	int length;
	int length1;
	
	
	public int convertToInteger(String romanNum) {
	
	int Resultnum = 0;
		
	switch(romanNum){
		case "I":
			Resultnum = 1;
			break;
		case "II":
			Resultnum = 2;
			break;
		case "III":
			Resultnum = 3;
			break;
		case "IV":
			Resultnum = 4;
			break;
		case "V":
			Resultnum = 5;
			break;
		case "VI":
			Resultnum = 6;
			break;
		case "VII":
			Resultnum = 7;
			break;
		case "VIII":
			Resultnum = 8;
			break;
		case "IX":
			Resultnum = 9;
			break;
		}
	
	return Resultnum;
	
	}
	
	public int get_Roman_Number(String romanum){
		
		int RomanNumAsinteger = 0;
		int Charsleft = 0;
		
		if(romanum.charAt(0) == 'M'){
			RomanNumAsinteger = 1000;
			Charsleft = Charsleft + 1;
		}if(romanum.charAt(1) == 'C' || romanum.charAt(1) == 'D'){
				RomanNumAsinteger = RomanNumAsinteger + this.gethundreds(romanum);
		}
		
		int Length4 = romanum.length() - length - Charsleft - 1;
		Charsleft = romanum.length() - Length4;
		
		if(romanum.charAt(Charsleft) == 'X' || romanum.charAt(Charsleft) == 'L'){
			RomanNumAsinteger = RomanNumAsinteger + this.getTens(romanum, Length4);
		}if(romanum.charAt(0) == 'I' || romanum.charAt(0) == 'V'){
			RomanNumAsinteger = convertToInteger(romanum);
		}
		
		String number = null;
		int length3 = length1 + Charsleft;
		
		while(length3 != romanum.length()){
			number = romanum.charAt(length3) + number;
			length3++;
		}
		
		if(length3 == romanum.length()){
			RomanNumAsinteger = RomanNumAsinteger + convertToInteger(number);
		}
		
		return RomanNumAsinteger;
	}
	
	public int gethundreds(String romanum){
		
		int hundreds = 0;
		
		if(romanum.charAt(1) == 'C' && romanum.charAt(2) != 'C'){
			hundreds = 100;
			length = length + 1;
		}else if(romanum.charAt(2) == 'C' && romanum.charAt(3) != 'C'){
				hundreds = 200;
				length = length - 2;
		}else if(romanum.charAt(3) == 'C'){
			hundreds = 300;
			length = length + 3;
		}else if(romanum.charAt(2) == 'D'){
			hundreds = 400;
			length = length + 2;
		}else if(romanum.charAt(2) == 'M'){
			hundreds = 900;
			length = length + 2;
		}else if(romanum.charAt(1) == 'D'){
			hundreds = 500;
			length = length + 1;
		}else if(romanum.charAt(2) == 'C'){
			hundreds = 600;
			length = length + 2;
		}else if(romanum.charAt(3) == 'C'){
			hundreds = 700;
			length = length + 3;
		}else if(romanum.charAt(4) == 'C'){
			hundreds = 800;
			length = length + 4;
		}
		
		return hundreds;
		
	}
	
	public int getTens(String romanum, int length2){
		int tens = 0;
		length1 = length2;
		
		if(romanum.charAt(length1) == 'X' && romanum.charAt(length1 + 1) != 'X'){
			tens = 10;
			length1++;
		}if(romanum.charAt(length1 + 1) == 'X' && romanum.charAt(length1 + 2) != 'X'){
			tens = 20;
			length1 = length1 + 2;
		}if(romanum.charAt(length1 + 2) == 'X'){
			tens = 30;
			length1 = length1 + 3;
		}if(romanum.charAt(length1 + 2) == 'L'){
			tens = 40;
			length1 = length1 + 2;
		}if(romanum.charAt(length + 2) == 'C'){
			tens = 90;
			length1 = length1 + 2;
		}
		
		if(romanum.charAt(length1) == 'L'){
			tens = 50;
			length1++;
		}if(romanum.charAt(length1 + 2) == 'X' && romanum.charAt(length1 + 3) != 'X'){
			tens = 60;
			length1 = length1 + 2;
		}if(romanum.charAt(length1 + 3) == 'X' && romanum.charAt(length1 + 4) != 'X'){
			tens = 70;
			length1 = length1 + 3;
		}if(romanum.charAt(length1 + 4) == 'X'){
			tens = 80;
			length1 = length1 + 4;
		}
			
		return tens;
		
		}
		
}
