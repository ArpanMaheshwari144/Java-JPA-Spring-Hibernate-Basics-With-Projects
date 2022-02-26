package arrays;

import java.util.Scanner;

public class Searching {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=in.nextInt();
		int a[]= new int[n];
		System.out.println("Enter the elements in the array:");
		for(int i=0;i<a.length;i++) {
			a[i]=in.nextInt();
		}
		System.out.println("Enter the item would you want to be searched:");
		int item=in.nextInt();
		int temp=0;
		for(int i=0;i<a.length;i++)
			{
				if(a[i]==item) {
					temp++;
					System.out.println("item is present at " + i + " index position");
				}
			}
			if(temp==0) {
				System.out.println("item not present in the list");
			}
			in.close();

	}

  
}
