package advancerecursion;

// Ques -> Optimal Strategy to win a Coin game

public class MainClass2 {

	public static void main(String[] args) {
		
		int a[] = {3, 6, 8, 7};
		System.out.println(coinMax(a, 0, a.length-1));

	}
	
	static int coinMax(int a[], int left, int right) {
		if(left+1 == right) {
			return Math.max(a[left], a[right]);
		}
		
		return Math.max(a[left] + Math.min(coinMax(a, left+2, right), coinMax(a, left+1, right-1)), 
					    a[right] + Math.min(coinMax(a, left+1, right-1), coinMax(a, left, right-2)));
	}

}
