package loops;

public class StarAssignmentLoop 
{
	public static void main(String[] args) {
	int i1=5;
	for(int j=1; j<=5;j++)
   {
	 for (int i=1; i<=i1; i++)	
	  {
		System.out.print("*"); 
	  }               
	       System.out.println();
	       i1-- ;                        //we used print instead of println for printing * in a single line
	}
}
	
}