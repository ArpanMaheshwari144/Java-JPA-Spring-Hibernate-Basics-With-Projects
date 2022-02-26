package patterns;

public class Pattern13 {

	public static void main(String[] args) {
		
		int r=1;
		for(int i=1;i<=5;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i)-1;j++) {
				System.out.print(r*r+" ");
				r++;
			}
			System.out.println();
		}

	}

}
