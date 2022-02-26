package myprograms;

import java.util.Scanner;

public class PatternMatching1 {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s1=in.nextLine();
		String s2=in.nextLine();
		  int a = s1.length();
		  int b = s2.length();
		  int count = 0;
		  int patternCount = 0;
		  char c,p;
		  for(int i=0; i <= a-b; i++) {
		   c = s1.charAt(i);
		   p = s2.charAt(0);
		   if (c == p) {
		    count++;
		    for(int j=i+1,k=1;k<b;j++,k++) {
		     c = s1.charAt(j);
		     p = s2.charAt(k);
		     if (c == p)
		      count++;
		    }
		    if (count == b)
		     patternCount++;
		   }
		   else {
		    count = 0;
		   }
		  }
		  if (patternCount > 0)
		   System.out.println("Pattern found " + patternCount + " times");
		  else
		   System.out.println("Not Found!");
		  in.close();
		 }
}
