package assignments;

public class Method2 
{
 public void m2 () 
 {
	 MethodsStatic.m1();
	 
	 double a1 = 15;
	 double b1 = 100;
	  double a = a1/b1;
	 double b= a*200;
	 System.out.println("total no. of students who loves khokho are " + b);
	 double d= 0.10;
	 double e= d*200;
	 System.out.println("total students who loves basketball " + e );	 
 }

 public void m3() {
	 MethodsStatic.m1();
	 double g =0.20;
	 double h=g*200;
	 System.out.println("total students who love kabaddi " + h);
	 double i = 0.30;
	 double j = i*200;
	 System.out.println("total students who loves cricket "+ j);
 }
 
  public static void main(String[] args) {
	Method2 n=new Method2();
	n.m2();
	Method2 m=new Method2();
	m.m3();
}
}
