package Day5;

public class BreakStatement {

	public static void main(String[] args) {
		for (int i=1; i<=10; i++)
		{
			if(i==5)
			{
				break;
				//System.out.println(i);  --> it shows error because after breaking statement we can not execute other statement
			}
			System.out.println(i);
		}

	}

}
