package patterns;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=in.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				if(i==1||j==i||j==n)
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
