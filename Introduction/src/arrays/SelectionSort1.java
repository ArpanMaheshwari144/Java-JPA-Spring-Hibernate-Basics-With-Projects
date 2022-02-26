package arrays;

import java.util.Scanner;

public class SelectionSort1 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of the array is:");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements in the array:");
		for(int i=0;i<a.length;i++) {
			a[i]=in.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			int minindex=i;
			for(int j=i;j<n;j++) {
				if(a[j]<a[minindex]) {
					minindex=j;
					
				}	
			}
			int temp=a[i];
			a[i]=a[minindex];
			a[minindex]=temp;
		}
		System.out.println("Sorted array is:");
		for(int item:a) {
			System.out.print(item+"  ");
			in.close();
		}

	}

}
