package priorityqueues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MainClass1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of testscases: ");
		int t = in.nextInt();
		while(t-- != 0) {
			System.out.print("Enter the number of array elements you want to enter in the array: ");
			int n = in.nextInt();
			System.out.print("Enter how many largest number from the array you want to print: ");
			int k = in.nextInt();
			int a[] = new int[n];
			System.out.print("Enter the array elements: ");
			for(int i =0;i<n;i++) {
				a[i] = in.nextInt();
			}
			PriorityQueue<Integer> pq = new PriorityQueue<>();
			for(int i=0;i<n;i++) {
				if(i<k) {
					pq.add(a[i]);
				} else {
					if(pq.peek()<a[i]) {
						pq.poll();
						pq.add(a[i]);
					}
				}
			}
			ArrayList<Integer> ans = new ArrayList<>(pq);
			Collections.sort(ans, Collections.reverseOrder());
			
			System.out.print("The " + k +  " largest elements in the array is: ");
			for(int x : ans) {
				System.out.print(x+" ");
			}
			System.out.println();
		}

	}

}
