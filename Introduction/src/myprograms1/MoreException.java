package myprograms1;
import java.util.*;

public class MoreException {
	    int power(int n,int p) throws Exception {
	        if(n<0||p<0){
	            throw new Exception("n and p should be non-negative");
	        } else{
	        return (int)Math.pow(n,p);
	        }
	    }
 public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter number of elements you want to enter!!");
	    int t = in.nextInt();
//	    while(t-->0) {
//	    	or
	    for(int t1=1;t1<=t;t1++) {
	    	System.out.print("Enter two number: ");
	        int n = in.nextInt();
	        int p = in.nextInt();
	        MoreException myException = new MoreException();
	            try {
	                int ans = myException.power(n, p);
	                System.out.println("Your Answer is: " + ans);
	            }
	            catch (Exception e) {
	                System.out.println(e.getMessage());
	            }
	        }
	        in.close();
	    }
}

