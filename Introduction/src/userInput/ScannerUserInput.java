package userInput;
import java.util.Scanner;

public class ScannerUserInput {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		int principal =in.nextInt();
		float rate =in.nextFloat();
		int time =in.nextInt();
		
		float simpleInterest = principal*rate*time/100;
		
		System.out.println("the simple interest is " +simpleInterest);
		
		in.close();
	}

}
