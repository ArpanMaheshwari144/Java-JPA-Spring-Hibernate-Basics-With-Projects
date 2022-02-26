package methods;

public class PassByValue {

	public static void main(String[] args) {
		
		int c=34;
		int d=12;
		 swap(c,d);
		 System.out.println(c+" "+d);
		 
		 Dog e=new Dog();
		 e.legs=4;
		 Dog f=new Dog();
		 f.legs=5;
		 System.out.println(e.legs+" "+f.legs);
		 
		 Dog g=new Dog();
		 g.legs=4;
		 changeDog(g);
		 System.out.println(g.legs);
		 
	}
	static void swap(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
	}
	static void swap(Dog a,Dog b) {
		Dog temp=a;
		a=b;
		b=temp;
	}
	static void changeDog(Dog dog) {
		dog.legs=6;
	}
}
class Dog {
	int legs;
}

