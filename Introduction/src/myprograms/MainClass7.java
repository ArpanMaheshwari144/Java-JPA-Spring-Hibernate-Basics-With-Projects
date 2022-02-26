package myprograms;

public class MainClass7 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = ++a;
		int c = --b;
		a = ++c;
		b = --a;
		c = ++b;
		System.out.println(a);
		++a;
		System.out.println(a);
		b = a+b;
		System.out.println(b);
		++b;
		System.out.println(b);
		c = b+a;
		System.out.println(c);
		
	}
}
