package patterns;

import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
		
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=in.nextInt();

	    for(int i=1; i<=n; i++)
	    {
	        for(int j=i; j<n; j++)
	        {
	            System.out.print(" ");
	        }
	        for(int j=1; j<=(2*i-1); j++)
	        {
	            if(i==n || j==1 || j==(2*i-1))
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
