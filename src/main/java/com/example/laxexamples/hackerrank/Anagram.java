import java.util.Scanner;

public class Anagram {

	public static int numberNeeded(String first, String second) {
		int[] charCount = new int[26];
		int indx = 0;
		for (int i=0; i < 26; i++) {
			charCount[i] = 0;
		}
		int count = 0;
		for (char c : first.toCharArray()) {
			charCount[c - 'a']++;
		}
		
		for (char c : second.toCharArray()) {
			charCount[c - 'a']--;
		}
		count =0;
		for (int i: charCount) {
			count+= Math.abs(i);
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(numberNeeded(a, b));


	}

}
