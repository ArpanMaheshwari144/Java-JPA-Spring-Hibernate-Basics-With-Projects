package arrays;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the rows:");
		int rows=in.nextInt();
		System.out.println("Enter the columns:");
		int columns=in.nextInt();
		int a[][]=new int[rows][columns];
		int b[][]=new int[rows][columns];
		
		System.out.println("Enter the elements of 1st Matrix:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				a[i][j]=in.nextInt();
						
			}
		}
		
		System.out.println("Transpose of the Matrix:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				b[i][j]=a[j][i];
			}
		}
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		in.close();

	}

}
