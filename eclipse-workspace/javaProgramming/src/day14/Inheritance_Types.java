package day14;

class A   // parent class
{
	int a = 100;
	void display()
	{
		System.out.println(a);
	}
}


//extends A means whatever properties and behavior in A inherited in B
class B  extends A  // child class
{
	int b=200;
	void show()
	{
		System.out.println(b);
	}
}

//extends B means whatever properties and behavior in B inherited in B
class C extends B
{
	int c = 300;
	void print()
	{
		System.out.println(c);
	}
	
}

//this main class should have public
public class Inheritance_Types {

	public static void main(String[] args) 
	{
		
     //1. Object for single inheritance
//		B bobj = new B();  // created Object for B because we can access everything from object B because A extends in B child class.
//		  System.out.println(obj.a);
//		  System.out.println(obj.b);
//		  obj.display();
//		  obj.show();

	//2. Object for multi level inheritance
		C cobj = new C();
		//we can also directly assign the value from here
		cobj.a=400;
		cobj.b=500;
		cobj.c=600;
		
		cobj.display();
		cobj.show();
		cobj.print();
		
	}

}
