package knapsackproblem;

import java.util.Arrays;

public class Knapsack {

	public static void main(String[] args) {
		
		int w = 10;
        int[] val = {20, 30, 10, 50};
        int[] wt = {1, 3, 4, 6};
        int n = val.length;
        
        int[][] mat = new int[n+1][w+1];
        for(int r = 0; r < w + 1; r++) {
        	mat[0][r] = 0;
        }
        
        for(int c = 0; c < n + 1; c++) {
        	mat[c][0] = 0;
        }
        
        for(int item = 1; item <= n; item++) {
        	for(int capacity = 1; capacity <= w; capacity++) {
        		int maxValueWithoutCurrent = mat[item - 1][capacity];  // This is guaranteed to exist
        		int maxvalueWithCurrent = 0;  // We initialize this value to 0
        		
        		int weightOfCurrent = wt[item - 1];  // We use item -1 to account for the extra row at the top
        		if(capacity >= weightOfCurrent) {  // We check if the knapsack can fit the current item
        			maxvalueWithCurrent = val[item - 1];  // If so, maxValWithCurr is at least the value of the current item
        			
        			int remainingCapacity = capacity - weightOfCurrent;   // remainingCapacity must be at least 0
        			maxvalueWithCurrent = maxvalueWithCurrent + mat[item - 1][remainingCapacity];  // Add the maximum value obtainable with the remaining capacity
        		}
        		mat[item][capacity] = Math.max(maxValueWithoutCurrent, maxvalueWithCurrent);  // Pick the larger of the two
        	}
        }
        System.out.println(mat[n][w]); // Final answer
        System.out.println(Arrays.deepToString(mat));  // Visualization of the table
	}
}
