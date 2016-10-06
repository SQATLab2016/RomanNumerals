import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testTwo(){	
		
		assertEquals("Check",2,RomanNumerals.convert("II"));
	}
	
	@Test
	public void testSpecialLetters(){	
		
		assertTrue("Check",RomanNumerals.checkCharacters("VI"));
	}

	@Test
	public void testRepite3(){	
		
		assertFalse("Check",RomanNumerals.checkRepetition3("VIIII"));
	}
	
	@Test
	public void testRepite2(){	
		
		assertFalse("Check",RomanNumerals.checkRepetition2("VIVIV"));
	}
	
	@Test
	public void testSubstraction(){	
		
		assertEquals("Check",'I',RomanNumerals.checkSubstraction("IX"));
	}
	
	@Test
	public void testOneSubstraction(){
		
		assertFalse("Check",RomanNumerals.oneSubstraction("XXC"));
	}
	
	@Test
	public void test5Symbols(){
		
		assertEquals("Check",' ',RomanNumerals.checkSubstraction("LX"));
	}

}
