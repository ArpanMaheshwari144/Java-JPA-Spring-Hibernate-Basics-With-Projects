package encapsulation;

public class EncapsulationIntroduction {

	public static void main(String[] args) {
		
		
		Student obj=new Student();
		Student1 obj1=new Student1();
		obj.setAge(19);
		obj.setName("Tom");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		obj1.setAge(50);
		obj1.setName("arpan");
		System.out.println(obj1.getAge());
		System.out.println(obj1.getName());
		

	}

}
