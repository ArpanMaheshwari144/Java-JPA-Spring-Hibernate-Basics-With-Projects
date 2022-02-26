package deque;

//import java.util.ArrayDeque;

public class MainClass {

	public static  void main(String[] args) {
		
//		ArrayDeque<Integer> ad=new ArrayDeque<>();
//		ad.addFirst(23);
//		ad.addFirst(22);
//		ad.pop();
//		System.out.println(ad.peek());
		
//		ad.push(12);
//		ad.push(23);
//		ad.push(34);
//		System.out.println(ad.pop());
//		System.out.println(ad.pop());
		
		MyDeque<Integer> m=new MyDeque<>();
		m.addToHead(12);
		m.addToHead(13);
		System.out.println(m.removeLast());
	}

}
