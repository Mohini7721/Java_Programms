package day14;

class parent
{
	void display(int a)
	{
		System.out.println(a);
	}
}

//onr parent have multiple childs
class  child1 extends parent
{
	void show(int b)
	{
		System.out.println(b);
	}
}

//both child has 1 common method is display() comes from parent class
class child2 extends parent
{
	void print (int c ) 
	{
		System.out.println(c);
	}
}

public class Hierarchy_Inheritance {

	public static void main(String[] args)
	{
    child1 c1 = new child1();
    c1.display(100);
    c1.show(200);
    
    child2 c2 = new child2();
    c2.display(500);
    c2.print(1000);
    
	}

}
