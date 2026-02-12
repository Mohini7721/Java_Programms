package day15;

public class TestSuper {

	public static void main(String[] args) {
		Dog dg = new Dog(); // child method
		dg.displayColor(); // we will get black color of child class
	
		// now i want to class child obj and want get old value from parent class, 
		//possible through super keyword.
	    
		dg.eat();
		
	}

}
