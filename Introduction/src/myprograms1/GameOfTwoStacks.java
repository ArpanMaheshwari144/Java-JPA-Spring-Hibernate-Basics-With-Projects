package myprograms1;
import java.io.*;
import java.util.*;

public class GameOfTwoStacks {
	  static int twoStacks(int x, int[] a, int[] b) {
		    int ai = 0;
		    int bi = 0;
		    int count = 0;
		    int sum = 0;
		    // move bi to the position where if only take elements from B, last element it can take
		    while (bi < b.length && sum + b[bi] <= x) {
		        sum += b[bi];
		        bi++;
		    }
		    bi--; // loop exits only when bi reaches end or sum > x; in both case bi should decrease
		    count = bi + 1;
		    while (ai < a.length && bi < b.length) {
		        sum += a[ai];
		        if (sum > x) {
		            while (bi >= 0) {
		                sum -= b[bi];
		                bi--;
		                if (sum <= x) break;
		            }
		            // if even no elements taken from B, but still sum greater than x, then a[ai] should not be chosen
		            // and loop terminates
		            if (sum > x && bi < 0) {
		                ai--;
		                break;
		            }
		        }
		        count = Math.max(ai + bi + 2, count);
		        ai++;
		    }

		    return count;
		}

		    private static final Scanner scanner = new Scanner(System.in);

		    public static void main(String[] args) throws IOException {
		    	BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		        int g = Integer.parseInt(scanner.nextLine().trim());

		        for (int gItr = 0; gItr < g; gItr++) {
		            String[] nmx = scanner.nextLine().split(" ");

		            int n = Integer.parseInt(nmx[0].trim());

		            int m = Integer.parseInt(nmx[1].trim());

		            int x = Integer.parseInt(nmx[2].trim());

		            int[] a = new int[n];

		            String[] aItems = scanner.nextLine().split(" ");

		            for (int aItr = 0; aItr < n; aItr++) {
		                int aItem = Integer.parseInt(aItems[aItr].trim());
		                a[aItr] = aItem;
		            }
		            int[] b = new int[m];
		            
		            String[] bItems = scanner.nextLine().split(" ");

		            for (int bItr = 0; bItr < m; bItr++) {
		                int bItem = Integer.parseInt(bItems[bItr].trim());
		                b[bItr] = bItem;
		            }

		            int result = twoStacks(x, a, b);

		            bufferedWriter.write(String.valueOf(result));
		            bufferedWriter.newLine();
		        }

		        bufferedWriter.close();
		    }
}
