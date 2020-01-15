/**
 * 
 */
package outputs;

import names.Cst;

/**
 * @author Kyweez
 *
 */
public class UserInterface
{
	//This function is used to print a "Welcome Message"
	public static void fcWelcome()
	{
		System.out.println("\nWelcome to this program !\n");
	}
	
	//This function is used to print the complete beginning of the program
	public static void fcBeginProgram()
	{
		Home begin;
		begin =  new Home();
		
		begin.fcHome(Cst.PROGRAM_NAME + "\u0020" + Cst.PROGRAM);
		fcWelcome();
	}
	
	public static void askInit(final String str)
	{
			System.out.println("Please enter a " + str);
	}
	
	public static void restart()
	{
		System.out.println("Do you want to restart the program");
	}
}
