package day10;

public class EmployeeMain {

	public static void main(String[] args) 
	{
		Employee emp1 = new Employee();  //object
		//Data of emp1 object
		emp1.eid=100;
		emp1.ename="mohini";
		emp1.job="QA";
		emp1.sal=30000;	
		emp1.display();
		
		Employee emp2= new Employee();
		emp2.eid=101;
		emp2.ename="shashi";
		emp2.job="Senior QA";
		emp2.sal=70000;
		emp2.display();
		
	}

}
