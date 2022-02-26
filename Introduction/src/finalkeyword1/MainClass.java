package finalkeyword1;

public class MainClass { //extends Student becoz we make student class as final
	
//	public void getDiscription() {        becoz we final that method in student class
//		System.out.println("you are looser");
//	}
	
//	int rollNo; agar humne isko final nahi kiya to isko initialise karna jaruri nhi
//	final static int rollNo=4;//agar humne isko final kiya hai to isko initialise karna jaruri nhi
//    final static int ROLL_N0=5; // convention of final keyword
   
	public static void main(String[] args) {
			
//		final String name="Anuj"; // these are local variables becoz they are within a class
		   //  OR
//		final String name;
		
//		name="Kumar";
//		System.out.println(name="Anuj");
		
//		System.out.println(name);
//		System.out.println(rollNo);
//		System.out.println(ROLL_N0);
		
//		final Student obj1=new Student();  // if one obj is final so we cannot initialise to second obj
//		Student obj2=new Student();
		// obj1=obj2;
//		System.out.println(obj1.name="Anuj");
//		System.out.println(obj1.rollno=4);
		
		Student s=new Student();
		s.getDiscription();
		
//		MainClass obj=new MainClass();
//		obj.getDiscription();
		

	}

}
