package statickeyword;

public class StaticBlocks2 {
	
	  static int i; 
	    int j; 
	    static { 
	        i = 10; 
	        System.out.println("static block called "); 
	    } 
	    StaticBlocks2(){ 
	        System.out.println("Constructor called"); 
	    }
	    
	    public static void main(String args[]) {  
	    	StaticBlocks2 t1 = new StaticBlocks2(); 
	    	StaticBlocks2 t2 = new StaticBlocks2(); 
	    } 

}
