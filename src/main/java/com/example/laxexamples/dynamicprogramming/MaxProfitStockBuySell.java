package com.example.laxexamples.dynamicprogramming;
import java.util.ArrayList;

public class MaxProfitStockBuySell {
	static class Interval {
		int buy;
		int sell;
	}
	
	void stockBuySell(int price[])
	{
		int n = price.length;
		if (n <=0)
			return;
		int count = 0;
		ArrayList<Interval> sol = new ArrayList<Interval>();
		int i=0;
		while (i < n-1) {
			// find min
			while((i < n-1)  && (price[i+1] <= price[i])) {
				i++;
			}
			if (i == n-1) break; // no solution
			Interval e = new Interval();
			e.buy = i++;
			
			// find max
			while ((i < n) && price[i] >= price[i-1]) 
				i++;
			
			e.sell=i-1;
			sol.add(e);
			count++;
				
		}
		if (count ==0) {
			    System.out.println("There is no day when buying the stock will make profit");
		}
			else
				for (int j=0; j< count; j++)
				{
					System.out.println("Buy on day " + sol.get(j).buy + " Sell on day " + sol.get(j).sell);
				}
			
	}
	
	public static void main(String[] args) {
        MaxProfitStockBuySell stock = new MaxProfitStockBuySell();
        
        // stock prices on consecutive days
        int price[] = {100, 180, 260, 310, 40, 535, 695};
        stock.stockBuySell(price);
    }

}
