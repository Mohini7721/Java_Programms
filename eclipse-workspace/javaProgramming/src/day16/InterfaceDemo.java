package day16;

interface Shape
{
int length = 10;  
int width = 20;   
// When we declare a variable inside an interface,
// it is by default public, static, and final.


// Default and static methods have implementation.
default void square() 
// Default method has implementation.
{
	System.out.println("this is sqaure....");
}

static void rectangle() 
// Static method also has implementation.
{
	System.out.println("this is triangle");
}

void circle(); 
// Abstract method (unimplemented method).
// It does not have a method body.
// By default, it is public and abstract.
}


// Implementing the interface using the "implements" keyword.

public class InterfaceDemo implements Shape
{
 public void circle() 
 // When implementing an abstract method from an interface,
 // we must use the public keyword.
 {
 System.out.println("this is circle - abstract method");
 }
 
 void triangle()
 {
	 System.out.println("this is triangle...");
 }

 int x=100, y=200;
	public static void main(String[] args) 
	{
		
// Scenario 1:
// Create object of InterfaceDemo class to access methods.
		InterfaceDemo iobj = new InterfaceDemo();
		iobj.circle();
		iobj.square();
		System.out.println(iobj.x+iobj.y);// Belomgs to class not interface so we can accessing through class object.

		// Static methods can be called directly using the interface name.
		// Object is not required.
		// Since triangle() is a static method inside interface,
		// we access it using InterfaceName.methodName().
		Shape.rectangle();
		iobj.triangle();		
		
// Scenario 2:
// Interface reference holding object of implementing class.
// This is called upcasting (runtime polymorphism).
		Shape sh = new InterfaceDemo(); 
		
		sh.circle();
		sh.square();
		
		// Static method is always accessed using interface name.
		Shape.rectangle(); 
		System.out.println(Shape.length* Shape.width);
		//we can accessing these variables directly by using shape interface.

	// sh.triangle();  
		// Not allowed because triangle() is not declared in the Shape interface.
		// The reference type is Shape, so it can access only methods defined in the Shape interface.

	}
}
