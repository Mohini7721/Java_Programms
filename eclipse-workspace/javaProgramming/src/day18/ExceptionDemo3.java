package day18;

import java.util.Scanner;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		System.out.println("program is started");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		String s = sc.next();
		int num = Integer.parseInt(s);
		//System.out.println(num);
		System.out.println("Sum of numbers: "+ (num+num));
		
		String s1 = "welcome";
		String s2 = null; // throw NullPointerException.
		
	    System.out.println("Length of s1 string is : " + s1.length());
		System.out.println("Length of s2 string is : " + s2.length());
	    System.out.println("Program is completed....");
		System.out.println("Program is executed....");
	
	}
}
