package interviewQuestions;

import java.util.Scanner;

public class SlidingWindowMaximum1 {
	
	public static void main(String args[]) {
		
		Scanner in=new Scanner(System.in);
		System.out.print("Enter number of testcases you want to enter:");
		int t=in.nextInt();
		while(t-->0) {
			System.out.print("Enter size of the array and size of the window:");
			int n=in.nextInt();
			int k=in.nextInt();
			int a[]=new int[n];
			System.out.print("Enter array elements:");
			for(int i=0;i<n;i++) {
				a[i]=in.nextInt();
			}
			int max=Integer.MIN_VALUE;
			for(int i=0;i<n-k+1;i++) {
				for(int j=1;j<i+k;j++) {
					max=max>a[j]?max:a[j];
				}
				System.out.print(max+" ");
				max=Integer.MIN_VALUE;
			}
			System.out.println();
		}
		in.close();
	}

}
