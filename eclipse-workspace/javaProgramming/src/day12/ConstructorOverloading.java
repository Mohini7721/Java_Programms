package day12;

public class ConstructorOverloading 
{ 
    double width, height, depth;
    
  //constructor is only use to assign the data/value to variables.
	ConstructorOverloading() //default cons
	{
	width=0;
	height=0;
	depth=0;  // or width=height=depth=0;
	}
	
	ConstructorOverloading(double w, double h, double d)  //parameterized cons
	{
		width=w;
		height=h;
		depth=d;
	}
	
	ConstructorOverloading(double len)
	{
		width=height=depth=len;
	}
	
	double volume()
	{
		return(width*height*depth);
	}
}
