package myprograms;
import java.util.*;

public class KLargestElement {

	public static void main(String[] args) {
		 Scanner in=new Scanner(System.in);
		 System.out.println("Enter number of testcases you want to enter!!");
		    int t=in.nextInt();
		    while(t--!=0){
		        int n=in.nextInt();
		        int k=in.nextInt();
		        int a[]=new int[n];
		        for(int i=0;i<n;i++){
		            a[i]=in.nextInt();
		        }
		        PriorityQueue<Integer> pq=new PriorityQueue<>();
		        for(int i=0;i<n;i++){
		            if(i<k){
		                pq.add(a[i]);
		            } else{
		                if(pq.peek()<a[i]){
		                pq.poll();
		                pq.add(a[i]);
		            }
		        }
		    }
		    ArrayList<Integer> ans=new ArrayList<>(pq);
		    Collections.sort(ans,Collections.reverseOrder());
		    for(int x:ans){
		        System.out.print(x+" ");
		    }
		    System.out.println();
		    }
		    in.close();
		}
	}
