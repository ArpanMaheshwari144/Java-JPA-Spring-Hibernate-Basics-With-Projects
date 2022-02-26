package lists;

import java.util.ArrayList;
import java.util.List;
//import java.util.LinkedList;

public class MyArrayList {

	public static void main(String[] args) {
		
//		ArrayList<String> fruits=new ArrayList<>();
		List<String> fruits=new ArrayList<>();
//		List<String> vegetables=new LinkedList<>(); // becoz it all implements list whether it is linkedlist and arraylist
		
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Grapes");
		for(String e:fruits) {
			System.out.println(e);
		}
		String temp[]=new String[fruits.size()];
		fruits.toArray(temp);
		for(String e:temp) {
			System.out.println(e);
		}
//		System.out.println(fruits.get(1));
//		System.out.println(fruits);
//		fruits.set(2, "Banana");
//		System.out.println(fruits);
//		fruits.remove(0);
//		System.out.println((fruits));
//		fruits.clear();
//		System.out.println(fruits);
//		List<String> toRemove=new ArrayList<>();
//		toRemove.add("Apple");
//		toRemove.add("Orange");
//		fruits.removeAll(toRemove);
//		System.out.println(fruits);
//		System.out.println(fruits.contains("Apple"));
//		System.out.println(fruits.contains("Banana"));
//		System.out.println(fruits);
//		System.out.println(fruits.isEmpty());
//		System.out.println(fruits);
//		System.out.println(fruits.size());
//		System.out.println(fruits);

//		vegetables.add("Tomato");
//		vegetables.add("Potato");
//		vegetables.add("Carrot");
		
//		fruits.addAll(vegetables);
//		System.out.println(fruits);
		
//		Pair<String,Integer> p=new Pair<>("Arpan",21);       // these are generic classes
//		Pair<Boolean,String> p1=new Pair<>(true,"hello");
//		p.getDescription();
//		p1.getDescription();

	}

}
