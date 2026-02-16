package day17.pack2;

import day17.pack1.Test1;
import day17.pack1.Test2;

public class Test3 extends Test1 {

	public static void main(String[] args) {
		//1. private 
	    Test3 t = new Test3();
	   /*its not visible because i mark m1 method and variable x as a private
	     System.out.println(t.x); 
	    t.m1();  */
	    
	//2. default 
	/*we can access only within the package even we import so it will give error
	   System.out.println(t.y); 
	   t.m2();*/
	    
	  //3. protected 
	    /*Accessible within the same package and 
	   in subclasses (even in different package)but Only through inheritance so got error.
	   then use extends keyword extend parent to child then we can acheiev it.*/
	    System.out.println(t.z); 
	    t.m3();
	    
	    //4. Public
	    System.out.println(t.w); 
	    t.m4();
	}

}
