package day18;

import java.util.Scanner;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		System.out.println("Program is started...");
        Scanner sc= new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("Enter the position(0-4):");
		int position = sc.nextInt();
		System.out.println("Enter the value:");
		int value = sc.nextInt();
		a[position]=value;

		//If i entered position greater than 4 then i will throw Exception --> ArrayIndexOutOfBoundsException: 
		//Index>4 out of bounds for length 5 
		System.out.println(a[position]);
		
		System.out.println("Program is completed....");
		System.out.println("Program is executed....");


	}

}
