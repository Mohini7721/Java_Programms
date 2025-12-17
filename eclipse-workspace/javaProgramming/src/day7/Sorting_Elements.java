package day7;

import java.util.Arrays;

public class Sorting_Elements {

	public static void main(String[] args) {
		//Sorting of numbers in ascending or descending 
		
		int a[] = {300, 400, 100, 200, 500};
		System.out.println("before sorting ");
		System.out.println(Arrays.toString(a)); //Arrays is predefined class and toString is method pass name of array 'a'.
		
		System.out.println("After Sorting");
		Arrays.sort(a);  //method for sort elements in array
        System.out.println(Arrays.toString(a));
	}

}
