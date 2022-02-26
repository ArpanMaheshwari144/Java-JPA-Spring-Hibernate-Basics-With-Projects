package myprograms;
import java.util.*;

public class Difference2 {
	  private int[] elements;
	    public int maximumDifference;
	    
	    public Difference2 (int [] elements) {
	        this.elements = elements;
	    }
	    void computeDifference() {
	        int max = Arrays.stream(elements).max().getAsInt();
	        int min = Arrays.stream(elements).min().getAsInt();     
	        maximumDifference = max - min ;
	    }

        public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("ENTER THE SIZE OF THE ARRAY MOTHERFUCKER!!");
         int n = sc.nextInt();
         int[] a = new int[n];
         System.out.println("ENTER THE ELEMENTS OF THE ARRAY MOTHERFUCKER!!");
         for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
          }
          Difference2 difference = new Difference2(a);

          difference.computeDifference();

          System.out.print("THE MAXIMUM NUMBER IS : " + difference.maximumDifference);
          sc.close();
        }
}
