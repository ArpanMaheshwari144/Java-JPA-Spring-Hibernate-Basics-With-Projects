package patterns;

public class Pattern12 {

	public static void main(String[] args) {
		
		int r=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(r+" ");
				r++;
			}
			System.out.println();
		}

	}

}
