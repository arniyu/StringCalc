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
}
