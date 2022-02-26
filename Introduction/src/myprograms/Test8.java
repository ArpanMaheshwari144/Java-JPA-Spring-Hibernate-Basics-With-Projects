package myprograms;

import java.util.*;
public class Test8 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		if(a > b && b > c) {
			System.out.println(c + " is smallest number");
			System.out.println(a + " is greatest number");
		}
		else if(b > a && a > c) {
			System.out.println(c + " is smallest number");
			System.out.println(b + " is greatest number");
		}
		else if(c > b && b > a) {
			System.out.println(a + " is smallest number");
			System.out.println(c + " is greatest number");
		}
	}
}
