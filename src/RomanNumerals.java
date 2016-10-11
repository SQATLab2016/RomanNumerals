import java.util.Hashtable;

public class RomanNumerals {
	private Hashtable<String, Integer> numTable;  
	
	public RomanNumerals() {
		numTable = new Hashtable<String, Integer>();
		fillNumTable();
	}

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
	private void fillNumTable() {
		numTable.put("I", 1);
		numTable.put("V", 5);
		numTable.put("X", 10);
		numTable.put("L", 50);
		numTable.put("C", 100);
		numTable.put("D", 500);
		numTable.put("M", 1000);
	}
	
	public int convertToInteger(String romanNum) throws RomanNumeralException {
		Integer ret = null;

		// test subtraction for all chars

		return singleNumToInteger(romanNum);
		
		//throw new RomanNumeralException("No equivalent found for given Roman number: " + romanNum);
	}

	public int singleNumToInteger(String num) throws RomanNumeralException, NullPointerException {
		Integer ret = null;

		if (null == num)
			throw new RomanNumeralException("Null value can't be converted from Roman numeral to Arabic");

		if (num.length() > 1)
			throw new RomanNumeralException("Only single numbers accepted");

		ret = numTable.get(num);
		
		if (null == ret)
			throw new RomanNumeralException("Arabic conversion for Roman number: " + num + " not found");

		return ret;
	}

	public boolean isSubtraction(String romanNum, int pos) throws RomanNumeralException {
		if ((romanNum.length() - 1) < pos)
			throw new RomanNumeralException(
						"Position to check for subtraction is out of bounds. roman num length was: " +
						romanNum.length() + " position was: " + pos);
		
		// Character at pos is the last character
		if ((pos + 2) >  romanNum.length())
			return false;

		// test if left from leftmost of subtraction is same as leftmost of subtraction
		// test if in IV before I is another I -> fail
		
		if (convertToInteger(romanNum.substring(pos, pos + 1)) < convertToInteger(romanNum.substring((pos + 1), (pos + 2))))
			return true;

		return false;
	}

	public boolean repeatingOkOneSymbols(String num) throws RomanNumeralException {
		int subsequentAmount = 0;
		String prev = "";
		
		for (int i = 0; i < num.length(); i++) {
			System.out.println("handling " + num.substring(i, i + 1) + "prev equal test: " + prev.equals(num.substring(i, i + 1)) );
			if (prev.equals(num.substring(i, i + 1)) && isOneSymbol(num.substring(i, i + 1))) {
				subsequentAmount++;
			} else {
				subsequentAmount = 0;
			}
			
			if (subsequentAmount > 2)
				return false;
			
			prev = num.substring(i, i + 1);
		}
		
		return true;
	}
	
	public boolean isOneSymbol(String sym) throws RomanNumeralException {
		String[] oneSymbols = {	"I", "X", "C", "M" };

		if (sym.length() > 1)
			throw new RomanNumeralException("Only one character must be checked with isOneSymbol");
		
		for (int i = 0; i < oneSymbols.length; i++) {
			if (sym.equals(oneSymbols[i]))
				return true;
		}
		
		return false;
	}
	
	public boolean isFiveSymbol(String sym) throws RomanNumeralException {
		String[] fiveSymbols = { "V", "L", "D"	};
		
		if (sym.length() > 1)
			throw new RomanNumeralException("Only one character must be checked with isFiveSymbol");
		
		for (int i = 0; i < fiveSymbols.length; i++) {
			if (sym.equals(fiveSymbols[i]))
				return true;
		}
		
		return false;
	}

	public boolean repeatingOkFiveSymbols(String num) throws RomanNumeralException {
		int subsequentAmount = 0;
		String prev = "";
		
		for (int i = 0; i < num.length(); i++) {
			if (prev.equals(num.substring(i, i + 1)) && isFiveSymbol(num.substring(i, i + 1))) {
				//System.out.println("incrementing subsqtAmt (" + subsequentAmount + ")  because of: " + num.substring(i, i + 1));
				subsequentAmount++;
			} else {
				subsequentAmount = 0;
			}
			
			if (subsequentAmount > 1)
				return false;
			
			prev = num.substring(i, i + 1);
		}
		
		return true;
	}
}
