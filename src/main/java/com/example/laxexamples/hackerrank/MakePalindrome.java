
public class MakePalindrome {
	public static String makePlaindrom(String s){
		if(s.length()<=1)
		return s;
		StringBuilder pl=new StringBuilder(s);
		int len=s.length();
		for (int i = len-2; i >=0; i--) {
			pl.append(s.charAt(i));
		}
		return pl.toString();
	}
	
	public static void makP2(String str) {
		if (str.length() > 1) {
			String palinStr = str.substring(1, str.length());
			System.out.println(new StringBuffer(palinStr).reverse() + str);
		} else {
			System.out.println(str);
		}
	}
	
    /*Driver function to check for above function*/
    public static void main (String[] args) {
        System.out.println("a>> "+makePlaindrom("a"));
        System.out.println("ab>> "+makePlaindrom("ab"));
        System.out.println("abc>> "+makePlaindrom("abc"));
        System.out.println("abcde>> "+makePlaindrom("abcde"));
    }
}
