package loops;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		
		Scanner in=new Scanner(System.in);
//		int c=0;
		System.out.println("Enter the value of n:");
		int n=in.nextInt();
//		for(int i=2;i<n;i++) {
//			if(n%i==0) {
//				c++;
//				
//			}
//				
//		}
//		if(c==0) {
//			System.out.println("not a prime number");
//		}
//		else
//		{
//			System.out.println("prime number");
		
		
		boolean isPrime=true;
	//	for(int i=2;i<n;i++) {
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				isPrime=false;
				break;
			}
			
		}
		if(n<2) {
			isPrime=false;
		}
		System.out.println("isPrime "+isPrime);
		in.close();
		
		
		

	}

}
