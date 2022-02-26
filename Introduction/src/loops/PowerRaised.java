package loops;

import java.util.Scanner;

public class PowerRaised {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
	//	System.out.println("enter the base:");  
	//	int a=in.nextInt();
	//	System.out.println("enter power:");
	//	int b=in.nextInt();
		
		int a=in.nextInt();
		int b=in.nextInt();
		int result=1;
		for(int i=0;i<b;i++) {
		//	result=result*a;
			result*=a;
		}
		
		System.out.println("Result is:"+result);
		in.close();

	}

}
