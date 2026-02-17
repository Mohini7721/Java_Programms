package day18;

public class FinallyBlock {

	public static void main(String[] args) 
	{
	System.out.println("Exception Program is started...");
		
	String s = null;
		
		try
		{
		System.out.println(s.length()); 
		}
		
		catch(NullPointerException e)
		{
			System.out.println("Catch block handled exception");
			System.out.println(e.getMessage());
		}
		
		finally 
		{
			System.out.println("you entered into finally block");
		}
		
		System.out.println("Program is executed....");
	}

}
