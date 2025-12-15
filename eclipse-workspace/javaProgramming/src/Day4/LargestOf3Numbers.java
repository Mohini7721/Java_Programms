package Day4;

public class LargestOf3Numbers {
 /*a>b && a>c --> a is largest
  * b>a && b>c--> b is largest
  * c>a && c>b --> c is largest
  */
	public static void main(String[] args) {
		int a = 100, b=20, c=3000;
		if (a>b && a>c)
		{
			System.out.println("a is largest Number");
		}
		else if (b>a && b>c)
		{
			System.out.println("b is largest Number");
		}
		else
		{
			System.out.println("c is largest Number");
		}

	}

}
