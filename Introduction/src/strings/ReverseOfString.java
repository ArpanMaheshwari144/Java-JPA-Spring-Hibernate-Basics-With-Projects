package strings;

import java.util.Scanner;

public class ReverseOfString {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Input String to be Reversed:");
		String inputString=in.nextLine();
		String[] words=inputString.split("");
		String outputString="";
		for(int i=words.length-1;i>=0;i--) {
			outputString=outputString+words[i] + "";
		}
		System.out.println("InputString is:"+inputString);
		System.out.println("OutputString is:"+outputString);
		in.close();
		
		

	}

}
