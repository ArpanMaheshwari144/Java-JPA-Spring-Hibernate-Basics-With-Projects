package programs;

import java.util.Scanner;

public class SwappingWithoutThirdVariable {

	public static void main(String[] args) {
		
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter numbers to be swapped: ");
		int x=in.nextInt();
		int y=in.nextInt();
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swapping x= " +x + "and y= " + y);
		in.close();
		

	}

}
