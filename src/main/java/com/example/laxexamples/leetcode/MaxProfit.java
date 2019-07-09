
public class MaxProfit {
	public static void main(String args[]) {
		// int price[] = { 2, 30, 15, 10, 8, 25, 80 };
		// int[] price = { 7, 1, 5, 3, 6, 4 };
		int[] price = { 7, 6, 5, 4 };
		int n = price.length;
		System.out.println("Maximum Profit = " + maxProfitTwoBuy(price, n));
	}

	static int maxProfitTwoBuy(int[] price, int n) // transaction of buy and
													// sell twice
	{
		int profit[] = new int[n];
		int i;
		for (i = 0; i < n; i++) {
			profit[i] = 0;
		}
		// get profit for one transaction
		int max_price = price[n - 1];
		for (i = n - 2; i >= 0; i--) {
			if (price[i] > max_price) {
				max_price = price[i];
			}
			// get profit by prev max profit[i+1] and profit by buying at
			// price[i] and selling at max_price
			profit[i] = Math.max(profit[i + 1], max_price - price[i]);
		}
		// return profit[0];
		//
		int min_price = price[0];
		for (i = 1; i < n; i++) {
			if (price[i] < min_price) {
				min_price = price[i];
			}

			profit[i] = Math.max(profit[i - 1], profit[i] + price[i] - min_price);

		}
		int result = profit[n - 1];
		return result;
	}

}
