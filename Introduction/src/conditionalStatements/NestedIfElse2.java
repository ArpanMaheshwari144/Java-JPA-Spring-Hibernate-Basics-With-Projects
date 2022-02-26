package conditionalStatements;

import java.util.Scanner;

public class NestedIfElse2 {
	
	
     public static void main(String[] args) {
		
    	 Scanner in=new Scanner(System.in);
    	 System.out.println("Enter the three sides of triangle:");
    	 int a=in.nextInt();
    	 int b=in.nextInt();
    	 int c=in.nextInt();
    	 if(a+b>c && b+c>a && c+a>b)
    	 {
    		 System.out.println("Triangle is possible");
    		 if(a==b && b==c && c==a)
    		 {
    			 System.out.println("Triangle is equilateral");
    		 }
    		 else if(a==b || b==c || c==a)
    		 {
    			 System.out.println("Triangle is isoscles");
    		 }
    		 else
    		 {
    			 System.out.println("Triangle is scalar");
    		 }
    	 }
    	 else
    	 {
    		 System.out.println("Triangle is not possible");
    	 }
    	 in.close();
	}

}
