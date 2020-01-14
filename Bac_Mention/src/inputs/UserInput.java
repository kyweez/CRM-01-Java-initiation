package inputs;

import java.util.Scanner;
import names.Cst;
import outputs.Message;

public class UserInput
{
	public static byte fcInput()
	{
		Scanner sc;
		boolean	catchError;
		byte	mark;

		sc = new Scanner(System.in);
		catchError = false;
		mark = 0;
		while(!catchError)
		{
			Message.askInit(Cst.MARK);
			if(sc.hasNextByte() ) 
			{
				mark = sc.nextByte();
				if (mark >= 0 && mark <= 20)	
					catchError = true;
				else
					MyExceptions.errorMark();
			}
			else
			{
				sc.nextLine();
				MyExceptions.noMark();
			}
		}
		sc.close();
		return (mark);
	}
}