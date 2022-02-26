package patterns;

public class Pattern14 {

	public static void main(String[] args) {
		
		int t1=5,t2=5;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=9;j++) {
					if(j==t1||j==t2||i==5) {
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				t1++;
				t2--;
				System.out.println();
			}
		}
}
