package revision;

public class StarPatternDiamond {
	public static void main(String[] args) 
	{
		int star=1;
		int space=3;
	for (int i=1;i<=4;i++)
	{
		for (int j=1; j<=space; j++)
		{
			System.out.print(" ");
		}
		for (int k=1; k<=star; k++)
		{
			System.out.print("*");
		}
		 System.out.println();
		 star=star+2;
		 space=space-1;
	}
	
	int star1=5;
	int space1=1;
	for (int a=1;a<=3;a++)
	{
		for (int b=1; b<=space1; b++)
		{
			System.out.print(" ");
		}
		for (int c=1; c<=star1; c++)
		{
			System.out.print("*");
	    }
	
		  System.out.println();
		     star1=star1-2;
		     space1= space1+1;
	   
	}
	}
}
