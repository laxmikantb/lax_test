import java.util.Arrays;

public class IsStrPermuted {

	public static String sort(String s) {
		char[] contents = s.toCharArray();
		Arrays.sort(contents);
		return new String(contents);
		
	}
	
	public static boolean isPermuted(String s, String s2) {
		if (s.length() != s2.length())
			return false;
		return sort(s).equals(sort(s2));
	}
	public static void main(String[] args) {
		String str  = "This ismy String from Book jlsjhsdjkhsjk";
		String str2 = "jlsjhom Book Thisdjkhsjkfrs ismy String ";
		
		System.out.println(isPermuted(str, str2));

	}

}
