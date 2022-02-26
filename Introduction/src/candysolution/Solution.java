package candysolution;
import java.util.Arrays;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter the size of the array:");
        int n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int c[]=new int[n];
        Arrays.fill(c, 1);
        for(int i=1;i<n;i++) {
        	if(a[i]>a[i-1]) {
        		c[i]=c[i-1]+1;
        	}
        }
        for(int i=n-2;i>=0;i--) {
        	if(a[i]>a[i+1]) {
        		c[i]=Math.max(c[i+1]+1, c[i]);
        	}
        }
        long sum = 0;
        for(int i = 0; i < n; i++) {
            sum += (long)c[i];
        }
        System.out.println("Minumum number of candies required to distribute are = "+sum);
        in.close();
    }
}
