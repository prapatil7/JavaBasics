package returntype;
public class LandAreaAssignment
{
   String s= "the sum of three areas is ";
	public int areaOfLamd (int length, int breadth)
	{	
        int area = length*breadth;
        return area;
	}   
	public int area (int length, int breadth)
	{
		int area = length*breadth;
		return area;		
	}	 
	public static int Area (int l, int b)
	{
		int area = l*b;
		return area;	
	}
	     public static void main(String[] args)
	    {
			LandAreaAssignment v=new LandAreaAssignment();
		     int area1 = v.areaOfLamd(10, 20);
		     int area2 = v.areaOfLamd(30, 25);
		     int area3 = v.areaOfLamd(45, 55);
		     int sumofarea = area1 + area2 + area3;
		     System.out.println(v.s + sumofarea);
		     
		     int area4 = v.area(54, 85);
		     int area5 = v.area(146, 246);
		     int area6 = v.area(545, 486);
		     int sumofAreas= area4+area5+area6;
		     System.out.println(v.s + sumofAreas);
		     
		     int area7=v.Area(54, 45);
		     int area8 = v.Area(512, 500);
		     int area9= v.Area(498, 10038);
		     int sum = area7+area8+area9;
		     System.out.println(v.s+ sum);
		      
	    }
	    	 
}   	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
