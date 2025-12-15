package Day5;

public class DoWhileLoop {

	public static void main(String[] args) {
		//print numbers from 1 to 10
		
		int i=1;
		do
		{
			System.out.println(i);  //1
			i++;                    //2...3...10
		}while(i<=10);
		
		// print 10 to 1 numbers
		
		int j=10;
		do
		{
			System.out.println(j);
			j--;
		}while(j>=1);
	}

}
