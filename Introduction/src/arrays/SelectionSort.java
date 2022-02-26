package arrays;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements in the array:");
		for(int i=0;i<a.length;i++) {
				a[i]=in.nextInt();
			
		}
		int temp;
		for(int i=0;i<a.length;i++) {
			int min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min]) {
				      min=j;
					
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		System.out.println("After Sorting the array is:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		in.close();

	}

}
