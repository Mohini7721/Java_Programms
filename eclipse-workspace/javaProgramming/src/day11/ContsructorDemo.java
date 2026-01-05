package day11;

public class ContsructorDemo {
	
	int x,y;
	
	ContsructorDemo() // Default constructor
	{
	x=100;
	y=200;
	}

	ContsructorDemo(int a, int b) //parameterized constructor
	{
		x=a;
		y=b;
	}
	
	void sum()
	{
		System.out.println(x+y);
	}
	
	public static void main(String[] args) 
	{
		ContsructorDemo cd = new ContsructorDemo();	
		//If you want to invoke both then give object var name cd & cd1 ContsructorDemo cd = new ContsructorDemo();
		//ContsructorDemo cd1 = new ContsructorDemo(); // object will invoke default constructor
		//ContsructorDemo cd2 = new ContsructorDemo(10,20); // object will invoke parameterized constructor 
		//cd1.sum(); 
		//cd2.sum();
		cd.sum();
		
	}
}
