package Strings;

public class UniqueCharacter {

	public static void main(String[] args) {
		
		String s = "GeeksForGeeks";
		
		int count;
		char unique='\0';
		
		for(int i=0;i < s.length();i++) {
			count = 0;
			char c = s.charAt(i);
			
			for(int j = i+1;j < s.length();j++) {
				
				if(c == s.charAt(j)) {
					count++;
					break;
				}
			}
			
			if(count ==0) {
				unique = s.charAt(i);
				break;
			}
		}
		
		System.out.println("Unique Character is "+ unique);

	}

}
