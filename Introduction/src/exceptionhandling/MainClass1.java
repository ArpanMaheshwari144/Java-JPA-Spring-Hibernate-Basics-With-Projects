package exceptionhandling;

public class MainClass1 {

	public static void main(String[] args) throws Exception {
		fun();
	}
	
	static void fun() {
		try {
			int a = 5;
			int b = 0;
			int c = a/b;
			System.out.println(c);
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage() + " occured, please check your code");
		}
	}
}
