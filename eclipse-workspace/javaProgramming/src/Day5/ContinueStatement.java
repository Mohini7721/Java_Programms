package Day5;

public class ContinueStatement {

	public static void main(String[] args) {
		// continue skips number in condition i==n;

		for (int i=1; i<=10; i++)
		{
			if(i==3 || i==5 || i==8 )  // we can skips 1 or more numbers in if condition
			{
				continue;
			}
			System.out.println(i);
		}
	}

}
