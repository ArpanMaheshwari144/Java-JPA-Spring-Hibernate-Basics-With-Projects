package decimaltohexadecimal;

import java.util.*;
public class DecimalToHexaDecimal {
	
	Scanner scan;
	int num;
	
	void getVal() {
		
		System.out.println("Decimal to HexaDecimal");
		scan = new Scanner(System.in);
		
		System.out.print("Enter the Decimal number: ");
		num = Integer.parseInt(scan.nextLine());
	}
	
	void convert() {
		
		String hexa = Integer.toHexString(num);
		
		System.out.println("HexaDecimal Value is: " + hexa.toUpperCase());
	}

}
