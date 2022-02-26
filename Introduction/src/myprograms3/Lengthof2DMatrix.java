package myprograms3;

public class Lengthof2DMatrix {

	public static void main(String[] args) {
		int[][] elements = { 
                { 60, 80, 75, 33 }, 
                { 47, 21, 23, 7, 19 }, 
                { 66, 91, 15, 18, 3 } 
                };
 
        System.out.println("Length of 2d Array is : " + elements.length); // 3
        System.out.println("*Size of*");
        System.out.println("1st row : " + elements[0].length); // 4
        System.out.println("2nd row : " + elements[1].length); // 5
        System.out.println("3rd row : " + elements[2].length); // 5

	}

}

/*
Explanation->
1. As a first step, we declared a two-dimensional array.
2. We used elements.length to find its size.
3. Next, we used elements[0].length to find the number of columns per row.
4. Array index always starts with 0 in Java.
*/