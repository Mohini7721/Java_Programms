package day14;

public class PassingParamsToMainMethod {
//How to pass parameters in main method
	public static void main(String[] args) 
	{
		// to find length of this string type array of main method
		System.out.println(args.length); // 0 because till be did not pass value in array
		System.out.println("Testing........");
	for(String x:args)   //value:args --> it will take all values as a strings
	{
	System.out.println(x);	
	}
	}

}
