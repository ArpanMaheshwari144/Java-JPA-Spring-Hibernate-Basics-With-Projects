package myprograms;

public class Test5 {
	int ci = 1;
	int cj = 1;
	
	void first() {
		int a = ci++;
		System.out.println(a);
	}
	
	void second() {
		int b = ++cj;
		System.out.println(b);
	}

	public static void main(String[] args) {
		Test5 obj = new Test5();
		obj.first();
		obj.second();
	}

}
