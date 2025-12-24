package day11;

public class GreetingsMain {

	public static void main(String[] args) 
	{
		// contains main method of class greetings
       Greetings gr = new Greetings ();     //object is a instance of a class it can acquires everything from class.
         gr.m1();         // it will not return anything so no need to store it within variable.
       System.out.println(gr.m2());
         String st=  gr.m2();             // it will return string so store in string variable or direct add in sprint
       System.out.println(st);
       gr.m3("Mohini");              //it return nothing so no need to store or about print we pass value so no need to print.
	   System.out.println(gr.m4("Shashi"));     //or we can store in var and print var
	}

}
