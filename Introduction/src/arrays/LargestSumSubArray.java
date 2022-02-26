package arrays;

public class LargestSumSubArray {

	public static void main(String[] args) {
		// it is following o(n^3)
		int a[]= {-1,4,-2,-4,-1,3,5,-6};
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				int cursum=0;   // current sum of the array 
				for(int k=i;k<=j;k++) {
					cursum=cursum+a[k];//cursum +=a[k];	
				}
				if(cursum>max) {
					max=cursum;
				}
			}
		}
		System.out.println("The largest sum of the sub array is " + max);
	}

}
