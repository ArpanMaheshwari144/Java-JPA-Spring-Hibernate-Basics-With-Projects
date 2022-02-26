package oops.packages.models;

public class Teacher {
	
	public static void main(String[] args) {
		
		
		Students obj=new Students("tom");
		obj.getAddress();
		obj.getRollno();
		obj.getCollege();
		System.out.println(obj.getCollege());
		System.out.println(obj.getAddress());
		System.out.println(obj.getRollno());
		System.out.println(obj.getName());	
		
	}

}
