/**
 * 
 */
package outputs;

/**
 * @author Kyweez
 *
 */
public class Home
{
	public void fcHome(String str)
	{
		fcDelim(str.length() + 4);
		fcProgramName(str);
		fcDelim(str.length() + 4);
	}
	
	public void fcDelim(int i)
	{
		while (i-- > 0)
			System.out.print("#");
		System.out.print("\n");
	}
	
	public void fcProgramName(String str)
	{
		System.out.println("# " + str + " #");
	}
}
