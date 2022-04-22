package src.arrays;

public class ArrayAllSum {
	public static void main(String[] args) {
		

		int [] a= new int [6];
	        a[0] = 10;
	        a[1]= 20;
	        a[2]= 30;
	        a[3]=40;
	        a[4]=50;
	        a[5]=100;
	        int sum=0;
	        for(int b:a)
	        {
	        	sum += 1*b;	 
	        }
	    	System.out.println(sum);             
	}
}
