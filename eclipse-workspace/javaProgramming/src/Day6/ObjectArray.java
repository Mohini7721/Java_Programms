package Day6;

public class ObjectArray {

	public static void main(String[] args) {
		Object a[] = {100, 10.5, 'A', "Welcome", true}; //heterogeneous data
		//object is a predefined class in java just like a string
		//object data type of variable can store all kind of data (values,string, char, etc...)
	
	//Enhanced for loop
		for (Object x:a)    // x is hold diff kind of data means x is object type of variable
		{
			System.out.println(x);
		}
		
		for(int i=0; i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
	}

}
