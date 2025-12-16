package Day6;

public class ArraySingleDimentional {

	public static void main(String[] args) {
		//1. declaring array
	   //approach 1
		
		int a []= new int [5];  // 5 values ( no of locations) store in array of 'a' variable
        
		//2. add values into array; we can store data as per data type string char float etc...
	   // Assignment 
		
		a[0
		  ] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;  // last index
		
		// approach 2 --> most preferable approach 
	   // assign data in single line --> simple approach than first one
		
		int b[] = {100, 200, 300, 400, 500};
		// int b[] is declaration & this is adding values {100, 200, 300, 400, 500}
		
		//when use which array approach
	   // if size is fix 5 then use 1st otherwise second if you don't know size or values or want to add more values in future	
	
		
		// find length of an array
		
		System.out.println("length of an array is: "+ a.length);
	
		// read single value from an array
		
		System.out.println("value at 3rd index is: "+ a[3]); // read 3rd index value, 3 is index
		
		/*we use looping statement to print all values
		starting value means index 0
		Inc/Dec by +1/-1 
		ending at last index (a.length -1)*/
		
		// reading all the values from array
		// normal for loop
		
		for( int i = 0; i<a.length; i++) // i<=a.length-1 or i<5 or i<=4 --> all these conditions are correct
		{
		System.out.println(a[i]);	
		}

		//enhanced for loop / for each loop
		
		for (int x:a )
		{
			System.out.println(x); // the loop is works till each value of array a till it run and then stop
		}	
	}
}