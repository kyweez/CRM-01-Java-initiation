import java.util.Scanner;

public class Scanning {
	public void login(Scanner sc, int nb, Player[] tab) {
		Message output = new Message();

		for (int i = 0; i < nb; i++) {
			output.nameOfPlayer(i);
			tab[i] = new Player(sc.nextLine(), i, 3, 0);
		}
	}

	public int numberOfPlayer(Scanner sc, Message output) {
		boolean validNumber = false;
		int numberOfPlayers = 0;

		while (!validNumber) {
			output.numberOfPlayers();
			if (sc.hasNextInt()) {
				numberOfPlayers = Integer.parseInt(sc.nextLine());
				if (numberOfPlayers >= 1 && numberOfPlayers <= 6)
					validNumber = true;
				else
					output.errorPlayerNumber();
			} else {
				output.errorPlayerNumber();
				sc.nextLine();
			}
		}
		return (numberOfPlayers);
	}
}
