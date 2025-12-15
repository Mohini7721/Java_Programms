package Day4;

public class Assigment1 {

	public static void main(String[] args) {
		// 1. find largest of 2 numbers by if else and ternary
		 int a= 2, b=500;
		 if (a>b)
		 {
			 System.out.println("a is the largest number");
		 }
		 else
		 {
			 System.out.println("b is the largest number");
		 }
		
		 int larget_no=(a>b)?a:b;
		 System.out.println("largest number of two is:" + larget_no);
		
        //2. smallest of three numbers 
		 int c =100, d=320, e=30;
		 
		 if (c<d && c<e)
		 {
			 System.out.println("c is smallest number");
		 }
		 else if (d<c && d<e)
		 {
			 System.out.println("d is smallest number");
		 }
		 else
		 {
			 System.out.println("e is smallest number");
		 }
		 
		// 3.print week number based on week name
  
		String weekname = "Monday";
		switch (weekname)
		{
		case "sunday" : System.out.println(1);
		break;
		case "tuesday" : System.out.println(3);
		break;
		case "wednesday" : System.out.println(4);
		break;
		case "thursday" : System.out.println(5);
		break;
		case "friday" : System.out.println(6);
		break;
		case "saturday" : System.out.println(7);
		break;
		case "Monday" : System.out.println(2);
		break;
		default : System.out.println("invalid week name");
		}
	}
}
