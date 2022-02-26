package arrays;

import java.util.Scanner;

public class CreateoneDtwoDarray {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=in.nextInt(); 
		int a[]=new int[n];
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<a.length;i++) {
			a[i]=in.nextInt();
		}
		System.out.println("Array is:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		in.close();

	}

}
