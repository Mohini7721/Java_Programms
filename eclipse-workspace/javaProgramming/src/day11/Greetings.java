package day11;

public class Greetings 
{	
    //1.No parameters, NO return value
	void m1()
	{
		System.out.println("Hello..."); //it will just print hello msg will not return any value so specify method as void
	}
	
	//1.No parameters, return value
	
	String m2()
	{
		return"Hello How are you??";   //bracket is optional
	}
	
	// takes parameters, NO return value
	
	 void m3(String name)
	{
		System.out.println("Hello "+ name);
	}
   // takes parameter, return value
	 
	 String m4 (String name)
	 {
		 return("Hello "+name);
	 }
}
