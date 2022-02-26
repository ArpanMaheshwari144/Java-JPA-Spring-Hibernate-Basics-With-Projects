package strings;

import java.util.Scanner;

public class NextAndNextLine {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.print("Enter First String:");
		String s=in.next();
		System.out.println("The First String is: " + s);
//		System.out.print("Enter Second String:");
//		String s1=in.nextLine();
//		System.out.println("The Second String is: " + s1);
		in.close();
	
	}

}
