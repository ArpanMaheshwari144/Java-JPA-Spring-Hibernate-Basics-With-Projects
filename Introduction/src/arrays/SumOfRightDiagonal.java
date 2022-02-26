package arrays;

import java.util.Scanner;

public class SumOfRightDiagonal {

	public static void main(String[] args) {
		

		Scanner in=new Scanner(System.in);
		System.out.println("Enter the rows:");
		int rows=in.nextInt();
		System.out.println("Enter the columns:");
		int columns=in.nextInt();
		
		int a[][]=new int[rows][columns];
		int s=0;
		
		System.out.println("Enter the elements of 1st Matrix:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				a[i][j]=in.nextInt();
			}
		}
		int j=columns-1;
		for(int i=0;i<rows;i++) {
			s+=a[i][j];
			j--;
		}
			System.out.println("Sum of the rigth diagonal is:" + s);
			in.close();
		
		

	}

}
