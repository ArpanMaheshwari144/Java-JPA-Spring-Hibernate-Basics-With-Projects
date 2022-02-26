package dowhileloop;

import java.util.Scanner;

public class ProgramOfDoWhile {

	public static void main(String[] args) {
		
		
//		int n=0;
//		do { 
//			System.out.println("n is "+ n);
//		} while(n!=0);
		Scanner in=new Scanner(System.in);
		int n=1;
		do {
			System.out.println("enter the value of n:");
			n=in.nextInt();
			System.out.println("number is "+ n);
			
		}while(n!=0);
		in.close();

	}

}
