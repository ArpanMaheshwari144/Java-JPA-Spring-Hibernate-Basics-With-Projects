package myprograms0;

public class CanoName {

	public static void main(String[] args) {
		
		CanoName c = new CanoName();

	      // returns the canonical name of the underlying class if it exists
	      System.out.println("Class = " +  c.getClass().getCanonicalName()); 

	}

}
