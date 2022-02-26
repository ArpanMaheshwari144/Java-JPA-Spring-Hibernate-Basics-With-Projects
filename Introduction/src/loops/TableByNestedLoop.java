package loops;

import java.util.Scanner;

public class TableByNestedLoop {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number you want to print the table:");
		int n=in.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=10;j++) {
				System.out.print(i*j+" ");
			}
			System.out.println();
			in.close();
		}

	}

}
