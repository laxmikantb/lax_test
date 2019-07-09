
public class convertPalindrome {
 
	public static void main(String[] args) {
		String tester = "banana";
		System.out.print(convertPalindrome(tester));
	}
 
	public static String convertPalindrome(String str) {
		if (str == null)
			return str;
		int n = str.length();
		if ((n == 0) || (n == 1))
			return str;
 
		StringBuilder strBuilder = new StringBuilder(str);
		int i = 0;
		int j = n - 1;
		int appendIndex = 0;
		while (i < j) {
			if (str.charAt(i) == str.charAt(j)) {
				i++;
				j--;
			} else {
				appendIndex=j+1;
				strBuilder.insert(appendIndex, str.charAt(i));	
				i++;
			}
		}
		return strBuilder.toString();
	}
}
