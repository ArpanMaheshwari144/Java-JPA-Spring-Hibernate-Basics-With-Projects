package patterns;

import java.util.Scanner;

public class Pattern21 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=in.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<(2*i);j++) {
				if(j>1&&j<(i*2)-1) {
					System.out.print("0");
				}
				else
				{
					System.out.print(i);	
				}
			}
			System.out.println();
		}
		in.close();

	}

}
