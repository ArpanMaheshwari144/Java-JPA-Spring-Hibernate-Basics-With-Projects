package myprograms;
import java.util.*;

public class Difference {
	private int[] elements;
  	public int maximumDifference;
      public Difference(int[] elements){
          this.elements=elements;
      }
    void computeDifference(){
        for (int i = 0; i < elements.length; i++) {
           for (int j = i + 1; j < elements.length; j++) {
            maximumDifference = Math.max(maximumDifference,Math.abs(elements[i]-elements[j]));
            }
        }
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
          Difference difference = new Difference(a);
 
          difference.computeDifference();

          System.out.print("THE MAXIMUM NUMBER IS : " + difference.maximumDifference);
          sc.close();
          }
        } 
  
