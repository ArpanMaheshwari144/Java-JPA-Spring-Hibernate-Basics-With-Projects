package strings;

import java.util.Scanner;

public class ReverseOfstring1 {

	public static void main(String[] args) {
		
//		String s="arpan maheshwari is a good boy";
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a String to be reversed!!");
		String s=in.nextLine();
		int i=s.length()-1;
		String ans="";
		while(i>=0) {
			while(i>=0 && s.charAt(i)==' ')
				i--;
			int j=i;
			if(i<0)break;
			while(i>=0 && s.charAt(i)!=' ')
				i--;
			if(ans.isEmpty()) {
			    ans = ans.concat(s.substring(i+1,j+1));
			}else {
				ans = ans.concat(" " +s.substring(i+1,j+1));
			}
		}   
		System.out.println("Reversed of a String is : " + ans);
		in.close();
	}

}
