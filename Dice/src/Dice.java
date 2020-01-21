import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		Scanner		sc = new Scanner(System.in);
		Message		output = new Message();
		Scanning	input = new Scanning();
		
		int			numberOfPlayers = input.numberOfPlayer(sc, output);
		Player[]	tab = new Player[numberOfPlayers];
		
		input.login(sc, numberOfPlayers, tab);
		input.roll(sc, output, tab);
		sc.close();
	}

}
