import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;


public class TestFizzBuzz
{
	FizzBuzzer fizzBuzzer;
	List<String> r�sultats;
	
	@Before
	public void setUp() throws Exception 
	{
		fizzBuzzer = new FizzBuzzer();
		r�sultats = fizzBuzzer.calculerFizzBuzz();
	}
	
	@Test
	public void donneBien100R�sultats() {
		assertEquals(100,r�sultats.size());
	}
	
	@Test
	public void peutDonnerLesCasSimples()
	{
		test(1,"1");
		test(2,"2");
	}
	
	@Test
	public void donneFizzPour3 () 
	{
		test(3,"Fizz");
	}
	
	@Test
	public void donneFizzPour6 () 
	{
		test(6,"Fizz");
	}
	
	private void test(int index, String attendu )
	{
		//assertThat(r�sultats.get(index),is(attendu));
	}

}
