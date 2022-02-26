package programs;

import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
	
		       Scanner in = new Scanner(System.in);
		       System.out.println("Enter number of Strings!!");
		       int N = in.nextInt();
		       System.out.println("Enter Strings!!");
		       String s=in.nextLine();
		       for (int i = 0; i < N; i++) 
		        {
		            String string = in.nextLine();
		            char[] charArray = string.toCharArray();
		            for (int j = 0; j < charArray.length; j++) 
		            {
		                if (j % 2 == 0) 
		                {
		                    System.out.print(charArray[j]);
		                }
		            }
		            System.out.print(" ");
		            for (int j = 0; j < charArray.length; j++) 
		            {
		                if (j % 2 != 0) 
		                {
		                    System.out.print(charArray[j]);
		                }
		            }
		            System.out.println();
		        }
		       in.close();
	}

}
