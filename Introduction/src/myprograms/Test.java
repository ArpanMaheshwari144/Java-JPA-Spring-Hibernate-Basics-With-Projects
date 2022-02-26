package myprograms;

public class Test {

	public static void main(String[] args) {
		start();
	}
	
	static void start() {
		String stra = "do";
		String strb = method(stra);
		System.out.print(" : " + stra + strb);
	}
	
	static String method(String stra) {
		stra = stra + "good";
		System.out.print(stra);
		return "good";
	}
}
