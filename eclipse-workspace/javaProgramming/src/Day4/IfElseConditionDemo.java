package Day4;

public class IfElseConditionDemo {
 public static void main ( String args[])
 {
	int person_age = 25;
	//int person_age = 15;
	if (person_age>=18)
{
	System.out.println("Eligible for vote"); // if condition is true then & then statement connected to if is executed.
}else
	{
		System.out.println("Not eligible for vote");  // condition is false then esle will execute
	}
	
// we can also execute if & else without { } this when we have single statements within if-else 
//if we have multiple statements then we have to keep inside the { }.
		
	if (person_age>=18)
		System.out.println("Eligible for vote"); // if condition is true then & then statement connected to if is executed.
	else
		System.out.println("Not eligible for vote");  // condition is false then esle will execute
		
 
 }
}
