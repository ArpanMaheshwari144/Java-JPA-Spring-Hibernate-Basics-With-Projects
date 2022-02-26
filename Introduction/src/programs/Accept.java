package programs;

import java.util.Scanner;

public class Accept {

	public static void main(String[] args) {
		
			Scanner in=new Scanner(System.in);
			System.out.println("Enter employee id:");
			int id=in.nextInt();
			System.out.println("Enter employee name:");
			String name=in.next();
			System.out.println("Enter employee age:");
			int age=in.nextInt();
			System.out.println("Enter employee gender:");
			String gender=in.next();
			System.out.println("Enter employee salary:");
			long salary=in.nextLong();
			System.out.println("Empoyee id is: " + id);
			System.out.println("Employee name is: " + name);
			System.out.println("Employee age is: " + age);
			System.out.println("Employee gender is: " + gender);
			System.out.println("Employee salary is: " + salary);
			in.close();

	}

}
