package day3;

public class TernaryOperator {

	public static void main(String[] args) {
		//var=exp?result1:result2;
		
		//ex 1
//		int a =200, b=100;
//		int x = (a>b)?a:b;
//		int y = (a<b)?a:b;
//		System.out.println(x);
//		System.out.println(y);
		// if exp is true then value of A assign to X if exp value is false then value of b assign to X
		
		// ex 2
//		int x =(1==1)?100:200;
//		System.out.println(x);
//		
//		int y =(1==2)?100:200;
//		System.out.println(y);
		
		// means if exp is true then first value assign to X otherwise second if exp is false.
		
		//Ex3 
		int person_age = 30;
		int person2_age = 15;
		String res = (person_age>=18)?"eligible":"not eligible";
		String res2 = (person2_age>=18)?"eligible":"not eligible";
		System.out.println(res);
		System.out.println(res2);	

	}

}
