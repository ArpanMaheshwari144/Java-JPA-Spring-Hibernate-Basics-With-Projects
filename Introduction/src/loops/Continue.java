package loops;

public class Continue {

	public static void main(String[] args) {
		
		
		for(int i=1;i<=100;i++) {
			if(i>=40 && i<=50) { //in logical && both condition will true
				continue; // for skipping
			}
			System.out.println(i);
		}

	}

}
