package outputs;

public class Test {
	public boolean compare(byte inputNumber, byte searchedNumber) {
		if (inputNumber == searchedNumber)
			return (true);
		else if (inputNumber < searchedNumber) {
			System.out.println("It' more\n");
			return (false);
		}
		else {
			System.out.println("It' less\n");
			return (false);
		}
	}
}
