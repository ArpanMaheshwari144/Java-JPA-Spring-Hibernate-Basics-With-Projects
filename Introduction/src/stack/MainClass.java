package stack;

public class MainClass {

	public static void main(String[] args) {
		
		DStack s=new DStack();
		s.push(12);
		s.show();
		s.push(13);
		s.show();
		s.push(14);
		s.show();
		s.push(16);
		s.show();
		s.push(15);
		s.show();
		
		s.pop();
		s.show();
		s.pop();
		s.show();
		s.pop();
		s.show();
		s.pop();
		s.show();
	}

}
