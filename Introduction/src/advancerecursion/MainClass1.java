package advancerecursion;

// Ques -> Print all permutations of a given String

import java.util.*;
public class MainClass1 {
	
	static Set<String> set = new HashSet<>();

	public static void main(String[] args) {
		
		permutations("abcc", 0, 3);
		
	}
	
	static void permutations(String s, int left, int right) {
		if(left == right) {
			if(set.contains(s)) return;
			set.add(s);
			System.out.println(s);
			return;
		}
		
		for(int i = left; i<=right; i++) {
			s = interchangeChar(s, left, i);
			permutations(s, left+1, right);
			s = interchangeChar(s, left, i);
		}
	}
	
	static String interchangeChar(String s, int a, int b) {
		char array[] = s.toCharArray(); // string change to array
		char temp = array[a];
		array[a] = array[b];
		array[b] = temp;
		return String.valueOf(array); // array change to string
	}

}
