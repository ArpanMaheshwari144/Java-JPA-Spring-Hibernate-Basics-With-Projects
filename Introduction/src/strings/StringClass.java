package strings;

public class StringClass {

	public static void main(String[] args) {
		
		        String s1 = new String("HELLO"); 
		        String s2 = new String("HELLO"); 
		        System.out.println(s1 == s2); 
		        System.out.println(s1.equals(s2));
		        
                System.out.println("--------------------------------------");
                
		        // integer-type 
		        System.out.println(10 == 20); 
		  
		        // char-type 
		        System.out.println('a' == 'b'); 
		  
		        // char and double type 
		        System.out.println('a' == 97.0);
			 
		        // boolean type 
		        System.out.println(true == true);
		        
		        System.out.println("------------------------------------------");
	
		        Thread t = new Thread(); 
		        Object o = new Object(); 
		        String s = new String("GEEKS"); 
		  
		        System.out.println(t == o); 
		        System.out.println(o == s); 
		  
		      
		      // System.out.println(t==s);
		        
		        System.out.println("----------------------------------------------");
		
		        Thread t1 = new Thread(); 
		        Thread t2 = new Thread(); 
		        Thread t3 = t1; 
		  
		        String s3 = new String("GEEKS"); 
		        String s4 = new String("GEEKS"); 
		  
		        System.out.println(t1 == t3); 
		        System.out.println(t1 == t2); 
		        System.out.println(s3 == s4); 
		  
		        System.out.println(t1.equals(t2)); 
		        System.out.println(s3.equals(s4));  
	}

}
