package day18;

import java.util.Scanner;

public class HandleExceptions {

	public static void main(String[] args) 
	{
		System.out.println("Program is started...");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();  
		
		try
		{
		System.out.println(100/num); // we can add multiple statements we they throw exceptions
		}
		
		// we don't know what type of exception catch block will handle then mention exception a.
		catch(ArithmeticException a)
		{
			System.out.println("Invalid Number");
			//it will execute if try block throws  exception.
		}
		System.out.println("Program is completed....");
		System.out.println("Program is executed....");
	}

}
