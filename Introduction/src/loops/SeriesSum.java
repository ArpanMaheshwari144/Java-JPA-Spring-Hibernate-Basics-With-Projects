package loops;

import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {
		
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=in.nextInt();
		float result=0;
		for(float i=1;i<=n;i++) {
			result=result + 1/i;
		}
		System.out.println("the result is "+result);
		in.close();
		

	}

}
