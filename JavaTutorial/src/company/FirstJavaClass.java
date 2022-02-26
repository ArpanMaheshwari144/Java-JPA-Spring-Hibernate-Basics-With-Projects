package company;

public class FirstJavaClass {

	public static void main(String[] args) {
		

//		int marks = 18;
//		float averageMarks = 19.345f;
//		char grade = 'A';
//		String name = "Anuj";
//		boolean isValid = false;
//		long bigNumber = 98749823749823l;
//		System.out.println(marks);
//		System.out.println(averageMarks);
//		System.out.println(grade);
//		System.out.println(name);
//		System.out.println(isValid);
//		System.out.println(bigNumber);


//		int firstNumber = 1234;
//		int secondNumber = 223;
//		double sum = (double)firstNumber % (double)secondNumber;
//		System.out.println(sum);


//		int a = 12;
//		a++;
//		System.out.println(++a);
//		System.out.println(a);
//		a--;
//		System.out.println(a);


        //Taking user input
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your name: ");
//		String name = sc.nextLine();
//		System.out.println(name);


//		int age = 12;
//		if ( age > 18 ) {
//			System.out.println("you can vote");
//		} else {
//			System.out.println("you can not vote");
//		}


//		int age = 12;
//		if ( !(age > 18) ) {
//			System.out.println("you can vote");
//		} else {
//			System.out.println("you can not vote");
//		}


//		System.out.println(19 != 18);


//		char grade = 'D';
//		if(grade == 'A') {
//			System.out.println("your grade is very good");
//		} else if (grade == 'B') {
//			System.out.println("very good, keep learning");
//		} else if(grade == 'D') {
//			System.out.println("keep improving");
//		} else {
//			System.out.println("invalid grade");
//		}


//		char grade = 'R';
//		switch(grade) {
//		case 'A':
//			System.out.println("your grade is very good");
//			break;
//		case 'B':
//			System.out.println("very good, keep learning");
//			break;
//		case 'C':
//			System.out.println("Nice keep going");
//			break;
//		default:
//			System.out.println("wrong argument");
//		}


//		for(int i = 0; i < 10; i++) {
//			System.out.println("Anuj" + i);
//		}]


//		int a = 23;
//		while(a <= 100) {
//			a++;
//			if ( a == 65 ) continue;
//			System.out.println(a);
//		}


//		int a = 23;
//		do {
//			System.out.println(a);
//			a++;
//		} while(a > 100);


//		int marks[] = new int[5];
//		marks[0] = 23;
//		marks[1] = 12;
//		marks[2] = 56;
//		marks[3] = 34;
//		marks[4] = 99;
		    //OR
//		int marks[] = {23, 12, 56, 34, 99};
//
//		for(int i = 0; i<marks.length; i++) {
//			System.out.println(marks[i]);
//		}


//		int a[][] = {
//				{
//					1, 2
//				}, {
//					3, 4
//				}
//			};
//		System.out.println(a[1][0]);


//		System.out.println(average(3, 6));
//		System.out.println(average(4, 6));

		
		int a[] = new int[3];
		try {
			System.out.println(a[55]);
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Error");
			System.out.println(e.getLocalizedMessage());
		}
		System.out.println("Some code");


//		String a = "hi";
//		String b = "hi";
//		System.out.println(a == b);
//		System.out.println(a.equals(b));
		
		
//		System.out.println(1 + (int)(6*Math.random()));

    }

	static int average(int firstNumber, int secondNumber) {
		int sum = firstNumber + secondNumber;
		return sum / 2;
	}

}
