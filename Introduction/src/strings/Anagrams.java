package strings;

public class Anagrams {

	public static void main(String[] args) {
		
		String a="bbac";
		String b="abbc";
		boolean isAnagram=false;
		boolean visited[]=new boolean[b.length()];
		if(a.length()==b.length()) {
			for(int i=0;i<a.length();i++) {
				isAnagram=false;
				for(int j=0;j<b.length();j++) {
					if(b.charAt(j)==a.charAt(i) && !visited[j]) {
						visited[j]=true;
						isAnagram=true;
						break;
					}
				}
				if(!isAnagram) {
					break;
				}
			}
		}
			if(isAnagram) {
				System.out.println("anagram");
			}
			else {
				System.out.println("not anagram");
			}
			
	}

}
