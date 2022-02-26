package sets;

/*
 * Given an array, find if there exists a subarray with sum equals to k
 * */

import java.util.*;
public class SubarrayWithSumEqualsTok {

	public static void main(String[] args) {
		

		int[] a = {2, 1, 3, -4, -2};
		int k=-3;
		boolean found = false;
		
		Set<Integer> set = new HashSet<>();
		int sum=0;
		for(int element : a) {
			set.add(sum);
			sum = sum + element;
			if(set.contains(sum-k)) {
				found = true;
				break;
			}
		}
		System.out.println("Found " + found);

	}

}
