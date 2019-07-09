
public class IsPalindrome {
	public static boolean isPalindrome(int n) {
		// if x < 0 then it is not palindrome
		// if last dight is 0 then it is not palindrome
		// o logn - divide by 10
		// o(1) space

		if (n < 0 && n % 10 == 0 && n != 0) {
			return false;
		}

		int reverseNumber = 0;
		while (n > reverseNumber) { // 1221 only half
			reverseNumber = reverseNumber * 10 + n % 10;
			n /= 10;
		}

		return n == reverseNumber || n == reverseNumber / 10; // odd number of
																// digits
	}

	public static void main(String[] args) {
		isPalindrome(2112);
	}
}
