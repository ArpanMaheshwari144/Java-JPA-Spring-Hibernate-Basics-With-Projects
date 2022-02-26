// 1 x  -Push the element x into the stack.
// 2    -Delete the element present at the top of the stack.
// 3    -Print the maximum element in the stack.

// 1 is for pushing the elements into the stack
// 2 is for popping the elements from stack
// 3 is for print the maximum element in the stack

package myprograms1;
import java.util.*;

public class MaximumElementInTheStack {

	public static void main(String[] args) {
		
		 Stack<Integer> stack = new Stack<>();
	     Stack<Integer> maxStack = new Stack<>();
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        for(int i=0;i<n;i++) {
	            int input = in.nextInt();
	            switch (input){
	                case 1:
	                    int x = in.nextInt();
	                    stack.push(x);
	                    if(maxStack.isEmpty() || x >= maxStack.peek()) {
	                        maxStack.push(x);
	                    }
	                    break;
	                case 2:
	                    int pop1 = stack.pop();
	                    if(pop1 == maxStack.peek()) {
	                        maxStack.pop();
	                    }
	                    break;
	 
	                case 3:
	                    System.out.print("The Maximum Element in the Stack is: " + maxStack.peek());
	                    break;
	 
	                default: break;
	            }
	        }
	        in.close();
	    }
}
