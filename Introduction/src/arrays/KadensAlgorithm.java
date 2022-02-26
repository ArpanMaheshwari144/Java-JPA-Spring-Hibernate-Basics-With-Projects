package arrays;

import java.util.Scanner;

public class KadensAlgorithm {

	public static void main(String[] args) {
		
	//	int a[] = {-1,4,-2,-4,-1,3,5,-6};
	//	int n=a.length;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements in the array:");
		for(int i=0;i<a.length;i++) {
				a[i]=in.nextInt();
		}
		System.out.println("The Length of the Array is " + n);
		int maxsum=Integer.MIN_VALUE;//maxsum=0;
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			if(sum>maxsum) {
				maxsum=sum;
			}
			if(sum<0) {
				sum=0;
			}
		}
		System.out.println("The sum of the largest sub array is " + maxsum);
		
		int t;
		for(int j=0;j<a.length;j++) {
			for(int k=j+1;k<a.length;k++) {
				if(a[j]>a[k]) { //for sorting in > ascending order
					 t=a[j];
					 a[j]=a[k];
					 a[k]=t;
				}
			}
			
		}
		System.out.println("After sorting array is ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
			in.close();
		}

	}

}
