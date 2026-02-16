package day7;

import java.util.Scanner; //Built-in package

public class Taking_Multiple_Inputs {

	public static void main(String[] args) {
		//Adding two Numbers

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First number: ");
		int n1 = sc.nextInt();
		
		System.out.println("Enter second number: ");
		int n2 = sc.nextInt();
		
		System.out.println("Addition two Numbers is " + (n1+n2));
		
		System.out.println("Enter name :");
		String name = sc.next();
		
		System.out.println("Enter surname :");
		String surname = sc.next();
		
		System.out.println("Enter age :");
		int age = sc.nextInt();
		
		System.out.println("My name is "+name+", "+ "My surname is "+ surname +", "+"My age is "+age+ ".");
		
		  System.out.println("Enter Unknown value  :");
	        Object value = sc.next();   //Enter any data type it will take as string format
			System.out.println("Unknown value is: "+ value);
		
	}

}
