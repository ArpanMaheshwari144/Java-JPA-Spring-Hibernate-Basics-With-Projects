package programs;

public class IncAndDec4 {

	public static void main(String[] args) {
		
		
		int x = 5, y;

		y = --x;
		System.out.println("y : " + y); //will print y : 4
		System.out.println("x : " + x); //will print x : 4
		 
		y = x--;
		System.out.println("y : " + y); 
		System.out.println("x : " + x); 
		 
		--x;
		System.out.println("x : " + x); 
		 
		x--;
		System.out.println("x : " + x); 

	}

}
