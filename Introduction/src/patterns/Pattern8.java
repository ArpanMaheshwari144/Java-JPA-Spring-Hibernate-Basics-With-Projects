package patterns;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=in.nextInt();
		
//		int rows=2*n-1;
//		for(int i=1;i<=rows;i++) {
//			if(i<=n) {
//				for(int j=1;j<=i;j++) {
//					System.out.print("* ");
//				}
//			} else {
//				for(int j=1;j<=rows-i+1;j++) {
//					System.out.print("* ");
//				}
//			}
//			System.out.println();
//			in.close();
//		
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=1;i<=n;i++){
//			for(int j=n-1;j>=i;j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//			in.close();
//		}
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
			in.close();
		}
	}
}

		



