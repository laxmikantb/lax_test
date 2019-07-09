
public class MaxProductThreeNums {

	public static int maxProduct(int[] a, int n) {
		if (n < 3)
			return -1;
		int maxA = Integer.MIN_VALUE;
		int maxB = Integer.MIN_VALUE;
		int maxC = Integer.MIN_VALUE;
		// for negative numbers
		int minA = Integer.MAX_VALUE;
		int minB = Integer.MAX_VALUE;
		
		
		for (int i=0; i < n; i++) {
			if (a[i] > maxA) {
				maxC = maxB;
				maxB = maxA;
				maxA = a[i];
			}
			else
				if (a[i] > maxB) {
					maxC = maxB;
					maxB = a[i];
				}
				else if (a[i] > maxC) {
					maxC = a[i];
				}
			if (a[i] < minA) {
				minB = minA;
				minA = a[i];
			}
			else
				if (a[i] < minB)
				{
					minB=a[i];
				}
		}
		
		return Math.max(minA * minB * maxA,  maxA * maxB * maxC);
	}
}
