package methods;

public class MethodOverloading {

	public static void main(String[] args) {
		int e=35;
		int f=35;
		System.out.println(sum(e,f));

		
		String g="Arpan"+" ";
		String h="Maheshwari";
		sum(g,h);
		System.out.println(g.concat(h));

	}
	
	static int sum(int a,int b) {
		return a+b;
		
	}
	static String sum(String c,String d) {
		return c+d;
		
	}

}
