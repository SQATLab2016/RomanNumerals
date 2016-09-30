import java.util.HashMap; 
public class RomanNumerals {
	public int convertToInteger(String romanNum) throws Exception {
		String[] str = new String[6];
		str[0] = "VV";	str[0] = "LL";	str[0] = "DD";	str[0] = "IIII";	str[0] = "XXXX";	str[0] = "CCCC";
		int i=0;
		for( i=0 ; i<6 ; i++)
		{
			if( romanNum.contains(str[i]))
				throw new ContainSuccessive_1_Number();
		}
		HashMap<String,Integer> hashmap = new HashMap<String,Integer>();
		hashmap.put("I", 1);	hashmap.put("V", 5);	hashmap.put("X", 10);	hashmap.put("L", 50);
		hashmap.put("C", 100);	hashmap.put("D", 500);	hashmap.put("M", 1000);	hashmap.put("IV", 4);
		hashmap.put("IX", 9);	hashmap.put("XL", 40);	hashmap.put("XC", 90);	hashmap.put("CD", 400);	hashmap.put("CM", 900);
		int result = 0;
		int index = 0;
		while( index<romanNum.length() )
		{
			if( !hashmap.containsKey(romanNum.substring(index,index+1)) )
				throw new ContainOtherCharacterException();
			if( index==romanNum.length()-1 )
			{		result += hashmap.get(romanNum.substring(index,romanNum.length()));		break;	}
			if( hashmap.containsKey(romanNum.substring(index,index+2)) )
			{		result += hashmap.get(romanNum.subSequence(index, index+2));	index +=2;		}
			else
			{	result += hashmap.get(romanNum.substring(index,index+1));		index++;		}
		}
		return result;		
	}
	class ContainOtherCharacterException extends Exception{
		public ContainOtherCharacterException(){}
	}
	
	class ContainSuccessive_1_Number extends Exception{
		public ContainSuccessive_1_Number(){}
	}
}
