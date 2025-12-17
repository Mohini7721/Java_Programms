package day7;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		//reverse an array
		int a[] = {100,200,300,400,500};
		
		for(int i=a.length-1 ; i>=0; i--)  // or int i=4
		{
			System.out.print(a[i]+" ");
		}
	}
}
