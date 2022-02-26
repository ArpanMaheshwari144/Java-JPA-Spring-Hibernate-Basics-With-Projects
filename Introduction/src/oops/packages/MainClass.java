package oops.packages;
/*import oops.packages.models.Students;
import oops.packages.models.Teacher;*/
import oops.packages.models.*;

public class MainClass {

	public static void main(String[] args) {
		
		Students obj=new Students("Arpan");
//		obj.name="Jerry";// bcoz String name is private usse koi dusri class access nhi kar sakti
//		obj.getPassword();
//		obj.getAddress();
		obj.getRollno();
		obj.getMarks();
		System.out.println(obj.getMarks());
		System.out.println(obj.getRollno());
		System.out.println(obj.getName());
		Teacher obj1=new Teacher();

	}

}
