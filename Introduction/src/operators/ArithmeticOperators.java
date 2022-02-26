package operators;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
    	int a=100;
    	int b=34;
		
	    int c=--b;
		System.out.println(c+" "+b);
    	
    	int d=b--;
    	System.out.println(d+" "+b);
    	
    	int e=b++;
    	System.out.println(e+" "+b);
    	
    	int f=++b;
    	System.out.println(f+" "+b);
    	
    	int g=a+b;
    	System.out.println(g);
    	
    	int h=a-b;
    	System.out.println(h);
    	
    	int i=a*b;
    	System.out.println(i);
    	
    	int j=a/b;
    	System.out.println(j);
    	
    	int k=b%a;
		System.out.println(k);
    	
    	int l=(a+b) * (a+b);
   	System.out.println(l);
    	
    	double m=(double) a/(double) b;
    	System.out.println(m);
		

	}

}
