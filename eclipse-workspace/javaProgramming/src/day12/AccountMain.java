package day12;

public class AccountMain {

	public static void main(String[] args) {
		Account ac = new Account();
	//	ac.accno=123;    will get error --> The field Account.accno is not visible
		ac.setAccno(165); 
		ac.setAmount(12345);
		ac.setName("Mohini");
		
	    System.out.println(ac.getAccno());
	    System.out.println(ac.getAmount());
	    System.out.println(ac.getName());

	}

}
