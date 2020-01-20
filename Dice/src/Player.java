import java.util.Random;

public class Player {
	public Player(String a, int b, int c, int d) 
	{
		name = a;
		index = b;
		tryNumber = c;
		result = d;
	}
	
	public int rand (int result)
	{
		Random number = new Random();
		return ((number.nextInt(6) + 1));
	}
	
	String	name;
	int		index;
	int		tryNumber;
	int		result;
}