package day2;

public class DataTypeDemo {

	public static void main(String[] args) {
		//numeric data type without decimal
		int a=100, b=200;
		int c= a+b;
		System.out.println("the value of a is: " + a);
		System.out.println("the value of b is: " + b);
		System.out.println("the value of c is: " + c); // or
		System.out.println(a+b);
		System.out.println("the value of a & b is: " + (a+b));

byte d = 125;
System.out.println(d);
short s = 3535;
System.out.println(s);
long l = 233232323232l; // l as literal for long number its mandatory
System.out.println(l);

//numeric data type without decimal - float, double
float f = 15.5f;
System.out.println(f);

double dl = 123.55555;
System.out.println(dl);
//literal is also needed for long (L/l) and float (F/f).

char ch = 'm';
System.out.println(ch);

String name = "mohini";
System.out.println(name);

// char ch2 = 'ABC';   invalid
// String sh = 'ABC';  invalid
// String sh2 = 'A';   invalid
String sh3 = "A";       //valid
System.out.println(sh3);

boolean b1 = false;
System.out.println(b1);

boolean b2 = true;
System.out.println(b2);

//boolean b1 = "false";    //those are invalid
//boolean b2 = "true";

//String sh4 = true;  invalid 
String sh5 = "true";   // valid
System.out.println(sh5);


	
	}

}
