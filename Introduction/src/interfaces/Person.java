package interfaces;

public class Person implements Youtuber,Student {

	public static void main(String[] args) {
		
		Person obj=new Person();
		obj.study();
		
	//	Youtuber obj1=new Youtuber();  aap interface ka object nhi bna sakte ho becoz interface ke ander koi constructor nhi hota bcoz interface ke ander koi implementation nhi hoti hai
		
		Youtuber obj1=obj;
		obj1.makeVedio();
		obj1.editVedio();
		obj.uploadVedio();
		
	}

	public void study() {
		System.out.println("Person is Studying");
		
	}
	public void makeVedio() {
		System.out.println("Person is Making Vedio");
		
	}
	public void editVedio() {
		System.out.println("Person is Editing a Vedio");
		
	}
//	public void uploadVedio() {
//		System.out.println("person is uploading another vedio");
//
//	}

}
