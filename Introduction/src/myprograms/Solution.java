package myprograms;
import java.util.*;

class Person {
	public String firstName;
	 public String lastName;
	 public int idNumber;
	
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	public void printPerson(){
		 System.out.println("Name: " + firstName + " " + lastName + "\nID: " + idNumber); 
	}
}
class Student extends Person{
	private int[] testScores;
      public Student(String firstName, String lastName, int id, int[] testScores) {
          super(firstName, lastName, id);
              this.testScores=testScores;            
        }
     public char calculate() {             
            int i,sum=0;
         for(i=0; i<testScores.length; i++)
             sum+=testScores[i];
         double avg=sum/testScores.length;
            if (avg<=100 && avg>=90){
            return 'O';
        }else if(avg<90 && avg>=80){
             return 'E';
        }else if(avg<80 && avg>=70){
             return 'A';
        }else if(avg<70 && avg>=55){
             return 'P';
        }else if(avg<55 && avg>=40){
             return 'D';
        }else{
             return 'T';
        }
    }        
}

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first name:");
		String firstName = scan.next();
		System.out.print("Enter last name:");
		String lastName = scan.next();
		System.out.print("Enter id:");
		int id = scan.nextInt();
		System.out.println("Enter how many testscores you want to enter:");
		int n = scan.nextInt();
		int[] testScores = new int[n];
		System.out.println("Enter testscores:");
		for(int i = 0; i < n; i++){
			testScores[i] = scan.nextInt();
		}
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
		scan.close();
	}
}
