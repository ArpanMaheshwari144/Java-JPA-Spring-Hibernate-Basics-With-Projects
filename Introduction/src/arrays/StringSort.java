package arrays;

import java.util.Scanner;

public class StringSort {

	public static void main(String[] args) {
		// this is selection string sort
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of names you want to enter:");
		int n=in.nextInt();
		String a[]=new String[n];
//		String a[]= {"deepak","rahul","amit","vibhu"};
		int min;
		String temp;
		System.out.println("Enter all the names you want to enter:");
		for(int i=0;i<a.length;i++) {
			a[i]=in.next();// for store the string next is used
		}
		for(int i=0;i<a.length;i++) {
			min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j].compareTo(a[min])<0) {
					min=j;
				}
			}
			
					temp=a[i];
					a[i]=a[min];
					a[min]=temp;
		}
		System.out.println("Sorted string elements are:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		in.close();
		
		
		// this is bubble string sort
		
//		Scanner in=new Scanner(System.in);
//		System.out.println("Enter the number of names you want to enter:");
//		int n=in.nextInt();
//		String a[]=new String[n];
//		String temp;
//		System.out.println("Enter all the names you want to enter:");
//		for(int i=0;i<a.length;i++) {
//			a[i]=in.next();
//		}
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a.length-1-i;j++) {
//				if(a[j].compareTo(a[j+1])>0) {
//					temp=a[j];
//					a[j]=a[j+1];
//					a[j+1]=temp;
//				}
//			}
//		}
//		System.out.println("Sorted String elements are:");
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]+" ");
//		}
//		in.close();
		

	}

}
