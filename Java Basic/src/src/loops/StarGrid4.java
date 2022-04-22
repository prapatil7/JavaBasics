package loops;

public class StarGrid4 {
	 
	public static void main(String[] args)
	{
		for(int m=1; m<=15; m++)
		{
			for (int n=1; n<=15; n++)
			{
				if(n<=(16-m))
				{
					System.out.print("*");
				}
				else
				{
					System.out.println(" ");
				}
			
			}
			System.out.println();
		}
	}
}
