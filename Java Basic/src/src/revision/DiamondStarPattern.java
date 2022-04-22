package revision;

public class DiamondStarPattern {
	public static void main(String[] args) {
		
	
	int star=1;
	int space=3;
	for (int i=1; i<=4; i++)
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
	int star1=7;
	int space1=0;
	
	for (int x=1; x<=4; x++)
	{
		for (int y =1; y<=space1; y++)
		{
			System.out.print(" ");
		}
		for (int z=1; z<=star1; z++)
		{
			System.out.print("*");
		}
		System.out.println();
		space1=space1+1;
		star1=star1-2;
	}
	}
}
