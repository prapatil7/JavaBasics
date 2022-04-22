package oops_encapsulation;

public class BankServer1 {
	
	 
	private int cust1balance=12000;                                             // data hiding
    
	public void getBalance (int pin)
	{
		if(pin==4433)
		{
			System.out.println("Your account balance is "+ cust1balance);
		}
		else 
		{
			System.out.println("Please check the Pin and try again");
		}
	
	}
	
	public void withdrwal (int amount)
	{
		setBalance(amount);
	}
     public void setBalance (int amount)
     {
    	 if (amount <= cust1balance)
    	 {
    		cust1balance= cust1balance-amount;
    		System.out.println("Amount: "+ amount +" withdrawn and your account balance is "+ cust1balance);
    	 }
    	 else
    	 {
    		 System.out.println("No sufficient balance");
    	 }
     }
      	     
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

