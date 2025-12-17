package day7;

import java.util.Arrays;

public class Sorting_Strings {

	public static void main(String[] args) {
		String name[] = {"Mohini", "Shashi", "Sahil", "Shrushti", "Ajay"};
		System.out.println("Array before sorting----> " + Arrays.toString(name));
         
		Arrays.sort(name);
        System.out.println("Array after sorting---->" + Arrays.toString(name));
     
        char b[] = { 'w', 't', 'y', 'f', 'u' , 'v', 's'};
        System.out.println("Before sorting...." + Arrays.toString(b) );
        
        Arrays.sort(b);
        
        System.out.println("After sorting...."+ Arrays.toString(b));
	}
}
