package arrays;

import java.util.Scanner;

public class SumOfEachRow {

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
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				s+=a[i][j];
			}
			System.out.println("Sum of " + i + "th row is " + s +" ");
			s=0;
		}
		in.close();
		
		

	}

}
