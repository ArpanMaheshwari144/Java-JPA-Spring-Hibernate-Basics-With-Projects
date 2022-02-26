package whileloops;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=in.nextInt();
//		int s=0;
		int temp=n;
		int sum=0;
		while(temp>0) {
			int d=temp%10;
			temp=temp/10;
			sum=sum+d;
			
			System.out.println(d +"  "+ temp +"  "+ sum);
			
		}
		System.out.println("the sum of digits of "+ n +" is "+sum);
		in.close();
//		while(n>0) {
//			int d=n%10;
//			n=n/10;//s=s+d;
//			s=s+d;//n=n/10;
//			
//		}
//		System.out.println("Sum of digits is "+s);
//		in.close();
//		int number=(int) Math.log10(n) + 1;     //  to know how many digits in a number 
//		System.out.println(number);
//		in.close();

	}

}
