package arrays;

import java.util.Scanner;

public class AverageMarksOfStudents {

	public static void main(String[] args) {
		
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int n=in.nextInt();
		int[] marks=new int[n];
		System.out.println("Enter the marks:");
	     for(int i=0;i<marks.length;i++) {
			//for(int i=0;i<n;i++){
			marks[i]=in.nextInt();
		}
		int averagemarks=0;
		for(int i=0;i<n;i++) {
			averagemarks=averagemarks+marks[i];
		}
		averagemarks=averagemarks/n;
		System.out.println("the average marks of students are " + averagemarks );
		in.close();
		}

}
