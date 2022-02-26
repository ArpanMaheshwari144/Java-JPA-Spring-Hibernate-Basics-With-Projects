package programs;

import java.util.Scanner;

public class Singleton1 { 
	    Scanner in=new Scanner(System.in);
		private static Singleton1 single_instance = null;  
		public String s;  
		private Singleton1() 
		{ 
			System.out.println("Please enter a Line or a Word!!");
			s =in.nextLine(); 
		}  
		public static Singleton1 getInstance() 
		{ 
			if (single_instance == null) 
				single_instance = new Singleton1(); 

			return single_instance; 
		}  
		public static void main(String args[]) {
			Singleton1 x = Singleton1.getInstance(); 
			System.out.println("Hello I am a singleton! Let me say " + x.s + " to you");
		} 
}
