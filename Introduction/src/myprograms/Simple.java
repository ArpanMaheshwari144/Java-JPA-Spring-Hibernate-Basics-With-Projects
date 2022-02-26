package myprograms;

public class Simple {

	public static void main(String[] args) {
		Simple obj = new Simple();
		obj.start();
	}
	
	void start() {
		long[] p = {3, 4, 5};
		long[] q = method(p);
		System.out.print(p[0]+p[1]+p[2]+" : ");
		System.out.print(q[0]+q[1]+q[2]);
	}
	
	long[] method(long[] r) {
		r[1] = 7;
		return r;
	}
}
