package statickeyword;

public class Student {

    String name; 
    int rollNo; 

    static String cllgName; 
  
    static int counter = 0; 
       
    public Student(String name)  
    { 
        this.name = name;          
        this.rollNo = setRollNo();
    } 
      
    static int setRollNo() 
    { 
        counter++; 
        return counter; 
    } 
   
    static void setCllg(String name){ 
        cllgName = name ; 
    } 
  
    void getStudentInfo(){ 
        System.out.println("name : " + name); 
        System.out.println("rollNo : " + rollNo);          
        System.out.println("cllgName : " + cllgName); 
    } 
    public static void main(String[] args) { 
        Student.setCllg("XYZ"); 
        Student s1 = new Student("Alice"); 
        Student s2 = new Student("Bob");  
        Student s3 = new Student("Jack");
        s1.getStudentInfo(); 
        s2.getStudentInfo(); 
        s3.getStudentInfo();
    } 
} 
