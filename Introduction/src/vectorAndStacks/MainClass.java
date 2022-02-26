package vectorAndStacks;

// import java.util.Vector;

public class MainClass {

	public static void main(String[] args) throws Exception {
//		Vector<Integer> v=new Vector<>();
//		v.add(12);
//		v.add(13);
//		v.add(133);
//		System.out.println(v);
//		System.out.println(v.get(1));
//		v.set(2, 14);
//		System.out.println(v);
		
		MyStack<Integer> s=new MyStack<>();
		s.push(12);
		s.push(24);
		s.push(36);
		System.out.println(s);
		int popped=s.pop();
		System.out.println("Popped element is : " + popped);
//		popped=s.pop();
//		System.out.println(popped);
		int peeked=s.peek();
		System.out.println("Peeked element is : " + peeked);
		
	}

}
