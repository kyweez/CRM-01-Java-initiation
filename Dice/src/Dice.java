import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		Scanner		sc;
		Message		output;
		Player[]	tab;
		boolean		validNumber;
		int			numberOfPlayers;
		
		output = new Message();
		sc = new Scanner(System.in);
		validNumber = false;
		numberOfPlayers = 0;
		while (!validNumber)
		{
			output.numberOfPlayers();
			if(sc.hasNextInt())
			{
				numberOfPlayers = Integer.parseInt(sc.nextLine());
				if (numberOfPlayers >= 1 && numberOfPlayers <= 6)
					validNumber = true;
				else
					output.errorPlayerNumber();
 			}
			else
			{
				output.errorPlayerNumber();
				sc.nextLine();
			}
		}
		tab = new Player[numberOfPlayers];
		for (int i = 0; i < numberOfPlayers; i++)
		{
			System.out.println("Enter the player " + (i+1) + " name :");
			tab[i] = new Player(sc.nextLine(), i, 3, 0);
		}
		for (int j = 0; j < numberOfPlayers; j++)
		{
			System.out.println(tab[j].name);
			System.out.println(tab[j].index);
		}
		
		
		sc.close();
	}

}
