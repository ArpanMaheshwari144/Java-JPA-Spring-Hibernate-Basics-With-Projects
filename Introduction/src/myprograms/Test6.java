package myprograms;

public class Test6 {

	public static void main(String[] args) {
		
		int a = 10, b = 34;
		System.out.println("Numbers before swapping: " + a + " " + b);
		a = a^b^(b=a);
		System.out.println("Numbers after swapping: " + a + " " + b);

	}

}
