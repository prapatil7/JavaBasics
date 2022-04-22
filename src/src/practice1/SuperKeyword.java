package practice1;

public class SuperKeyword {
	int a=10;
	public void m1 ()
	{
		System.out.println(this.a);
	}
	
	
	public static void main(String[] args) 
	{
		SuperKeyword s=new SuperKeyword();
		s.m1();
	}
}
