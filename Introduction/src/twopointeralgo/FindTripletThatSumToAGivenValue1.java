// complexity of this program is o(n^2)
package twopointeralgo;
import java.util.Arrays;
public class FindTripletThatSumToAGivenValue1 {
	 boolean find3Numbers(int A[], int arr_size, int sum) 
	    { 
	        int l, r; 
	        Arrays.sort(A); 
	        for (int i = 0; i < arr_size-2; i++) {  
	            l = i + 1; // index of the first element in the remaining elements 
	            r = arr_size - 1; // index of the last element 
	            while (l < r) { 
	                if (A[i] + A[l] + A[r] == sum) { 
	                    System.out.print("Triplet is " + A[i] + ", " + A[l] + ", " + A[r]); 
	                    return true; 
	                } 
	                else if (A[i] + A[l] + A[r] < sum) 
	                    l++; 
	                else // A[i] + A[l] + A[r] > sum 
	                    r--; 
	            } 
	        } 
	        return false; 
	    } 
	    public static void main(String[] args) 
	    { 
	    	FindTripletThatSumToAGivenValue1 t = new FindTripletThatSumToAGivenValue1(); 
	        int A[] = { 1,2,4,3,6,0}; 
	        int sum = 10; 
	        int arr_size = A.length; 
	        t.find3Numbers(A, arr_size, sum); 
	    } 
	} 
