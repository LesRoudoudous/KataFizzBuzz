import java.util.ArrayList;
import java.util.List;

public class FizzBuzzer 
{
	public List<String> calculerFizzBuzz()
	{
		final ArrayList<String> strings = new ArrayList<String>(100);
		for(int i = 0; i < 100 ; i++)
		{
			strings.add(valeurPour(i));
		}
		return strings;
	}
	
	public String valeurPour(int index)
	{
		if(estMultipleDe3(index) )
		{
			return "Fizz";
		}
		return String.valueOf(index);
	}
	
	public boolean estMultipleDe3(int index)
	{
		return index % 3 == 0;
	}
}
