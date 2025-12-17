package day7;

import java.util.Scanner;

public class TakingInputFromKeyboard {

	public static void main(String[] args) {
		//read data from run time
		
		// int num =20; --> this is hard core value
		Scanner sc = new Scanner(System.in);  // scanner object need to create to take input from system & sc is variable
		System.out.println("Enter a number: ");
		int num = sc.nextInt();    //sc.nextInt();
		System.out.println("Given number is " + num);
		
		System.out.println("Enter decimal number :");
		double num2 = sc.nextDouble();
		System.out.println("Given number is  " + num2);

		System.out.println("Enter your city: ");
		String num3 = sc.next();
		System.out.println("your city is "+ num3);
	}
}
