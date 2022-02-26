package strings;

public class StringFunctions {

	public static void main(String[] args) {
		
		String name="Arpan";
		System.out.println(name.charAt(0));
		
		System.out.println("----------------------------");
		
		String name0="Arpan Maheshwari";
		System.out.println(name.length());
		System.out.println(name0.length());
		
		System.out.println("-----------------------------");
		
		String name1="Arpan Maheshwari";
		System.out.println(name1.substring(6));
		
		System.out.println("------------------------------");
		
		String name2="Arpan Maheshwari";
		System.out.println(name2.substring(0,16));//(2 se start hoga or 16-1th position tak return karega) 
		System.out.println(name2.substring(2,8));//(2 se start hua or 8-1th position tak return ho raha hai)
		System.out.println(name2.substring(2,6));//(2 se start hua or 6-1th position tak return kaega)
		
		System.out.println("-----------------------------------------------------------------------");
		
		String name3="Arpan Maheshwari";
		System.out.println(name3.contains("Arpan"));
		
		System.out.println("-------------------------------------------------------");
		
		String name4="Arpan";
		String name5=new String("Arpan");
		System.out.println(name4 == name5);//bcoz name4 hai pool area mei or name5 hai heap area mei 
		System.out.println(name4.equals(name5));
		
		System.out.println("-------------------------------------------------------");
		
		String name6="a";
		String name7="";
		System.out.println(name6.isEmpty());
		System.out.println(name7.isEmpty());
		
		System.out.println("------------------------------------------------------");
		
		String name8="Arpan ";
		name8=name8+"Maheshwari";//java operator + is overload by string
		System.out.println(name8);
		
		System.out.println("-------------------------------------------------");
		
		String name9="Arpan ";
		System.out.println(name9.concat("Maheshwari"));
		
		System.out.println("----------------------------------------------");
		
		String name10="arpan";
		System.out.println(name10.replace('a','c'));
		System.out.println(name10.replace('p','B'));
		
		System.out.println("-------------------------------------------------");
		
		String name11 = "Arpan,Kamran,Aditya,Adarsh,Shashak,Bhai";
		String[] allNames=name11.split("a");
		
		for(String name12:allNames) {
			System.out.println(name12);
		}
		
		System.out.println("---------------------------------------");
		
		String name13="Arpan Maheshwari";
		System.out.println(name13.indexOf('a'));
		System.out.println(name13.indexOf('z'));//agar String mei wo letter nhi hai to wo -1 return kar dega
		
		System.out.println("------------------------------------------------------------");
		
		String name14="ARPAN";
		System.out.println(name14.toLowerCase());
		String name15="arpan";
		System.out.println(name15.toUpperCase());
		
		System.out.println("---------------------------------------------------------------");
		
		String name16="     Arpan      ";
		System.out.println(name16);
		System.out.println(name16.trim());//trim function string mei aage se or piche se space hta dega
		
		

	}

}
