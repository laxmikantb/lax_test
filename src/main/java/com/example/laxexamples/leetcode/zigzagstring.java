
public class zigzagstring {

	public static String convert(String s, int nrows) {
		char[] c = s.toCharArray();
		int len = c.length;
		StringBuffer[] sb = new StringBuffer[nrows];
		int i = 0;
		for (i = 0; i < nrows; i++) {
			sb[i] = new StringBuffer();
		}
		i = 0;
		boolean down = true;
		int row = 0;
		while (i < len) {
			sb[row].append(c[i++]);
			if (row == nrows - 1) {
				down = false;
			}
			if (row == 0) {
				down = true;
			}
			if (down) {
				row++;
			} else {
				row--;
			}
		}

		for (i = 1; i < sb.length; i++) {
			sb[0].append(sb[i]);
		}
		return sb[0].toString();

	}

	public static void main(String[] args) {
		System.out.println(convert("GEEKSFORGEEKS", 3));
		System.out.println(convert("ABCDEFGH", 2));
		System.out.println(convert("PAYPALISHIRING", 3));

	}

}
