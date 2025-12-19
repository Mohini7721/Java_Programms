package day8;

import java.util.Arrays;

public class StringMethods {

	//these methods are only applicable for strings type of data
	public static void main(String[] args) {
		//String Methods
		String s = "welcome";  
		// or String s = new String("welcome"); --> use when we create string class object.
        System.out.println(s);
        
    //Different types of methods in String
        
        //1. Length of string --> count no of characters
        
        String s1 = new String ("you are");  //count with space 
        int l = s1.length();
        System.out.println("length of you are is :" + l);
       // or System.out.println(s.length());   --> 7
       // System.out.println("you are".length()); --> 7
        
        //2. concat method --> we can join 2 or multiple strings --> joining string
        String s2 = "Welcome";
        String s3 = " to java ";
        String s4 = "Mohini !!!.";
       // System.out.println(s2+s3); --> welcome to java
        s2.concat(s3);   // s2 concat of s3
        System.out.println(s2.concat(s3));
        
        //concat more than 2 --> we can concat only 2 strings
        System.out.println(s1+s2+s3);
        System.out.println(s1.concat(s2).concat(s3));
        System.out.println(s1.concat(s2+s3));
        System.out.println(s1.concat(s2).concat(s3).concat(s4));
        System.out.println(s1.concat(s2+s3+s4));
        System.out.println(s1.concat(s2)+s3.concat(s4));
        System.out.println(s1.concat(s2+s3).concat(s4));
        
        System.out.println("you are "+ "Welcome "+ "to java "+ "Mohini !!!.");
        
        //3. Trim method --> it will remove spaces right and left side
        String s5 = "  welcome  ";
        System.out.println("Before trimming" + s5);    // print string along with spaces
        System.out.println("After Trimming  " + s5.trim());
        
        System.out.println("Length before trimming " + s5.length()); 
        System.out.println("Lenght after Trimmed " + s5.trim().length());
        
        // 4. charAt() method --> return character from string based on index.
	    
	     String s6 = "shashikant";
	     System.out.println("Character on 6th idex is :" + s6.charAt(6));
	     
	     //5 .contains() --> it used to searching character or string is a part or existing string or not
	     // contains methods is always returns a boolean value--> true/false
	     // Values are case sensitive
	     
	     //boolean s7 = s.contains("wel");
	     //System.out.println(s7);
	     System.out.println(s.contains("wel"));     //true
	     System.out.println(s4.contains("Mohi"));  //true
	     System.out.println(s3.contains("JAVA"));  //false
	     System.out.println(s4.contains("Moni")); //false
	     
	     //6. equals() & equalsIgnoreCse() --> used for comparing strings
	     //equalsIgnoreCse()   --> but its not case sensitive it ignores upper and lower case sensitivity
	    String  s8="welcome";
	    String  s9="welcome";
	    System.out.println(s8==s9);
	    System.out.println(s8.equals(s9));
	    System.out.println(s8.equals("welcome"));
	    System.out.println(s8.equalsIgnoreCase("Welcome"));
	    
	    //7. replace() --> it will replace single or multiple(sequence) characters in a string
	    s= "welcome To selenium java selenium python selenium c#";
	    System.out.println(s.replace("welcome","Come"));
	    System.out.println(s.replace("selenium","playwrigth"));
	    
	    //8. substring() --> extract substring from the main string	
	   // it will extract substring from main string based upon the indexes we passed.
	    // s.substring(1,4); --> starting index start from 0 and ending index start from 1
	    s ="Mohini Shashikant Mittewad";
	    System.out.print(s.substring(0,6)+" ");
	    System.out.print(s.substring(7,13)+" ");
	    System.out.println(s.substring(18,26));
	    
	    //9.toUpperCase() & toLowerCase()
	    s1="mohini";
	    s2="ARUNA";
	    System.out.println(s1.toUpperCase());
	    System.out.println(s2.toLowerCase());
	    
	    /*10.split() --> split the string into multiple parts based on delimeter.
	    /split method returns array because it split into two values and more than one
	     value only we can store in array so that we use array to store split values*/
	   
	    s="abc@gmail.com";
	    s.split("@"); // it will split this string into two parts so we store it into array means in single dimentional array.
	   
	    String a[]= s.split("@"); 
	    System.out.println(a[0]);
	    System.out.println(a[1]);
	    System.out.println(Arrays.toString(a));
	    
	    String amount = "$15,20,55";
	   System.out.println(amount.replace("$","").replace(",",""));	    
	    s="abc,123@xyz";
	   String arr[]= s.split(",");
	   System.out.println(Arrays.toString(arr)); 
	   // String arr [] = [abc, 123@xyz] 
	   //     [abc, 123@xyz]  --> arr[0],arr[1] -> we have to split arr [1]         
	  String arr2[] = arr[1].split("@");
	  System.out.println(Arrays.toString(arr2));
	 System.out.println(arr[0]+arr2[0]+arr2[1]);
	    
	 //ex3
	 s="abc 123 xyz";
	 String ar[] = s.split(" ");
	 System.out.println(Arrays.toString(ar));
	
	 //ex4
	 String name = "Rohini";
	 System.out.println(name.replace('R', 'M').contains("Mohini"));
	 System.out.println(name.toUpperCase().contains("ROHINI"));
	}
}
