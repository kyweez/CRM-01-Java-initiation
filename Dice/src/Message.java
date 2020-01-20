
public class Message
{
	public void numberOfPlayers()
	{
		System.out.println("How many players are you ? Insert a number between 1 and 6");
	}
	
	public void login(int playerNumber)
	{
		System.out.println("Player " + playerNumber + ", insert your name");
	}
	
	public void errorPlayerNumber() {
		System.out.println("You did a bad input...");
	}
}
