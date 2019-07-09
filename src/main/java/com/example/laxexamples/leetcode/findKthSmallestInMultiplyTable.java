
public class findKthSmallestInMultiplyTable {

	public static int counter(int v, int m, int n) {
		int count = 0;

		for (int i = 1; i <= m; i++) {
			int temp = Math.min(v / i, n);
			count += temp;
		}
		return count;
	}

	public static int findKthSmallest(int m, int n, int k) {
		int low = 1, high = m * n + 1;

		while (low < high) {
			int mid = low + (high - low) / 2;
			int c = counter(mid, m, n);
			if (c >= k) {
				high = mid;
			} else {
				low = mid + 1;
			}
		}

		return high;

	}

	public static void main(String[] args) {
		System.out.println(findKthSmallest(3, 3, 8));
	}
}
