package is.ru.StringCalc17;
import java.util.ArrayList;


public class StringCalc
{
	public static int add(String text)
	{
    	if(text.equals(""))
    	{
    		return 0;
		}
		else 
		{
			if(text.contains(","))
			{
				String[] numbers = text.split(",");
				return sum(numbers);
			}
			return 1;
		}
		
	}

	private static int toInt(String number)
	{
		return Integer.parseInt(number);
	}

	private static int sum(String[] numbers)
	{
    	int total = 0;
    	ArrayList<Integer> negNum = new ArrayList<Integer>();
    	for(String number : numbers)
    	{
	    	//total += toInt(number);
	    	int indexNumber = toInt(number);
        	if (indexNumber < 0)
        	{
		    	negNum.add(indexNumber);
        	}
        	else
		    	{
		    		if (indexNumber > 1000)
		    		{
		    			continue;
		    		}
		    		else
		    		{
		    			total += indexNumber;
		    		}
		    	}
		    if(negNum.size() > 0)
		    {
				throw new RuntimeException("Negatives not allowed: " + negNum);
			}
		}
		return total;
	}

	private static String[] splitNumbers(String numbers)
	{
		String delimiter = ",|\n";
		if (numbers.startsWith("//"))
		{
			int delimiterIndex = numbers.indexOf("//") + 2;
			delimiter = delimiter + "|" + numbers.substring(delimiterIndex, delimiterIndex + 1);
			numbers = numbers.substring(delimiterIndex + 2);
			return numbers.split(delimiter);
		}
		else 
		{
			return numbers.split(delimiter);	
		}

	}

}
