package strings;

public class Anagrams3 {

	public static void main(String[] args) {
		
		String a="aab";
		String b="aba";
		boolean isAnagram=true;
		int x=0;
		if(a.length()!=b.length()) {
			isAnagram=false;
		}
		else {
			for(int i=0;i<a.length();i++) {
				x=x^(int) a.charAt(i);
				x=x^(int) b.charAt(i);
				System.out.print(x+" ");
				
			}
		}
		isAnagram =x ==0;
		if(isAnagram) {
			System.out.println("anagram");
		}
			else {
				System.out.println("not anagram");
			}
	}

}
