package interviewQuestions;
import java.util.*;

public class SlidingWindowMaximum {

	public static void main(String[] args) {
		
		Solution solution = new Solution();
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n=in.nextInt();
		int[] a=new int[n];
		System.out.print("Enter array elements: ");
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		System.out.print("Enter how many window do you want: ");
		int b=in.nextInt();
		int ans[] = solution.maxSlidingWindow(a, b);

		for(int x: ans) {
			System.out.print(x +" ");
		}
		in.close();
	}
	static class Solution {
	    public int[] maxSlidingWindow(int[] a, int k) {
	        int n = a.length;
	        if(n<=1) return a;
	    	Deque<Integer> dq = new LinkedList<>();
	    	int ans[] = new int[n-k+1];
	    	
	    	int i = 0;
	    	for(; i<k; i++) {
	    		while(!dq.isEmpty() && a[dq.peekLast()] <= a[i]) {
	    			dq.removeLast();
	    		}
	    		dq.addLast(i);
	    	}
	    	
	    	for(; i<n; i++) {
	    		ans[i-k] = a[dq.peekFirst()];
	    		
	    		while(!dq.isEmpty() && dq.peekFirst() <= i-k) {
	    			dq.removeFirst();
	    		}
	    		
	    		while(!dq.isEmpty() && a[dq.peekLast()] <= a[i]) {
	    			dq.removeLast();
	    		}
	    		dq.addLast(i);
	    	}
	    	
	    	ans[i-k] = a[dq.peekFirst()];
	    	
	    	return ans;
	    }
	}
}
