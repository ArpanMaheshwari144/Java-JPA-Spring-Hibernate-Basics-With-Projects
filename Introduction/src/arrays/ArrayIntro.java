package arrays;

public class ArrayIntro {

	public static void main(String[] args) {
 
//		int[] marks=new int[5];  //declaration of array
//		int[] marks;
//		marks=new int[10];      //declaration of array
	//	int marks[]=new int[5];   //declaration of an array
	//	System.out.println(marks[0]);
	//	int[] rollnos,classes;      //both rollnos and classes are array
	//	int rollnos[],classes;      //rollnos are array and classes are not an array
	//	int rollnos[],classes[];    //both rollnos and classes are array
		
		int[] age= {2,5,1,34,12};
//		age[1]=3;
//		double[] marks= {1.0,3.14,2.9};
//		marks[1]=2.555;
//		System.out.println(age[1]);
//		System.out.println(marks[1]);

	//	for(int i=0;i<=4;i++) {
		for(int i=0;i<age.length;i++) {
			System.out.println(age[i]);
		}
  }
}
