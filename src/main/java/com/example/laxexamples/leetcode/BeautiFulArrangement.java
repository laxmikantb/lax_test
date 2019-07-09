/*
 * Suppose you have N integers from 1 to N. We define a beautiful arrangement as an array that is constructed by these N numbers successfully if one of the following is true for the ith position (1 <= i <= N) in this array:

The number at the ith position is divisible by i.
i is divisible by the number at the ith position.
Now given N, how many beautiful arrangements can you construct?
 */
public class BeautiFulArrangement {
	public static void main(String[] args) {
		BeautiFulArrangement b = new BeautiFulArrangement();
		System.out.println(b.countArrangement(2));
	}

	int count = 0;

	public void count(int N, int pos, int[] used) {
		if (pos > N) {
			count++;
			return;
		}
		for (int i = 1; i <= N; i++) {
			if (used[i] == 0 && (i % pos == 0 || pos % i == 0)) {
				used[i] = 1;
				count(N, pos + 1, used);
				used[i] = 0;
			}
		}
	}

	public int countArrangement(int N) {
		if (N == 0) {
			return 0;
		}
		count(N, 1, new int[N + 1]);
		return count;
	}
}
