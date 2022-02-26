package methods;

public class MethodOverriding {
	
	public static void main(String args[]) {
		Sum s=new Sum();
		System.out.println(s.test(10,10));
		Sub s1=new Sub();
		System.out.println(s1.test(10,10));	
		Mul s2=new Mul();
		System.out.println(s2.test(10,10));	
		Div s3=new Div();
		System.out.println(s3.test(10,10));
	}

}

class Sum{
	int test(int a,int b) {
		return a+b;
	}
}
class Sub{
	int test(int a,int b) {
		return a-b;
	}
}
class Mul{
	int test(int a,int b) {
		return a*b;
	}
}
class Div{
	int test(int a,int b) {
		return a/b;
	}
}



