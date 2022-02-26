package loops;

import java.util.Scanner;

public class SeriesSum2 {

	public static void main(String[] args) {
		

		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=in.nextInt();
		float result=0;
		for(float i=1;i<=n;i++) {
			if(i%2==0) {
				result=result-1/i;
			}
			else {
				result=result+1/i;
				
			}
			
		}
           System.out.println("Result is "+ result);
           in.close();
	}

}
