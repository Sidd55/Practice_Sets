package Strings;

import java.util.Arrays;

public class Anagram {
	
	static void checkAnagrams(String s1, String s2) {
		
		char c1[] = s1.toCharArray();
		
		char c2[] = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		Boolean b = new String(c1).equals(new String(c2));
		
		if(b) {
			System.out.println("Strings are Anagrams");
		}
		else {
			System.out.println("Strings are not Anagrams");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "vowels";
		
		String s2 = "owlesv";
		
		checkAnagrams(s1, s2);

	}

}
