package programs;

import java.util.Scanner;

public class ArraysReverseOrder {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter size of array!!");
		    int n=scan.nextInt();
		    System.out.println("Enter array's elements!!");
	        int[] array = new int[n];
	        for(int i = 0; i < array.length; i++){
	            array[i] = scan.nextInt();
	        }
	        for(int i = array.length - 1; i >= 0; i--){
	            System.out.print(array[i] + " ");
	        }
	        scan.close();
	}

}
