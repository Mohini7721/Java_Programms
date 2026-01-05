package day12;

public class AdderMain {

	public static void main(String[] args) 
	{
		Adder ad = new Adder();
		ad.sum();
		ad.sum(1,2,3);
		ad.sum(1,2);
		ad.sum(1.2,3);
		ad.sum(1,2.3);
		//ad.sum(1.3,4.5,2.3); //invalid -- parameters are not matching
	}
}
