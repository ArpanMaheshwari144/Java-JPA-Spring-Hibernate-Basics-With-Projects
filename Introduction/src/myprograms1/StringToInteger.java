package myprograms1;
import java.util.*;

public class StringToInteger {

	public static void main(String[] args) {
		
		  Scanner in = new Scanner(System.in);
		  System.out.println("Enter a String or an Integer!!");
	      String S = in.next();
	      try{
	        int s = Integer.parseInt(S);
	        System.out.print("You entered a valid Interger: " + s);
	       }
	      catch(Exception e){
	        System.out.println("You entered a Bad String!!");
	       }
	      in.close();
	}
}
