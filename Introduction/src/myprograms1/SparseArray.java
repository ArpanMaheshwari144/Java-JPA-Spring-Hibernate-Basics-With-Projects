package myprograms1;
import java.util.*;

public class SparseArray {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 System.out.print("Enter number of strings you want to enter:");
	        int n = in.nextInt();
	        String[] stringArr = new String[n];
	        System.out.println("Enter strings: ");
	        for (int i = 0; i < n; i++){
	                stringArr[i] = in.next();              
	            }
	        System.out.print("Enter the number of queries you want to enter:");
	        int q = in.nextInt();
	        for (int i = 0; i < q; i++){
	                String stringQue = in.next();

	                int occNum = 0;
	                for (int j = 0; j < n; j++){
	                    if (stringQue.equals(stringArr[j])) occNum++;                                           
	                }
	             System.out.println(occNum);
	        } 
	        in.close();
	    }
	}
