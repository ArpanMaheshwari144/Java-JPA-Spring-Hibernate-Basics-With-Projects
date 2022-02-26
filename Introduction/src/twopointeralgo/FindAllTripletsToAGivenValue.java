package twopointeralgo;
import java.util.*;

public class FindAllTripletsToAGivenValue {
	static void findTriplets(int[] arr,  int n, int sum) {  
			Arrays.sort(arr); 	
			for (int i = 0;  i < n - 1; i++)  { 
			int l = i + 1; 
			int r = n - 1; 
			int x = arr[i]; 
			while (l < r)  { 
			if (x + arr[l] + arr[r] == sum)  { 
			   System.out.println(x + " " + arr[l] +  " " + arr[r]);
			   l++; 
			   r--; 
			} 
			else if (x + arr[l] + arr[r] < sum)  l++; 
			else r--; 
			}
		}
	}
	static int countTriplets(int arr[], int n, int sum) { 
        int count = 0; 
        for (int i = 0; i < n - 2; i++) 
            for (int j = i + 1; j < n - 1; j++) 
                for (int k = j + 1; k < n; k++) 
                    if (arr[i]+arr[j]+ arr[k] == sum) 
                        count++; 
  
        return count; 
    } 
	public static void main(String args[]) 
	{ 
	    int[] arr ={1,2,4,3,6,2,0}; 
	    int sum = 10; 
	    int n = arr.length; 
	    findTriplets(arr, n, sum); 
	    System.out.print("All Triplets are:");
	    System.out.println(countTriplets(arr, arr.length, sum)); 
	}  
}
