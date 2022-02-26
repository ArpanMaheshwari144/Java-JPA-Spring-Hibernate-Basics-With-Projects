package exceptionhandling;

public class MainClass3 {

	public static void main(String[] args) {
		fun();
	}
	
	static void fun() {
		int a = 5;
		int b = 3;
		int c = a/b;
		System.out.println(c);
		
		try {
			fun1();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void fun1() throws ArrayIndexOutOfBoundsException {
		boolean isDanger = true;
		if(isDanger) {
			throw new ArrayIndexOutOfBoundsException("Error was coming");
		}
	}
}
