package operators;

public class LogicalOperators {

	public static void main(String[] args) {
		
		int a=14;
		if(a>1 && a<100) { //in logical && both operation is true so statement will execute
			System.out.println("number is found");
		}
		if(a>1 || a<19) {// in || if one operation is true so statement will execute
			System.out.println("number is found");
		}

		int b=14;
		if(b>1 & b<100) {
			System.out.println("number is found");
		}
		if(b>1 | b<19) {
			System.out.println("number is found");	
		}
		int grade=11;
		
		if(!(grade==10||grade==12)) {
			System.out.println("you don't give board exams");
		}
		

	}

}
