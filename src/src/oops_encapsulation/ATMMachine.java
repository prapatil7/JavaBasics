package oops_encapsulation;

public class ATMMachine {
	 
	public static void balanceEnq(int pin)
	{
		BankServer1 bs=new BankServer1();
		bs.getBalance(4433);
	}
	
	public static void main(String[] args) 
	{
		balanceEnq(4400);
		BankServer1 bs=new BankServer1();
		
		bs.setBalance(10000);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
