package oops.packages.models;

public class Students {
	private String name;
	public String name1;
    public Students(String name) {   // becoz students constructor is parameterised 
		this.name=name;
	}
    String getCollege() {
    	return "BBD";
    }
    public int getMarks() {
    	return 100;
    }
	public String getName() {
		return name;
	}
	private String getPassword() {//getPassword private hai isiliye usse har class access nhi kar sakti 
		return "sdjjdsdgsj";
	}
	String getAddress() {
		return "goa";	
	}
	public int getRollno() {
		return 10; 
	}
	public static void main(String args[]) {
		Students ob=new Students("tom");
		ob.getPassword();
		System.out.println(ob.getPassword());	
	}
}
