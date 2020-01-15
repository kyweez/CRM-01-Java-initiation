package outputs;

import java.util.Random;

public class RandGen {
	public static int randomByte(int nb) {
		Random generator;
		int randomNumber;

		generator = new Random();
		randomNumber = generator.nextInt(nb + 1);
		return (randomNumber);
	}
}
