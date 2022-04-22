package loops;

public class StarGridAlernativeApproach {

	public static void main(String[] args) {
		
		
		for (int i=1; i<=5; i++)
		{
			for (int j=1; j<=5; j++)
			{
				if (j>=(4+i))
				{
					System.out.print("*");	
				}
				else 
				{
					System.out.println(" ");
				}
				
			}
			
			
		}	
		
	}
	
}
