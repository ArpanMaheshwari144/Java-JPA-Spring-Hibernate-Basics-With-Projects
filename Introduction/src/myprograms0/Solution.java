package myprograms0;
import java.util.*;
public class Solution {
	public static ArrayList<String> findMatchedWords(ArrayList<String> dict, String pattern){
	    pattern = makePattern(pattern);
		ArrayList<String> list = new ArrayList<>();
		for(int i=0;i<dict.size();i++){
			if(pattern.equals(makePattern(dict.get(i)))) list.add(dict.get(i));
		}
		return list;
	}
	public static String makePattern(String pattern){ 
		String res="";
		int c=1;char ch=pattern.charAt(0);
		for(int i=1;i<pattern.length();i++){
		    if(ch!=pattern.charAt(i)){
			   res+=String.valueOf(c);
			   c=1;
			   ch=pattern.charAt(i);
			 } else c++;
		 }
		res+=String.valueOf(c);return res;
	}

}
