package revision;

public class InternalMock {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		
		
		for (int i=1; i<=50; i++)
		{
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}
