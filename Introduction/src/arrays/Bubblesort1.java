package arrays;

import java.util.Scanner;

public class Bubblesort1 {

	public static void main(String[] args) {
		
		//int a[]= {8,7,6,5,4,3,2,1};
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<a.length;i++) {
			a[i]=in.nextInt();
		}
		for(int i=0;i<a.length-1/*or n-1*/ ;i++) {
			boolean sorted =true;
			for(int j=0;j<n-1-i;j++) {
				if(a[j+1]<a[j]) {
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
					sorted=false;
				}
			}
			if(sorted) break;
		}
		// by for each loop 
		System.out.println("Sorted array is:");
		for(int item:a) {
			System.out.print(item+" ");
			in.close();
		}

	}

}
