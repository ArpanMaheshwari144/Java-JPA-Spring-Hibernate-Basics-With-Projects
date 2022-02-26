package linkedlists;

//import java.util.*;

public class MainLinkedList {

	public static void main(String[] args) {
		
		MyLinkedList<Integer> myll=new MyLinkedList<Integer>();
//		myll.add(12);
//		myll.add(23);
//		myll.add(45);
		
		for(int i=0;i<10;i++) {
			myll.add(i);
		}
		myll.print();
		
//		l1.add(12);
//		l1.add(123);
//		l1.add(1234);
//		System.out.println(l1);
//		System.out.println(l1.get(1));
		
//		List<Integer> l1=new LinkedList<>();
//		List<Integer> l2=new ArrayList<>();
//		getTimeDiff(l1);
//		getTimeDiff(l2);
//	}
//	static void getTimeDiff(List<Integer> list) {
//		long start = System.currentTimeMillis();
//		for(int i=0;i<1000;i++) {
//			list.add(0,i);
//		}
//		long end=System.currentTimeMillis();
//		System.out.println(list.getClass().getName() + " ---> " + (end - start));		

	}

}
