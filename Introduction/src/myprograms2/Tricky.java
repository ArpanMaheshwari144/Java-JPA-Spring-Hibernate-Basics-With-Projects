package myprograms2;

public class Tricky {

	public static void main(String[] args) {
		
		int a=5;
		int b=6;
		if((b=1)==a) {
			System.out.println(b);
		} else {
			System.out.println(++b);
			System.out.println(b++);
			System.out.println(b);
		}

	}

}
