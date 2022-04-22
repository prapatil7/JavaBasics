package assignments;

public class ThisKeyword {
  boolean a=true;
  boolean b=false;
  
  public void m1 ()
  {
	  int c=15;
	  System.out.println(c);
	  System.out.println(this.a);
	  System.out.println(this.b);    // this keyword is only applicable for non static variable calling in non static method
  }
  
	public static void main(String[] args) {
		
		
	}
}
