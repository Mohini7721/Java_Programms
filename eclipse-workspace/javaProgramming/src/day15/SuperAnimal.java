package day15;

public class SuperAnimal 
{
String color = "white";
 void eat()
{
	System.out.println("Eating...");
}
}

class Dog extends SuperAnimal
{
	String color ="black";  // override variable value
	void displayColor()
	{
	System.out.println(color);
	System.out.println(super.color);// super keyword invoke the immidiate super/ parent class value/variable instead of latest value.
	}
	
	void eat() // method override
	{
	System.out.println("eating bread....");
	super.eat(); //super keyword used to invoke the immediate super class method
	}
}
