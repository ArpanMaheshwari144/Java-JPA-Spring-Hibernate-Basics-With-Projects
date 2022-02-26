package loops;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		
//		
//		for(int i=1;i<=100;i++) {
//			if(i==35) {
//				break;
//			}
//			System.out.println(i);
//			
//		}
          Scanner in=new Scanner(System.in);
          System.out.println("enter the value of n:");
		   for(;;) {//for infinity loop
                int a=in.nextInt();
			       if(a<0) {
				      break;
			         }
		          }
		          in.close();
	}

}
