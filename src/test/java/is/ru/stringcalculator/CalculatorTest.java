package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Rule;

public class CalculatorTest {

	@Test
	public void testEmpty() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber() {
		assertEquals(2, Calculator.add("2"));
	}

	@Test
	public void testTwoNumbers() {
		assertEquals(5, Calculator.add("3,2"));
	}

	@Test
    public void testThreeNumbers(){
    	assertEquals(7, Calculator.add("4,1,2"));
    }

    @Test
    public void testFourNumbers(){
    	assertEquals(14, Calculator.add("5,2,3,4"));
    }

    @Test
    public void testNineNumbers(){
    	assertEquals(46, Calculator.add("4,6,8,3,4,5,6,1,9"));
    }

    @Test
    public void testMultipleNumbersByNewLine(){
    	assertEquals(12, Calculator.add("1\n4\n4,3"));
    }

    @Test
    public void testNumbersTooLarge(){
    	assertEquals(14, Calculator.add("1001,3,9,2000,2"));
    }
}