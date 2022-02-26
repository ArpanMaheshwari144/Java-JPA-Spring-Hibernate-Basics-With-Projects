package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams6 {
	static boolean checkAnagram(String str1,String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		char[] strArray1=str1.toCharArray();
		char[] strArray2=str2.toCharArray();
		Arrays.sort(strArray1);
		Arrays.sort(strArray2);
		String sortedstr1=new String(strArray1);
		String sortedstr2=new String(strArray2);
		if(sortedstr1.equals(sortedstr2)) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter First String:");
		String str1=in.next();
		System.out.println("Enter Second String:");
		String str2=in.next();
		if(checkAnagram(str1,str2)) {
			System.out.println("Strings are Anagrams!!");
		}
		else {
			System.out.println("Strings are not Anagrams!!");
		}
		in.close();

	}

}
