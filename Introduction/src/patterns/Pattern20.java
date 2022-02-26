package patterns;

import java.util.Scanner;

public class Pattern20 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=in.nextInt();

	    for(int i=0;i<=n;i++) {    
	   // 	for(int i=n;i>=0;i--) {
	    		
			    for(int j=n;j>=0;j--) {
				  if(j<=i) {
					System.out.print(j);
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	    in.close();

	}

}
