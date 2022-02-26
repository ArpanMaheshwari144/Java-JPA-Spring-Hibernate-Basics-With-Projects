package myprograms;

public class Test7 {

	public static void main(String[] args) {
		
		MyClass obj1 = new MyClass();
		MyClass obj2 = new MyClass();
		obj1.x = 0;
		obj1.y = 0;
		obj1.call(1, 2);
		obj2.x = 0;
		obj2.call(2, 3);
		System.out.println(obj1.x + " " + obj2.y);
	}

}

class MyClass{
	public int x;
	static int y;
	void call(int a, int b) {
		x += a;
		y += b;
	}
}
