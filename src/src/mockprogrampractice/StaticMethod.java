package mockprogrampractice;

import mockgroup9.NonStaticMethod2;

public class StaticMethod 
{
public static void additionStatic()
{
	int a = 10;
int b = 20;
int c = a + b;

System.out.println(c);

}
public static void main(String[] args) {
	additionStatic();
	Prat.methodName();
	NonStaticMethod2 u=new NonStaticMethod2();
	u.myNameIs();
	
}
}
  