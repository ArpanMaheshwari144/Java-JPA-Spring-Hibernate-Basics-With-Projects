package arrays;

import java.util.Scanner;

public class ProductOfMatrix {

	public static void main(String[] args) {
		

		Scanner in=new Scanner(System.in);
		System.out.println("Enter rows:");
		int rows=in.nextInt();
		System.out.println("Enter columns:");
		int columns=in.nextInt();
		
		int a[][]=new int[rows][columns];
		int b[][]=new int[rows][columns];
		int c[][]=new int[rows][columns];
		
		System.out.println("Enter the elements of 1st Matrix:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				a[i][j]=in.nextInt();
			}
		}
		
		System.out.println("Enter the elements of 2nd Matrix:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				b[i][j]=in.nextInt();
			}
		}
		
		System.out.println("The Product of the Matrix are:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				c[i][j]=0;
				for(int k=0;k<columns;k++) {
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		in.close();

	}

}
