package arrays;

import java.util.*;

public class BucketSort {

	   public static void sort(int[] a, int maxVal) {
	      int [] bucket=new int[maxVal+1];
	      
	      for (int i=0; i<a.length; i++) {
	         bucket[a[i]]++;
	      }
	      int outPos=0;
	      for (int i=0; i<bucket.length; i++) {
	         for (int j=0; j<bucket[i]; j++) {
	            a[outPos++]=i;
	         }
	      }
	   }
	   public static void main(String[] args) {
	      int maxVal=30;
	      int [] data= {10,9,8,7,6,5,4,3,2,1,20,19,18,17,16,15,14,13,12,11,0}; 
	      System.out.println("Before: " + Arrays.toString(data));
		  sort(data,maxVal);
	      System.out.println("After:  " + Arrays.toString(data));
	   }
}
