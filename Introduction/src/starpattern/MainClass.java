package starpattern;

import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number of rows: ");
		int rows = in.nextInt();
		System.out.print("Enter a number of triangle stars here please: ");
		int number = in.nextInt();
		for(int i=1;i<=number;i++) {
			System.out.print("");
			for(int j=1;j<=rows;j++) {
				for(int k=rows;k>=j;k--) {
					System.out.print("");
				}
				for(int l=0;l<((j*2)-1);l++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
