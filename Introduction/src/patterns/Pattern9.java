package patterns;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=in.nextInt();
//		System.out.println("*");
//		for(int i=2;i<=n-1;i++) {
//			System.out.print("*");
//			for(int j=1;j<=i-2;j++) {
//				System.out.print(" ");
//			}
//			System.out.print("*");
//			System.out.println();
//
//		}
//		if(n>1) {
//		for(int i=1;i<=n;i++) {
//			System.out.print("*");
//		}
//		}
//           in.close();
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				if(i==j||i==n||j==1)
//				{
//					System.out.print("*");
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//			in.close();
		
		for(int i=1;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
			   if(i==j||i==n||j==1) 
			   {
				   System.out.print("*");
			   }
			   else
			   {
				   System.out.print(" ");
			   }
			}
			System.out.println();
			in.close();
		}
	}

}
