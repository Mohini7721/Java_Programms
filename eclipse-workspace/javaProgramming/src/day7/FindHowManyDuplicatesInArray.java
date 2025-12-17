package day7;

public class FindHowManyDuplicatesInArray {

	public static void main(String[] args) {
		// how many times values repeated
		int a[] = {100, 200, 100, 300, 100, 400, 100};
		int number = 200;
		int count =0;
		for (int value:a)
		{
			System.out.println(value);
			if (value==number)            // you can also directly take number here value=100 don't need to mention variable 
			{
				count++;
			}
		}
		System.out.println("Total count of " + number+ " is "+ count);
	}
}
