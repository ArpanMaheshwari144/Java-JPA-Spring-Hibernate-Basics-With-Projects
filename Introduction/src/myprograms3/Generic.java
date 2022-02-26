package myprograms3;
import java.util.*;

public class Generic {

static class Printer <T> {
   public static <E> void printArray(E[] a){
       for(E e:a){
           System.out.println(e);
       }
   }
}
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter how many number you want to enter in an array: ");
        int n = in.nextInt();
        Integer[] intArray = new Integer[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            intArray[i] = in.nextInt();
        }
        System.out.print("Enter how many words you want to enter in an array of string: ");
        n = in.nextInt();
        String[] stringArray = new String[n];
        System.out.print("Enter string one by one: ");
        for (int i = 0; i < n; i++) {
            stringArray[i] = in.next();
        }
        Printer.printArray(intArray);
        Printer.printArray(stringArray);
        in.close();
    } 
}
