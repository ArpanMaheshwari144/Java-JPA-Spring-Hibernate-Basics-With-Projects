package interfaces;

public abstract interface Youtuber extends VedioEditor {
	
//	public static final int x=9;  // becoz x in interface variables are already in public static final state  
	   int x=9;
	
	abstract void makeVedio();
	
	default void uploadVedio() {     // if you want to make a concrete functions/methods in interfaces use default keyword before creating a method/function
		System.out.println("Person is uploading a vedio");
	}

}
