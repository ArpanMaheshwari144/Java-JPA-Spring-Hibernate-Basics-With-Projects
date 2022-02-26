package loops;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a value of n:");
		int n=in.nextInt();
		int a=-1;
		int b=1;
	//	System.out.print(a+" ");
	//	System.out.print(b+" ");
		for(int i=0;i<n;i++)
		{
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		in.close();

	}

}
