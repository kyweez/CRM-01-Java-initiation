import java.util.Scanner;

public class Scanning {
	public void login(Scanner sc, int nb, Player[] tab) {
		Message output = new Message();

		for (int i = 0; i < nb; i++) {
			output.nameOfPlayer(i);
			tab[i] = new Player(sc.next(), i, 3, 0);
		}
	}

	public int numberOfPlayer(Scanner sc, Message output) {
		boolean validNumber = false;
		int numberOfPlayers = 0;

		while (!validNumber) {
			output.numberOfPlayers();
			if (sc.hasNextInt()) {
				numberOfPlayers = Integer.parseInt(sc.next());
				if (numberOfPlayers >= 1 && numberOfPlayers <= 6)
					validNumber = true;
				else
					output.errorPlayerNumber();
			} else {
				output.errorPlayerNumber();
				sc.next();
			}
		}
		return (numberOfPlayers);
	}
//TODO Gerer le retour du scanner en n'acceptant que la touche Enter
	public void roll(Scanner sc, Message output, Player tab[]) {
		String readString = sc.nextLine();
		int i, j;
		
		i = 0;
		while (i < tab.length) {
			output.askPlayer(tab[i].name);
			j = 3;
			while (j != 0 && readString != null) {
				if (readString.isEmpty()) {
					output.askRollDice();
					
				} 
				if (sc.hasNextLine())
					readString = sc.nextLine();
				else {
					readString = null;
					output.errorPlayerNumber();
				}
				if (readString != null)
					j--;
			}
			i++;
		}
	}
}
