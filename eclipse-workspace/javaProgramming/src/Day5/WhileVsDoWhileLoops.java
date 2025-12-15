package Day5;

public class WhileVsDoWhileLoops {

	public static void main(String[] args) {
		//
		
		int i=10;
		while(i<=5)
		{
			System.out.println(i);  // while loop check condition first then execute the statement
			i++;
		}
		
		int j=10;
		do
		{
			System.out.println(j);  // do while loop executed at least once then follows the condition
			j++;
		}while(j<=5);
	}
}
