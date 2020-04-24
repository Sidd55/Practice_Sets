package Strings;

public class StringReversal {

	public static void main(String[] args) {
		
		
		String s = "MyCoolApp";
		
		StringBuilder rev = new StringBuilder();
		
		for(int i=s.length()-1;i>=0;i--) {
			rev.append(s.charAt(i));
		}
		
		System.out.println("Reverse String is : "+rev);

	}

}
