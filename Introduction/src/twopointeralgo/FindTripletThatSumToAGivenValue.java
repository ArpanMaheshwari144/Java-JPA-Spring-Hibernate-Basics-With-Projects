// complexity of this program is o(n^3)
package twopointeralgo;
public class FindTripletThatSumToAGivenValue {
    boolean  find3Numbers(int A[], int arr_size, int sum) 
    {
        for (int i = 0; i < arr_size - 2; i++) {  
            for (int j = i + 1; j < arr_size - 1; j++) { 
                for (int k = j + 1; k < arr_size; k++) { 
                    if (A[i] + A[j] + A[k] == sum) { 
                        System.out.print("Triplet is " + A[i] + ", " + A[j] + ", " + A[k]); 
                        return true; 
                    }
                } 
            } 
        } 
        return false;
    }  
public static void main(String[] args) { 
	FindTripletThatSumToAGivenValue t = new FindTripletThatSumToAGivenValue(); 
        int A[] = {1,2,3,4,5,6,7,8,9,10,11,12,1,3,2,3,2,3,4,56,4,33}; 
        int sum = 56; 
        int arr_size = A.length; 
        t.find3Numbers(A, arr_size, sum); 
    } 

}
