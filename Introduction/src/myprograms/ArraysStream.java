package myprograms;
import java.util.*;
import java.util.stream.IntStream;

public class ArraysStream {

	public static void main(String[] args) {
		
		 IntStream stream = IntStream.of(1,2,5,8); 
		   
	        OptionalInt obj = stream.max(); 
	   
	        if (obj.isPresent()) { 
	            System.out.println(obj.getAsInt()); 
	        } 
	        else { 
	            System.out.println("-1");
	        }
	    } 

}
