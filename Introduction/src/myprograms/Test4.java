package myprograms;

// Question -> Create a generic function that finds maximum element from the array

public class Test4 {

	public static void main(String[] args) {
		 Integer[] numbers = {100, 1000, 897, 787, 367, 36};
	     System.out.println(max(numbers));
	}
	
	 public static <T extends Comparable<T>> T max(T... elements)  {
		    T max = elements[0];
		    for (T element : elements) {
		        if (element.compareTo(max) > 0) {
		            max = element;
		        }
		    }
		    return max;
		}
}
