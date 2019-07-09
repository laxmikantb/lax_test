
public class FindMedianOfTwoSortedArray {

	public double findMedian(int[] a, int[] b) {
		int m = a.length;
		int n = b.length;

		if (m > n) {
			int[] temp = a;
			a = b;
			b = temp;
			int tmp = m;
			m = n;
			n = tmp;
		}

		int iMin = 0;
		int iMax = m;
		int halflen = m + n + 1 / 2;
		while (iMin <= iMax) {
			int i = (iMin + iMax) / 2;
			int j = halflen - i;
			if (i < iMax && b[j - 1] > a[i]) {
				iMin++; // i to small
			} else if (i > iMin && a[i - 1] > b[j]) {
				iMax--; // i too big
			} else { // i is perfect
				int maxLeft = 0;
				if (i == 0) {
					maxLeft = b[j - 1];
				} else if (j == 0) {
					maxLeft = a[i - 1];
				} else {
					maxLeft = Math.max(a[i - 1], b[j - 1]);
				}
				if ((m + n) % 2 == 1) {
					return maxLeft;
				}

				int minRight = 0;

				if (i == m) {
					minRight = b[j];
				} else if (j == n) {
					minRight = a[i];
				} else {
					minRight = Math.min(a[i - 1], b[j - 1]);
				}

				return (maxLeft + minRight) / 2.0;

			}
		}
		return 0.0;
	}

}
