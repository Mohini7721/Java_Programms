package day9;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) {

    //Mutable-->this string sort method is able to change original array elements called mutable  
	int a [] = {20, 10, 40, 50, 30};
	System.out.println("Before sorting...." + Arrays.toString(a));
	Arrays.sort(a);  
	System.out.println("After sorting...." + Arrays.toString(a));
	
	//Immutable --> can not change
	
	String s = new String("welcome ");
	System.out.println(s);//welcome
	s.concat("to java");
	System.out.println(s);//welcome --> immutable 
	String concatstring = s.concat("to java");
	System.out.println(concatstring);  //--> welcome to java --> mutable
	}

}
