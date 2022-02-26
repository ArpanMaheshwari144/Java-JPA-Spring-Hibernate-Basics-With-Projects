package methods;

public class Introduction {

	public static void main(String[] args) {

		int c=100;
		int d=200;
		System.out.println(maxOf(c,d));
		sayHi();
		sayHi();
	}
	
  static int maxOf(int a,int b) { // static function ke ander static methods ki calling hi ho sakti hai
		 if(a > b) {        // return a>b ? a : b;
			 return a;
		 } else {
			 return b;            
		 }
	}
  static void sayHi() {
	  System.out.println("hii");
  }

}
