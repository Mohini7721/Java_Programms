package day7;

public class SearchElementInArray 
{
	public static void main(String[] args) 
	{
		// Approach 1
	  int a[]= {10, 20, 30, 40, 50};
	  int search_element=30;
	 boolean status = false;    // false - not found, true - found.
	  // with normal for loop
	  for(int i=0;i<=a.length-1;i++)
	  {
		// System.out.println(a[i]); 
		  if(a[i]==search_element)
		  {
			System.out.println("Element found");
			status = true;
			break;
		  }
//		  else  --> Dont use else block here it will print elemnet not found for those are not match with search element
//		     so use print statement after finish for loop	  }
	  }
	  if (status ==false)
	  {
		  System.out.println("element not found");
	  }
	  
	  //Approach 2 -> enhanced for loop
	  
	  for (int x:a)
	  {
		  if(x==search_element)
		  {
			  System.out.println("element found");
			  status = true;
			  break;
		  }
	  }
	  if(status==false)
	  {
	  System.out.println("element not found");
	  }
	}
}
