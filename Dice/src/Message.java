
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
	
	public void	nameOfPlayer(int i) {
		System.out.println("Enter the player " + (i+1) + " name :");
	}
	
	public void	askRollDice() {
		System.out.println("Please press \'Enter\' to roll the dice");
	}
	
	public void	askPlayer(String playerName) {
		System.out.println(playerName + ", it's your turn to play");
	}
}
