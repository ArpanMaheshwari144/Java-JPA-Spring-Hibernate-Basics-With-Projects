package myprograms;

import java.util.Scanner;

public class PatternMatching {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.print("Enter first string:");
		String s1=in.nextLine();
		System.out.print("Enter second string:");
		String s2=in.nextLine();
		boolean result=s1.contains(s2);
		if(result) {
			System.out.println("Patter found");
		} else {
			System.out.println("Not found");
		}
		in.close();

	}

}
