package returntype;

public class FarmerAssignmentLand 
{
	String s= "The sum of lands of three farmers is ";
	public int farmersLandArea (int l, int b)
	{
		int area = l*b;
		return area;
	}
	
	public static void main(String[] args)
	{
		FarmerAssignmentLand n=new FarmerAssignmentLand();
		int area1= n.farmersLandArea(10, 20);
		int area2= n.farmersLandArea(30, 40);
		int area3 = n.farmersLandArea(50, 60);
		int sum = area1+area2+area3;
		System.out.println(n.s + sum);
	}
		
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

