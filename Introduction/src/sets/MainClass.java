package sets;

import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		
		// Set does not allows duplicate values
		// HashSet guarantee nhi leta hai ki jis order mei hum elements iske andar daal rahe hai usi order mei humme vapas elements mile  
//		Set<String> fruits = new HashSet<>();
//		fruits.add("Apple");
//		fruits.add("Banana");
//		fruits.add("Kiwi");
//		
//		System.out.println(fruits);
		
		
		// LinkedHashSet guarantee leta hai ki jis order mei hum elements iske andar daal rahe hai ye usi order mei humme vapas elements milenge  
//		Set<String> fruits = new LinkedHashSet<>();
//		fruits.add("Banana");
//		fruits.add("Apple");
//		fruits.add("Kiwi");
//				
//		System.out.println(fruits);
		
		
		// TreeSet guarantee leta hai ki jis order mei hum elements iske andar daal rahe hai ye humme vapas elements sorted order dega  
		Set<String> fruits = new TreeSet<>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Kiwi");
						
		System.out.println(fruits);


	}

}
