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
		byte number = 0, toFind = (byte)RandGen.randomByte(Cst.MAX_R);
		boolean errorTest;
		boolean finish = false;

		UserInterface.fcBeginProgram();
		out.rules();
		while (!finish) {
			errorTest = true;
			while (errorTest) {
				out.ask(Cst.NUMBER);
				if (sc.hasNextByte()) {
					number = sc.nextByte();
					if (number >= Cst.MIN_R && number <= Cst.MAX_R)
						errorTest = false;
					else
						out.wrongValue();
				} else {
					sc.nextLine();
					out.wrongValue();
				}
			}
			if(!result.compare(number, toFind)) {
				out.fail();
				
			} else {
				out.succes();
				finish = true;
			}
		}
		System.out.println(number);
		sc.close();
	}
}
