package day9;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) {
		//String --> Immutable
		
		String s = "welcome";
		s.concat("to java");
		System.out.println(s); // print original s value so string is immutable

		//StringBuffer --> mutable
		
		StringBuffer sbf = new StringBuffer ("welcome");
		sbf.append(" to java"); // concat method in string buffer
		System.out.println(sbf);  // mutable. we can change original value if sbf
	
	    // StringBuilder --> mutable
		
		StringBuilder sbu = new StringBuilder("welcome");
		sbu.append(" to java");
		System.out.println(sbu); //mutable, we can change original value if sbu
		
	}

}
