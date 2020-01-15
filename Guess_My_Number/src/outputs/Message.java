package outputs;

public class Message {
	public void ask(final String str) {
		System.out.println("Please enter a " + str);
	}

	public void fail() {
		System.out.println("You failed... Try again bro !");
	}

	public void succes() {
		System.out.println("\nGreat job !");
	}

	public void restart() {
		System.out.println("Do you want to restart the program");
	}

	public void rules() {
		Home delim;
		String str;

		str = "Rules : You have to guess a number between 0 and 100";
		delim = new Home();
		System.out.println(str);
		delim.fcDelimDot(str.length());
	}

	public void wrongValue() {
		System.out.println("You didn't enter a value between 0 and 100...");
	}

	public void tryNumber() {
		System.out.println("You didn't enter a value between 0 and 100...");
	}
}