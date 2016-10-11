import java.util.Hashtable;

public class RomanNumerals {
	private Hashtable<String, Integer> numTable;  
	
	public RomanNumerals() {
		numTable = new Hashtable<String, Integer>();
		fillNumTable();
	}
	
	private void fillNumTable() {
		numTable.put(arg0, arg1);
		numTable.put(arg0, arg1);
		numTable.put(arg0, arg1);
		numTable.put(arg0, arg1);
		numTable.put(arg0, arg1);
		numTable.put(arg0, arg1);
/*	1 I 	10 X 	100 C
	2 II 	20 XX 	200 CC
	3 III 	30 XXX 	300 CCC
	4 IV 	40 XL 	400 CD
	5 V 	50 L 	500 D
	6 VI 	60 LX 	600 DC
	7 VII 	70 LXX 	700 DCC
	8 VIII 	80 LXXX 800 DCCC
	9 IX 	90 XC 	900 CM
*/
	}
	
	public int convertToInteger(String romanNum) throws RomanNumeralException {
		if (romanNum.equals("I"))
			return 1;
		
		throw new RomanNumeralException("No equivalent found for given roman number: " + romanNum);
	}
	
	public boolean isSubtraction(String romanNum, int pos) throws RomanNumeralException {
		if ((romanNum.length() - 1) < pos)
			throw new RomanNumeralException(
						"Position to check for subtraction is out of bounds. roman num length was: " +
						romanNum.length() + " position was: " + pos);

		// Character at pos is the last character
		if ((pos + 2) >  romanNum.length())
			return false;

		if (convertToInteger(romanNum.substring(pos, pos)) < convertToInteger(romanNum.substring((pos + 1), (pos + 1))))
			return true;

		return false;
	}
}
