package assignments;

public class StudentsInfoClass {

	int a = 37;
	int b = 48;
    static int c = 58;
    
	public static void main(String[] args) 
	{
		
		StudentsInfoClass n=new StudentsInfoClass();
		System.out.println(n.a);
		System.out.println(n.b);
		System.out.println(c);
		
		
		StudentsInfoClass n1=new StudentsInfoClass();
		n1.a=50;
		System.out.println(n1.a);
		n.a=51;
		System.out.println(n.a);
		System.out.println(n1.c);
		n1.c=55;
		System.out.println(n1.c);
		
		
	}

	
	
	
	
	
	
	
}
