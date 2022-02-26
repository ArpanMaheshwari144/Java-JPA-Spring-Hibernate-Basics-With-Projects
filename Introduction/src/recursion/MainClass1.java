package recursion;

// Ques -> calculate power using recursion a^b

public class MainClass1 {
	
	static int stepCount = 0;

	public static void main(String[] args) {
		
		System.out.println(pow(3, 4));
		System.out.println("Steps are: " + stepCount);
		
		stepCount = 0;
		System.out.println(fastPow(3, 4));
		System.out.println("Steps are: " + stepCount);
	}
	
	static int pow(int a, int b) {
		stepCount++;
		if(b==0) {
			return 1;
		}
		return a * pow(a, b-1);
	}
	
	static int fastPow(int a, int b) {
		stepCount++;
		if(b==0) {
			return 1;
		}
		if(b%2==0) {
			return fastPow(a*a, b/2);
		}
		return a * fastPow(a, b-1);
	}

}
