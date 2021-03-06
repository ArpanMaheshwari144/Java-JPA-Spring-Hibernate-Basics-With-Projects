package myprograms0;
import java.io.*;
import java.util.*;
interface PerformOperation {
 boolean check(int a);
}
class MyMath {
 public static boolean checker(PerformOperation p, int num) {
  return p.check(num);
 }
 public static PerformOperation isOdd()
{
    return num ->
    {
          if(num%2==0)
            return false;
         else
            return true;
    } ;
}
@SuppressWarnings("unused")
public static PerformOperation isPrime()
{
    return num ->
    {
        int flag = 0;
        for(int i=2;i<=num/2;i++)
      {
           if(num%i==0)
            {
              flag = 1;
              break; 
            }
           else
            {
              flag = 0;
              break; 
            }
            
      }
      if(flag == 0)
          return true;
      else 
          return false;
    }; 
}
public static PerformOperation isPalindrome()
{
    return num ->
    {
      int r,sum=0,temp; 
      temp = num;
       while(num>0)
        {
            r = num % 10;
            sum = (sum*10)+r;  
            num = num/10;  
        }
      if(temp == sum)
        return true;
      else
        return false;
    };
} 
} 

public class LambdaExpression {

	 public static void main(String[] args) throws IOException {
	  @SuppressWarnings("unused")
	  MyMath ob = new MyMath();
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  int T = Integer.parseInt(br.readLine());
	  PerformOperation op;
	  boolean ret = false;
	  String ans = null;
	  while (T--> 0) {
	   String s = br.readLine().trim();
	   StringTokenizer st = new StringTokenizer(s);
	   int ch = Integer.parseInt(st.nextToken());
	   int num = Integer.parseInt(st.nextToken());
	   if (ch == 1) {
	    op = MyMath.isOdd();
	    ret = MyMath.checker(op, num);
	    ans = (ret) ? "ODD" : "EVEN";
	   } else if (ch == 2) {
	    op = MyMath.isPrime();
	    ret = MyMath.checker(op, num);
	    ans = (ret) ? "PRIME" : "COMPOSITE";
	   } else if (ch == 3) {
	    op = MyMath.isPalindrome();
	    ret = MyMath.checker(op, num);
	    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

	   }
	   System.out.println(ans);
	  }
	 }
}
