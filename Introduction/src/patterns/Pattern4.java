package patterns;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=in.nextInt();
		for(int i=1;i<=n;i++) {
//			for(int j=n;j>=i;j--) {  
//				System.out.print("*"+"");
//			}
//			System.out.println();
//			in.close();
			for(int j=1;j<=n-i+1;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
			in.close();
			
		}  

	}

}
