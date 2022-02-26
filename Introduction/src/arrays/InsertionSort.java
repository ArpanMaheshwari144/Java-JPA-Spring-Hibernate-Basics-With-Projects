package arrays;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<a.length;i++) {
			a[i]=in.nextInt();
		}
		int temp;
		int minIndex;
		for(int i=0;i<a.length-1 /* or n-1 */ ;i++) {
			minIndex=i;
			for(int j=i+1;j<n;j++) {
				if(a[minIndex]>a[j]) {
					minIndex=j;
				}
			}
			temp=a[i];
			a[i]=a[minIndex];
			a[minIndex]=temp;
		}
		System.out.println("After Sorting the array is:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		in.close();

	}

}
