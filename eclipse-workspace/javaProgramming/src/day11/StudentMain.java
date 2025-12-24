package day11;

public class StudentMain {

	public static void main(String[] args) {
//		Student st = new Student();
//		st.sid=121;    //1.store data using object refrence variable. 
//		st.sname="shashi";
//		st.grad='A';
//		st.printStudentData();
		
		//2.using method to pass data
		//st.setStudentData(101, "Mohini", 'B');
		//st.printStudentData();
		
		//3.Using constructor  --> it is a part of class
		Student st = new Student(101, "Mohini", 'C');
		st.printStudentData();
	}
}
