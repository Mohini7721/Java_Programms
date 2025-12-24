package day10;

public class Employee {

//variables
	int eid;
	String ename;
	int sal;
	String job;
	
  //Methods
	void display()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(sal);
	}
	
	/*We can create any number of objects for the Employee class.
	If we do not use a display method in the class, we can directly print object data using statements like:
	System.out.println(emp1.eid);
    But this approach makes the code lengthy and time-consuming.
	So, it is better to use a class method to display the object data*/
	
}
