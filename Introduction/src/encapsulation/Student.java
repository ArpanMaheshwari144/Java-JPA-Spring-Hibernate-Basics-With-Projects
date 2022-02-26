package encapsulation;

public class Student {
	
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age>20) {
			System.out.println("you can take admission");
		}
		else {
			this.age=age;
			System.out.println("your can't take admission");
		}
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name=="Chutiya") {
			System.out.println("you are inappropriate name");
		}
		else {
		   this.name=name;
		   System.out.println("your name is perfect");
		}
	}

}
