package sets;

/*
 * Given an array, find if there exists a subarray with sum equals to zero
 * */

import java.util.*;
public class SubarrayWithZeroSum {

	public static void main(String[] args) {
		
		int[] a = {2, 1, -3, 4, 2};
		boolean found = false;
		
		// this is brute force method O(n^2) time complexity
//		for(int i=0;i<a.length;i++) {
//			int sum=0;
//			for(int j=i;j<a.length;j++) {
//				sum = sum + a[j];
//				if(sum==0) {
//					found = true;
//					break;
//				}
//			}
//			if(found) {
//				break;
//			}
//		}
//		System.out.println("Found " + found);
		
		// this is taking O(n) time complexity
		Set<Integer> set = new HashSet<>();
		int sum=0;
		for(int element : a) {
			set.add(sum);
			sum = sum + element;
			if(set.contains(sum)) {
				found = true;
				break;
			}
		}
		System.out.println("Found " + found);
	}
}
