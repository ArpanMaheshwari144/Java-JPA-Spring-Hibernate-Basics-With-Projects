package programs;

public class IncAndDec {

	public static void main(String[] args) {
		
		int x=1;
		System.out.println(++x);
		System.out.println(x);
		
	    System.out.println("---------------------------------------------");	
	
		int y=1;
		System.out.println(y++);
		System.out.println(y);
		
		System.out.println("--------------------------------------------");
		
		int a=1;
		int b=2;
		a=++b;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("---------------------------------------------");
		
		int c=1;
		int d=2;
		c=d++;
		System.out.println(c);
		System.out.println(d);
		

	}

}
