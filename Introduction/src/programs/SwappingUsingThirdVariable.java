package programs;

import java.util.Scanner;

public class SwappingUsingThirdVariable {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter first number:");
		int x=in.nextInt();
		System.out.println("Enter Second number:");
		int y=in.nextInt();
		int z=x;
		x=y;
		y=z;
		System.out.println("After swapping the values are x= " + x  +"and y="+  +y );
		in.close();

	}

}
