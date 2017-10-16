package is.ru.StringCalc17;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringCalcTest
{
	@Test
	public void testEmptyString()
	{
		assertEquals(0, StringCalc.add(""));
	}

	@Test
	public void testOneNumber()
	{
		assertEquals(1, StringCalc.add("1"));
	}

	@Test
	public void testTwoStrings()
	{
		assertEquals(3, StringCalc.add("1,2"));
	}

	@Test
	public void testMultipleNumbers()
	{
		assertEquals(6, StringCalc.add("1,2,3"));
	}

	@Test
    public void testUnknownAmountofNumbers()
    {
    	assertEquals((3+15+31+44), StringCalc.add("3,15,31,44"));
    }

    @Test
    public void testNewLineSplit()
    {
    	assertEquals(7, StringCalc.add("1,3\n3"));
    }

    @Test(expected = RuntimeException.class)
	public final void whenNegativeNumberIsUsedThenRuntimeExceptionIsThrown() 
	{	
    	StringCalc.add("2,-4,3,-5");
	}
	@Test
	public final void whenNegativeNumbersAreUsedThenRuntimeExceptionIsThrown() 
	{
    	RuntimeException exception = null;
    	try 
    	{
    	    StringCalc.add("2,-4,3,-5");
    	} 
    	catch (RuntimeException e) 
    	{
        	exception = e;
    	}
    	//assertNotNull(exception);
    	assertEquals("Negatives not allowed: [-4, -5]", exception.getMessage());
	}
}
