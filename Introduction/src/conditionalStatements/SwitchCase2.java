package conditionalStatements;

public class SwitchCase2 {

	public static void main(String[] args) {
		
		
		int rating=1;
		
		switch(rating) {
		case 1:
		case 2:
			System.out.println("Bad Review");
			break;
		case 3:
			System.out.println("Avg Review");
			break;
		case 4:
		case 5:
			System.out.println("Good Review");
			break;
		}
		

	}

}
