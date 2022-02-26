package arrays;

public class QuickSort {
	
	 int partition(int arr[], int low, int high) 
	    { 
	        int pivot = arr[high];  
	        int i = (low-1);  
	        for (int j=low; j<high; j++) 
	        {  
	            if (arr[j] <= pivot) 
	            { 
	                i++; 
	                int temp = arr[i]; 
	                arr[i] = arr[j]; 
	                arr[j] = temp; 
	            } 
	        } 
	        int temp = arr[i+1]; 
	        arr[i+1] = arr[high]; 
	        arr[high] = temp; 
	  
	        return i+1; 
	    }
	void sort(int arr[],int low,int high) {
		  if (low < high) 
	        { 
	            int pi = partition(arr, low, high); 
	            sort(arr, low, pi-1); 
	            sort(arr, pi+1, high); 
	        } 
	}
	  static void printArray(int arr[]) {
		  for(int i:arr) {
			  System.out.print(i+" ");
		  }
	  }
	public static void main(String[] args) {
		
		 int arr[] = {10,9,8,7,6,5,4,3,2,1,20,19,18,17,16,15,15,14,13,13,12,11}; 
	        int n = arr.length; 
	  
	        QuickSort ob = new QuickSort(); 
	        ob.sort(arr, 0, n-1); 
	  
	        System.out.println("sorted array"); 
	        printArray(arr); 
	
	}

}
