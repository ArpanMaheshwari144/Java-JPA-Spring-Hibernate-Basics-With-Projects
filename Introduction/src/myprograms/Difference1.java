package myprograms;

import java.util.Scanner;

public class Difference1 {
	private int[] elements;
  	public int maximumDifference;
  	
  	private Difference1(int[] a) {
  	  elements = a;
  	}

  	private void computeDifference() {
  	  int max = 0;
  	  for (int i = 0; i < elements.length-1; i++) {
  	      for (int j = i+1; j < elements.length; j++) {
  	          int diff = Math.abs(elements[i] - elements[j]);
  	          if (diff > max) 
  	              max = diff;
  	      }
  	  }
  	  maximumDifference = max;
  	}
  	 public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("ENTER THE SIZE OF THE ARRAY MOTHERFUCKER!!");
          int n = sc.nextInt();
          int[] a = new int[n];
          System.out.println("ENTER THE ELEMENTS OF THE ARRAY MOTHERFUCKER!!");
          for (int i = 0; i < n; i++) {
              a[i] = sc.nextInt();
          }
          Difference1 difference = new Difference1(a);
 
          difference.computeDifference();

          System.out.print("THE MAXIMUM NUMBER IS : " + difference.maximumDifference);
          sc.close();
          }
}
