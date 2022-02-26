package arrays;

import java.util.Scanner;

public class SegregateAnArray {

	public static void main(String[] args) {
		
//		int a[]= {0,1,0,1,0,1,1,0};
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the 0's and 1's randomly:");
		for(int i=0;i<a.length;i++) {
			a[i]=in.nextInt();
		}
		int j=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				a[j++]=a[i];  
			}
		}
		while(j<a.length) {
			a[j++]=1;
		}
		System.out.println("Your Sequential Order of 0's and 1's is:");
		for(int k=0;k<a.length;k++) {
			System.out.print(a[k]+" ");
		}
		in.close();

	}

}
