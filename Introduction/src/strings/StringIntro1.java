package strings;

public class StringIntro1 {

	public static void main(String[] args) {
		
		
		String name1="Arpan";
		String name2="Arpan";
		String name3=new String("Arpan");
		System.out.println(name1==name2);
		System.out.println(name2==name3);
        System.out.println("------------------------------------------");	
        //Strings are immutable
		String name="Anuj";
		name="kumar";
		System.out.println(name);

	}

}
