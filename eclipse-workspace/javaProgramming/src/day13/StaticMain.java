package day13;

public class StaticMain {

	public static void main(String[] args) {
// But when we separate main method into another class 
//that time we can not access static stuff directly through main method
// we need to call variable method through class name
		System.out.println(StaticDemo.a);
	    StaticDemo.m1();
	    StaticDemo sd = new  StaticDemo();
	    System.out.println(sd.b);
	    sd.m2();
	    sd.m();
	    
		}

}
