package Set2_CodingQues;

final class CustomString implements java.io.Serializable,Comparable<String>,CharSequence{
	
	final String s;
	
	public CustomString(String c){
		
		this.s = c;
	}
	
	// charAt function
	public char charAt(int i) {
		
		char c = s.charAt(i) ;
		return c;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((s == null) ? 0 : s.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomString other = (CustomString) obj;
		if (s == null) {
			if (other.s != null)
				return false;
		} else if (!s.equals(other.s))
			return false;
		return true;
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return s.length();
	}

	@Override
	public CharSequence subSequence(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int compareTo(String arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
}

public class CustomStringTest {
	
	public static void main(String[] args) {
	
	
	CustomString s1 = new CustomString("sdbfnk");
	
	CustomString s2 = new CustomString("sdbfnk");
	
	System.out.println(s1==s2);
	
	System.out.println(s1.equals(s2));
	
	System.out.println(s1.length());
	
		
	}

}
