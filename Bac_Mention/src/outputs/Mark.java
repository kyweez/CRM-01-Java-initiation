package outputs;

public class Mark
{
	public String mention(byte a)
	{
		if (a < 10)
			return(a < 8 ? "Refused" : "Re-take exam"); 
		else if (a < 14)
			return(a < 12 ? "Accepted" : "Pretty good mention"); 
		else
			return(a < 16 ? "Good " : "Very good mention"); 
	}
}
