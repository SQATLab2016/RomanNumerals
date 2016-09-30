import sun.security.util.Length;

public class RomanNumerals {
	
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
		
		if(romanum.charAt(0) == 'M'){
			RomanNumAsinteger = 1000;
		}if(romanum.charAt(1) == 'C' || romanum.charAt(1) == 'D'){
				RomanNumAsinteger = RomanNumAsinteger + this.gethundreds(romanum);
		}
		
		return RomanNumAsinteger;
	}
	
	public int gethundreds(String romanum){
		int length = romanum.length();
		int hundreds = 0;
		
		if(romanum.charAt(1) == 'C'){
			hundreds = 100;
			length = length - 1;
		}else if(romanum.charAt(2) == 'C'){
				hundreds = 200;
				length = length - 2;
		}else if(romanum.charAt(3) == 'C'){
			hundreds = 300;
			length = length - 3;
		}else if(romanum.charAt(2) == 'D'){
			hundreds = 400;
			length = length - 2;
		}else if(romanum.charAt(2) == 'M'){
			hundreds = 900;
			length = length - 2;
		}else if(romanum.charAt(1) == 'D'){
			hundreds = 500;
			length = length - 1;
		}else if(romanum.charAt(2) == 'C'){
			hundreds = 600;
			length = length - 2;
		}else if(romanum.charAt(3) == 'C'){
			hundreds = 700;
			length = length - 3;
		}else if(romanum.charAt(4) == 'C'){
			hundreds = 800;
			length = length - 4;
		}
		
		return hundreds;
		
	}
	
	
}
