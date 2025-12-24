package day11;

public class Student 
{
int sid;   // these vars is calss vars
String sname;
char grad;

void printStudentData()
{
	System.out.println(sid+ " "+sname+ " "+grad);
}

void setStudentData(int id, String name, char gr)  //we hold the data in local variables and pass the data to class variables
{
	        sid=id;  // those variables are local variables or method specific variables
			sname=name;
			grad=gr;
}

Student(int id, String name, char gr)
{
	sid=id; 
	sname=name;
	grad=gr;
}
}
