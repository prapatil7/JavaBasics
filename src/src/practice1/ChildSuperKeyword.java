package practice1;

public class ChildSuperKeyword extends SuperKeyword 
{  
	int a=48;
public void m1(int a)
{

	System.out.println(a);
	
	System.out.println(this.a);

	
	System.out.println(super.a);

} 

public static void main(String[] args) {
	
	
	ChildSuperKeyword n=new ChildSuperKeyword();
	n.m1(50);
	
}
}
