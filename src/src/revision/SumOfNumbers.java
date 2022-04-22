package revision;

public class SumOfNumbers {
	
	
	public static void sumNumbers (int sum)
	{
		sum = 0;
		for (int z=1; z<=10; z++)
		{
			sum += 2*z;
			
		}
		System.out.println(sum);
	}
	
	public static void oddNumbers()
	{
		int sum=0;
		  for (int i=1; i<=10; i++)
		  {
			 if (i%2!=0)
			 {
				sum += 1*i;
			 }
		  }
		  System.out.println(sum);
		  }
	public static void sumNumbers2 ()
	{
		int sum=0;
	    for(int j=1; j<=5; j++)
	    {
	    	if (j%2==0)
	    	{
	    		sum += 1*j;
	    	}
	    }
	    System.out.println(sum);
	}
	
	
   public static void main(String[] args)
   {
	   
	   sumNumbers(0);
	   oddNumbers();
	   sumNumbers2();
}	

}
	  