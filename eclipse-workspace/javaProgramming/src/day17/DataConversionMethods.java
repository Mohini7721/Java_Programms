package day17;

import java.nio.charset.Charset;

public class DataConversionMethods {

	public static void main(String[] args) 
	{
//1. String --> Int

	//String s ="Welcome"; // can not convert to int
	String s1 ="12345";
	//after conversion it will return Integer so store in Int type of variable
	//int sint = 	Integer.parseInt(s); //NumberFormatException error throws
	int sint1 = 	Integer.parseInt(s1);
	System.out.println(sint1);
	
	String s2 ="20";
	String s3 ="30";
	System.out.println(s2+s3); // it will concatenate
	int s22 = Integer.parseInt(s2);
	int s33 = Integer.parseInt(s3);
	System.out.println(s22+s33);
	// Or System.out.println(Integer.parseInt(s2)+Integer.parseInt(s3));
	
//2. String --> Double
	
	String s4="10.5";
	String s5="12.7";
	System.out.println(Double.parseDouble(s4)+Double.parseDouble(s5));

//3. String --> Boolean
	
	String s6 = "false";
	String s7=  "True";  // if take value other than true, it will return false.
	System.out.println(Boolean.parseBoolean(s6));
	
//4. String --> Char
	String s8 = "mohini";
	//System.out.println(Char.parseChar(s8)); // string to char conversion not possible
	
//5. int --> string
	
	int a=10;
	double d= 10.5;
	char c= 'A';
	boolean bool= true;
	
	// Conversion of String to Primitive data types
	// String.valueOf(Primitive data type variable);
	String s9 =String.valueOf(a);
	System.out.println(s9);
	
	String s10 =String.valueOf(d);
	System.out.println(s10);
	
	String s11 = String.valueOf(c);
	System.out.println(s11);
	
	// or String s12 = String.valueOf(bool);
	System.out.println(String.valueOf(bool));
	}
}