package Day5;

public class While_If_Loop {

	public static void main(String[] args) {
		// only print even number
		int i =1 ;
		while ( i<=10)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
            i++;
		}
		
		int j =11 ;
		while (j<=20)
		{
			if(j%2==0)
			{
				System.out.println(j+ "Even Num");
			}
			else
			{
				System.out.println(j + "Odd Num");
			}
            j++;
		}
		
		// print between number 10 -1 in descending order

		int k=10;
		while(k>=1)
		{
			System.out.println(k);
			k--;
		}
	}

}
