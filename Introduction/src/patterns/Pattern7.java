package patterns;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=in.nextInt();
//		int r=1;
//		for(int i=1;i<=n;i++) {
//			for(int j=n-1;j>=i;j--) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print(r+" ");
//				r++;
//			}
//			System.out.println();
//			in.close();
		
		int number=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
			in.close();
		}

	}

}
