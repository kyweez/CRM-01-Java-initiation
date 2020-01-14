/**
 * 
 */
package outputs;

import inputs.UserInput;
import names.Cst;

/**
 * @author Kyweez
 *
 */
public class Message
{
	public static void askInit(final String str)
	{
		if (str.equals(Cst.MARK))
			System.out.println("Please enter a " + str);
	}
	
	public static void result()
	{
		Mark objectMark = new Mark();
		String str;
		
		str = objectMark.mention(UserInput.fcInput());
		System.out.println(str);
	}
	public static void restart()
	{
		System.out.println("Do you want to restart the program");
	}
}
