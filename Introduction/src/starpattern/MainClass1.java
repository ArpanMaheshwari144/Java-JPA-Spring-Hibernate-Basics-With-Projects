package starpattern;

public class MainClass1 {

	public static void main(String[] args) {
		
		int i, j;
		for(i = 1; i <= 8; i++) {
			for(j = 1; j <= 8; j++) {
				if(i == 2 && (j >= 3 && j < 8)) {
					System.out.print(" ");
				}
				else if(j == 7 && (i >= 3 && i <= 6)) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
