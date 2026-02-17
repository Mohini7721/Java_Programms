package day18;

public class MultipleCatchBlocks {

	public static void main(String[] args) 
	{
    System.out.println("Program is started.....");
	String s = null;
	try
	{
	System.out.println(s.length());
	}
	
	/*********************************************************/
//	catch(NullPointerException e)
//	{
//		System.out.println("Handled exception....");
//		System.out.println(e.getMessage()); // Display which type of exception.
//	}
//	catch(ArithmeticException e)
//	{
//		System.out.println("Handled exception....");
//		System.out.println(e.getMessage());
//	}
//	catch(NumberFormatException e)
//	{
//		System.out.println("Handled exception....");
//		System.out.println(e.getMessage());
//	}
	/*********************************************************/
	
	/*Exception class is a parent/super class of all other exceptions 
    so that Exception class will handle all type of exceptions */
	
	catch(Exception e)
	{
		System.out.println("Handled exception....");
		System.out.println(e.getMessage());
	}
	System.out.println("Program finished.....");
	}
}