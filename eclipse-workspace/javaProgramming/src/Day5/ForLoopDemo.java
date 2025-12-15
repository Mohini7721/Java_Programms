package Day5;

public class ForLoopDemo {

	public static void main(String[] args) {
		//print 1 to 10 numbers
		//for ( initialization; condition; inc/dec) 
		for(int i=1; i<=10; i++) 
		{
			System.out.println(i);
		}

		for(int j=8; j>=0; j--)
		{
		System.out.println(j);	
		}
		// print only even numbers
		
		for (int k=1; k<=10; k++)
		{
			if(k%2==0)
			{
			System.out.println(k);
			}
			else
			{
				System.out.println("odd number");
			}
		}
	}

}
