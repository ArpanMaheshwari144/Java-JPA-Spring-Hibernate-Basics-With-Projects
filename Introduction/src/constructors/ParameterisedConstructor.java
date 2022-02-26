package constructors;

public class ParameterisedConstructor {
	private String name;
	private int age;

	 ParameterisedConstructor(String s,int i) {
		name=s;
		age=i;
//		System.out.println("Hello I am "+name);
//		System.out.println("My age is "+age);
		
	}
	void talk() {
		System.out.println("Hello I am "+name);
		System.out.println("My age is "+age);
	}

	public static void main(String[] args) {
		
		ParameterisedConstructor ob=new ParameterisedConstructor("Sita",22);
		ob.talk();

	}

}
