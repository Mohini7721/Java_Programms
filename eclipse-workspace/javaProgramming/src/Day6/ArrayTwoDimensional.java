package Day6;

public class ArrayTwoDimensional {

	public static void main(String[] args) {
		//declaring array
		//approach 1
		
		//adding values
		int a[][] = new int[3][2]; //int[R][C]  | int []a[] | int [][]a
		// Row 1
		a[0][0] = 100;
		a[0][1] = 200;
		
		// Row 2
		a[1][0] = 300;
		a[1][1] = 400;
		
		//Row 3
		a[2][0] = 500;
		a[2][1] = 600;
		
		//approach 2
		
		int b[][] = {{100,200},     // {{R1}, {R2}, {R3}}; | {{100,200},{300,400},{500,600}};
				     {300,400}, 
				     {500,600}
				    };
		
		System.out.println("length of rows " +a.length);
		System.out.println("length of columns "+a[0].length);
		// why we take a[0] means from which row we have to check column count so that we take a[0].
		
		//reading single value from an array
		System.out.println(a[2][1]); // 600
		
		// reading all the values from array
		// we have to nested for loop bcz we have rows and cols
		//a.length = 3 //no of rows 
		//a.length-1 =2 //no of index
		for(int r=0; r<=2; r++) // 0 1 2 3   //r<=a.length-1 --> when we don't know length of column //outer for loop
		{
			for(int c=0 ; c<=1;c++)  //0 1 2    //r<=a[r].length-1  // inner for loop for incrementing the columns
			{
				System.out.print(a[r][c] +" "); //100 200 space
			}
			System.out.println();  // jumping into the next line so we need enter means 100 200 enter 300 400 enter
		}
		
		//enhanced for loop
		
	for(int arr[]:a)
	{
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();
	}
		

	}

}
