package day13;

public class ThisKeyword {
int x, y;     //class variables/instance variables -- we can access everywhere within class
double w,z;

//case 1 ->  at the time of object creation this constructor is automatically invoked.
//ThisKeyword(int a, int b)  // a & b are local variables and they will access only within that method where we have created
//{
//	this.x=a;
//	this.y=b;
//}           

void display()
{
	System.out.println(x*y);
	System.out.println(x);
	System.out.println(y);
}
// case 2 -> suppose we use same variables name for class and local variables.
ThisKeyword(double w, double z)
{
	this.w=w;    //constructor will confuse which one is local and class variables 
	this.z=z;    //so use this keyword is indicate that class means variables is belong to class.
}

void display2()
{
	System.out.println(w+z);
	System.out.println(this.w);
	System.out.println(this.z);
}

//Using method instead of constructor
	
void setData(int m, int n)
{
	this.x=m;
	this.y=n;
}

//Main method
public static void main(String[] args) 
	{
	    ThisKeyword tk = new ThisKeyword(10,30);
	    tk.display();
		ThisKeyword tk2 = new ThisKeyword(10.5,20.5);
		tk2.display2();  // output 0 0 display2 constructor got confused run program but through logically error.
        tk.setData(10, 40);
        tk.display();
	}
}
