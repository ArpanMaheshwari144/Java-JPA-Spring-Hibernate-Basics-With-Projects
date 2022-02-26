package arrays;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
	//	int[] a= {9,8,7,6,5,4,3,2,1};
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=in.nextInt();
		int a[]=new int[n];
		int temp;
		System.out.println("Enter the elements in the array:");
		for(int i=0;i<a.length;i++) {
				a[i]=in.nextInt();
			
		}
		for(int i=0;i<a.length-1 /*or n-1*/ ;i++) {
			int flag=0;
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				flag=1;
			}
		}
			if(flag==0) {
				break;
			}
		
		}
		System.out.println("After Sorting the array is:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		in.close();
	}

}
