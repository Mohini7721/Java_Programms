package day9;

import java.util.Arrays;

public class ReverseAString {

	private static int i;

	public static void main(String[] args) {
    //Approach 1
		
		String s ="Selenium";
		String rev="";  //empty string
		
		for(int i = s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);   //1. ""+"e"  2."e" + "m"  3."em" + "o" ---> so on and rev = "emoclew" stored in rev string
		}
		System.out.println("Reverse string is :"+ rev);
	
		//Approach 2 --> without using string method
		
		String st = "welcome";
		String rev1 = "";
		
		/*convert this string into character type of array then revserve
		that char array and store in rev string.*/
		//Conversion of string to char array
		char a[] = st.toCharArray();
		
		for(int i=a.length-1;i>=0;i--)
		{
			rev = rev+a[i];
		}
		System.out.println("revserse String is:"+rev);
	   
		//Approach 3 --> using StringBuffer class to rev string
		StringBuffer sb = new StringBuffer("welcome");
		System.out.println("Reverse String is :" + sb.reverse());
		
		
		//Approach 4  --> using StringBuilder class to rev string
		StringBuilder sb1 = new StringBuilder ("welcome");
		System.out.println("Reverse string is :"+ sb1.reverse());	
	}	
}