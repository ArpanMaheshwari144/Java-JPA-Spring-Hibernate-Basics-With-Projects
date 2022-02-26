package whileloops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		
		Scanner in=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=in.nextInt();
//		int temp=n;
//		int r=0;
//		while(temp>0) {
//			int d=temp%10;
//		    r=r*10+d;
//		    temp=temp/10;
//			
//		}
//		if(r==n) {
//			System.out.println(n+" is a palindrome");
//		}
//		else {
//			System.out.println(n+" is not a palindrome");
//		}
//		in.close();
		int i=n;
		int r=0;
		while(n>0) {
			int d=n%10;
			r=r*10+d;
			n=n/10;
		}
		if(i==r) {
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is not a palindrome");
		}
		in.close();

	}

}
