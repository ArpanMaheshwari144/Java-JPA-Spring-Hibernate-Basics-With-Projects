package constructors;

public class DefaultConstructor {
	private String name;
	private int age;
	

	 DefaultConstructor() {
		name="Raju";
		age=22;
	}
	void talk() {
		System.out.println("Hello I am "+name);
		System.out.println("My age is "+age);
	}

	public static void main(String[] args) {
		
		DefaultConstructor ob=new DefaultConstructor();
		ob.talk();

	}

}
