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

}
