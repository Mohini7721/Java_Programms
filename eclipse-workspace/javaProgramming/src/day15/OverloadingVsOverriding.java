package day15;

class abc
{
	void m1(int a)
	{
		System.out.println(a);
	}
	
	void m2(int b) 
	{
		System.out.println(b);
	}
}

class xyz extends abc
{
	//method overloading - with changing declaration & implementation part as per declaration.
	void m1(int a) 
	{
		System.out.println(a*a);
	}
	
	//method overriding - without changing declaration only changed implementation part.
	void m2(int a, int b) 
	{
		System.out.println(a+b);
	}
}
public class OverloadingVsOverriding {

	public static void main(String[] args) 
	{
		xyz XYZ = new xyz();
		XYZ.m1(4);
		XYZ.m2(6);
		XYZ.m2(3, 2);
}
}