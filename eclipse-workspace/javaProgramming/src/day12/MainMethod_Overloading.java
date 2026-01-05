package day12;

public class MainMethod_Overloading {
//only parameters we considers in overloading concept so only focus on it.
	void main(int x)
	{
		System.out.println(x);
	}
	
	void main(String s)
	{
		System.out.println(s);
	}
	
	void main(String s1, String s2)
	{
	System.out.println(s1+s2);	//Concatenation
	}
	
	public static void main(String[] args) //args is just parameters name we can change like ar, arg like that
	{	                                   // but its string array type of arguments or parameter
		MainMethod_Overloading mmo = new MainMethod_Overloading();
		mmo.main(100);
		mmo.main("momo");
		mmo.main("shashi", " mittewad");
	}
}
