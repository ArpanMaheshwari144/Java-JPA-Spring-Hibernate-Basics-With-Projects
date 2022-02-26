package decimaltobinary;

import java.util.*;
public class DecimalToBinary {
	
	Scanner scan;
	int num;
	
	void getVal() {
		
		System.out.println("Decimal to Binary");
		scan = new Scanner(System.in);
		
		System.out.print("Enter the Decimal number: ");
		num = Integer.parseInt(scan.nextLine());
	}
	
	void convert() {
		
		String binary = Integer.toBinaryString(num);
		
		System.out.println("Binary Value is: " + binary);
	}

}
