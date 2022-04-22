package oops_encapsulation;

public class BankServer2 {
	
	// encapsulation = method hiding + abstraction
	
	private int c2accountbalance= 150000;                             
	
	public void getBalance (int pin)
	{
		if (pin==0770)
		{
			System.out.println("Your account balance is:- " + c2accountbalance);
		}
		else
		{
		System.out.println("Please enter correct pin");
		}
	}
	
	public void withdrwal (int amount, int pin)
	{
		
	    if (amount<=c2accountbalance && amount <= 10000)
	    {
	    if (pin==1234)
	    {
	    	c2accountbalance= c2accountbalance - amount;
	    	System.out.println("amount: "+ amount + " has been withdran and "+ "Your account Balance is "+ c2accountbalance );
	    }
	    else
	    {
	         System.out.println("incorrect pin");
	    }
	    }
	}
}


