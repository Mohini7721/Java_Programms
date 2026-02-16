package day17.pack1;

public class Test2 {

public static void main(String[] args) {
//1. private 
    Test1 t = new Test1();
   // its not visible because i mark m1 method and variable x as a private
   //    System.out.println(t.x); 
   //    t.m1();  
    
//2. default 
    System.out.println(t.y); 
    t.m2();
    
//3. protected 
    System.out.println(t.z); 
    t.m3();
    
 //4. public 
    System.out.println(t.w); 
    t.m4();
    
	}

}
