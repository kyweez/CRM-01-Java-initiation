/**
 * 
 */
package outputs;

/**
 * @author Kyweez
 *
 */
public class Home {
	public void fcHome(String str) {
		fcDelimSharp(str.length() + 4);
		fcProgramName(str);
		fcDelimSharp(str.length() + 4);
	}

	public void fcDelimSharp(int i) {
		while (i-- > 0)
			System.out.print("#");
		System.out.print("\n");
	}

	public void fcDelimDot(int i) {
		while (i-- > 0)
			System.out.print("-");
		System.out.print("\n");
	}

	public void fcProgramName(String str) {
		System.out.println("# " + str + " #");
	}
}
