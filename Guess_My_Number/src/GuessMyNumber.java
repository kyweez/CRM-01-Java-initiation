import java.util.Scanner;

import names.Cst;
import outputs.Message;
import outputs.RandGen;
import outputs.Test;
import outputs.UserInterface;

/**
 * 
 */

/**
 * @author Kyweez
 *
 */
public class GuessMyNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Message out = new Message();
		Test result = new Test();
		byte input = 0, toFind = (byte)RandGen.randomByte(Cst.MAX_R), count = 0;
		boolean errorTest;
		boolean finish = false;

		UserInterface.fcBeginProgram();
		out.rules();
		while (!finish) {
			errorTest = true;
			while (errorTest) {
				count++;
				out.ask(Cst.NUMBER);
				if (sc.hasNextByte()) {
					input = (byte)Integer.parseInt(sc.nextLine());
					if (input >= Cst.MIN_R && input <= Cst.MAX_R)
						errorTest = false;
					else
						out.wrongValue();
				} else {
					sc.nextLine();
					out.wrongValue();
				}
			}
			if (result.compare(input, toFind)) {
				out.succes();
				finish = true;
			}
		}
		System.out.println("You did " + count + " tries");
		sc.close();
	}
}