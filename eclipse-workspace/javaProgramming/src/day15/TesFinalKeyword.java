package day15;

class Test
{
	 int x=100;
	 final int y =300;  //create variable with final keyword then that value is fixed, i can not change.
}
public class TesFinalKeyword {

	public static void main(String[] args) 
	{
Test t = new Test();
System.out.println(t.x);
t.x=200;           // any time we can change the value of variable if it is not final type of variable.
System.out.println(t.x);
// t.y=400;  -->  we are getting error, we can not change value of final keyword variables because that is constant.
System.out.println(t.y);
	}

}
