
public class RomanNumerals {
	
	String romanNum = "";
	
	public int convertToInteger(String romanNum) {
		if (romanNum == "") return 0;
		if (romanNum.startsWith("M")) return 1000 + convertToInteger(romanNum.replace("M", ""));
		if (romanNum.startsWith("CM")) return 900 + convertToInteger(romanNum.replace("CM", ""));
		if (romanNum.startsWith("D")) return 500 + convertToInteger(romanNum.replace("D", ""));
		if (romanNum.startsWith("CD")) return 400 + convertToInteger(romanNum.replace("CD", ""));
		if (romanNum.startsWith("C")) return 100 + convertToInteger(romanNum.replace("C", ""));
		if (romanNum.startsWith("CX")) return 90 + convertToInteger(romanNum.replace("M", ""));
		return 0;
		
	}
}
