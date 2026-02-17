package day18;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) 
	{


//Scanner --> class in java
//sc --> reference variable (stores address of object)
//The new keyword is used to create an object and allocate memory for it.
//new Scanner(System.in) --> creates object
//nextInt(); --> method is scanner class, integer input

System.out.println("Program is started...");
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int num = sc.nextInt();    
System.out.println(100/num);

System.out.println("Program is completed....");
System.out.println("Program is executed....");

	}
}
