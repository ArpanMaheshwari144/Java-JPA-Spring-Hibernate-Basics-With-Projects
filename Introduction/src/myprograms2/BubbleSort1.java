package myprograms2;

import java.util.Scanner;

public class BubbleSort1 {
	
	  void printArray(int a[]) { 
	        int n = a.length; 
	        for (int i=0; i<n; ++i) 
	            System.out.print(a[i] + " "); 
	        System.out.println(); 
	    }
	void bubbleSort(int[] a) {
	
	  int temp,n=a.length,numOfSwaps = 0;

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
	}
    public static void main(String args[]) { 
        BubbleSort1 ob = new BubbleSort1(); 
        Scanner in = new Scanner(System.in);
	       System.out.print("Enter number of elements in the array: ");
	       int n = in.nextInt();
	       int a[] = new int[n];
	       System.out.print("Enter array elements:");
	       for (int i=0; i<n; i++) {
	         a[i] = in.nextInt();
	        }
	       ob.bubbleSort(a);
	       System.out.print("Sorted array is: "); 
	       ob.printArray(a); 
           in.close();
    } 
}
