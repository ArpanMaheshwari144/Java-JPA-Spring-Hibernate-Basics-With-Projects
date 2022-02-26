package myprograms3;
import java.util.*;

public class SimpleTextEditor {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 System.out.print("Enter number of testcases: ");
	      int N = Integer.parseInt(in.nextLine());
	      String s = "";
	      Stack<String> sCopies = new Stack<String>();
	      for (int i = 1; i <= N; i++) {
	            int query = Integer.parseInt(in.next());
	            switch (query) {
	            case 1: {
	            String inputElement = in.next();
	            sCopies.push(s);
	            s += inputElement;
	            break;
	            }
	            case 2: {
	            int inputElement = in.nextInt();
	            sCopies.push(s);
	            int k = inputElement;
	            s = s.substring(0, s.length() - k);
	            break;
	            }
	            case 3: {
	            int inputElement = in.nextInt();
	            char c = s.charAt(inputElement - 1);
	            System.out.println(c);
	            break;
	            }
	            case 4: {
	            s = sCopies.pop();
	            break;
	            }
	        }
	    }
	      in.close();
	}
}
