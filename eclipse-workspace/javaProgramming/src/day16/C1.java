package day16;
//parent class C1
// we can implements multiple interface, but not extends multiple

public class C1 extends C2 implements I1, I2 
//Hybrid inheritance -> combination of hierarchical and multiple inheritance.
{
	public void m1()
	{
		System.out.println(x);
	}
	
	public void m2()
	{
		System.out.println(y);
	}
	public static void main(String[] args) 
	{
		
		//so this is call multiple inheritance
       C1  c1obj = new C1();
       c1obj.m1();
       c1obj.m2();
       c1obj.m3();
         
	}

}
