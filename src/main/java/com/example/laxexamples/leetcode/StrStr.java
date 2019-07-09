
public class StrStr {

	public static String strStr(String haystack, String needle) {
		int needlelen = needle.length();
		int i=0;
		int haystacklen = haystack.length();
		if (needlelen == haystacklen && needlelen ==0)
		{
			return "";
		}
		if (needlelen ==0) return haystack;
		for (i =0; i < haystacklen; i++) {
			if (haystacklen -i +1 < needlelen) return null;
			int k = i;
			int j=0;
			while( j < needlelen && k < haystacklen && needle.charAt(j) == haystack.charAt(k)) {
				j++;
				k++;
				if (j== needlelen) return haystack.substring(i);
			}
		}
		return null;
	}
	public static void main(String[] args) {
		System.out.println(strStr("abcd aa", "aka"));

	}

}
