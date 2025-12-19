package day9;

public class StringComparison {

	public static void main(String[] args) {
		
		//String comparison 1
		String s1 =  "welcome";
		String s2 =  "welcome";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
        // so above output is same if we create strings in this format 
		
		// String comparison 2
		String s3 = new String("welcome");
		String s4 = new String("welcome");
        System.out.println(s3);
        System.out.println(s4);
        
        System.out.println(s3==s4);  //used to compare objects
        System.out.println(s3.equals(s4)); // used to compare the values of objects
	    
        //String comparison 3
        String s5 ="abc";
        String s6 = new String("abc");
        System.out.println(s5==s6);     // false objects different
        System.out.println(s5.equals(s6)); // true values are same
     
        //String comparison 4
        
       String s7="abc";
       String s8 = new String("abc"); 
       String s9=s8;
       
       System.out.println(s7==s8); //false
       System.out.println(s7.equals(s8));// true
       System.out.println(s8==s9);//true --> bcz objects are same or equal
       System.out.println(s8.equals(s9));//true
	   System.out.println(s7==s9);//false
	   System.out.println(s7.equals(s9));//true);
	//if you use notation for string new keyword always use equals() method 
	//to compare values because == use to compare objects. 
	
	}

}
