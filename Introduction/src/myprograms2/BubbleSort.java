package myprograms2;
import java.util.*;
public class BubbleSort {
	
	  public static void main(String[] args) {
	       Scanner in = new Scanner(System.in);
	       System.out.print("Enter number of elements in the array: ");
	       int n = in.nextInt();
	       int a[] = new int[n];
	       System.out.print("Enter array elements:");
	       for (int i=0; i<n; i++) {
	         a[i] = in.nextInt();
	        }
	       int temp,numOfSwaps = 0;

	        for (int i=0; i<n; i++) {
	            for (int j=0; j<n-1; j++) {
	                if ( a[j] > a[j+1] ) {
	                    temp = a[j];
	                    a[j] = a[j+1];
	                    a[j+1] = temp;
	                    numOfSwaps++;
	                }
	            }
	            if (numOfSwaps == 0) {
	                break;
	            }
	        }
	     System.out.println("Array is sorted in " + numOfSwaps + " swaps.");
	     System.out.println("First Element: " + a[0]);
	     System.out.println("Last Element: " + a[a.length-1]);
	     in.close();
	    }
}
