package day3;

public class OperatorsDemo {

	public static void main(String[] args) 
	{
          // 1. arithmetic operations
		int a = 20, b=10;
		int result = a+b ;
		System.out.println("sum of a & b is: "+ result);
		System.out.println("sum of a & b is: "+ (a+b));
//		System.out.println("sum of a & b is: "+ (a+b));
		System.out.println("diff of a & b is: "+ (a-b));
		System.out.println("multiplication of a & b is: "+ (a*b));
		System.out.println("Division of a & b is: "+ (a/b));  // return 
		System.out.println("modulo division of a & b is: "+ (a%b));  // return
		
		// 1. Relational operators > >=  <= < ==
		//all Relational returns boolean value - true/false
		// only use between 2 variables (any data types)
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);
		        b = 20;
				System.out.println(a==b);
				System.out.println(a<=b);
				System.out.println(a!=b);
		
				boolean res = a<b;
				System.out.println (a<b);
				
				// Logical operators && || !  --> AND OR NOR
				// always return boolean values - true or false
				//only use between boolean variables or values.
				
				boolean x =true ;
				boolean y = false ;
				
				System.out.println(x && y); // it need both true otherwise false
				System.out.println(x || y); //it need only one true then it will be true otherwise false
				System.out.println(!x); //false
				System.out.println(!y);//true
				
				boolean b1 = 10>20;
				boolean b2 = 20>10;
				System.out.println( "the value of b1 is: "+ b1);  //false
				System.out.println(b2); //true
				
				System.out.println(b1 && b2); //false
				System.out.println(b1 || b2); //true

				System.out.println((10<20) && (20>10)); //true
	
				//Increment & decrement operators  -> ++ --
				
	
	}

}
