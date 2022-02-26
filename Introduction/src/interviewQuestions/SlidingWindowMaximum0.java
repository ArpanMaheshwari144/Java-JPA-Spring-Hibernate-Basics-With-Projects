package interviewQuestions;
import java.util.Scanner;
public class SlidingWindowMaximum0 {
	 static void printKMax(int arr[], int k) {
		    int n=arr.length;
	        int j, max; 
	        for (int i = 0; i <= n - k; i++) { 
	            max = arr[i]; 
	            for (j = 1; j < k; j++) { 
	                if (arr[i + j] > max) 
	                    max = arr[i + j]; 
	            } 
	            System.out.print(max+" ");
	        } 
	        System.out.println();
	    } 
	    public static void main(String args[]) { 
	        Scanner in=new Scanner(System.in);
	        System.out.print("Enter number of tesctcases you want to enter:");
	        int t=in.nextInt();
	        while(t-->0){
	        	System.out.print("Enter size of the array and the size of the window:");
	            int n=in.nextInt();
	            int k=in.nextInt();
	            int a[]=new int[n];
	            System.out.print("Enter the array elements:");
	            for(int i=0;i<n ;i++){
	                a[i]=in.nextInt();
	            }
	            printKMax(a, k); 
	        }
	       in.close();
	    }
}
