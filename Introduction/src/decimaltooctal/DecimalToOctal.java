package decimaltooctal;

import java.util.*;
public class DecimalToOctal {
	
	Scanner scan;
	int num;
	
	void getVal() {
		
		System.out.println("Decimal to Octal");
		scan = new Scanner(System.in);
		
		System.out.print("Enter the Decimal number: ");
		num = Integer.parseInt(scan.nextLine());
	}
	
	void convert() {
		
		String octal = Integer.toOctalString(num);
		
		System.out.println("Octal Value is: " + octal);
	}

}
