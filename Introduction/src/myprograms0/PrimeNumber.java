package myprograms0;
import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
	    int t=in.nextInt();
	    while(t-->0){
	    int val = in.nextInt();

	    for(int i=2; i<=val/i; i++){
	        if(val%i==0) val=1;
	    }
	    System.out.println(val==1?"Not prime":"Prime");
	    }
	    in.close();
	}
}
