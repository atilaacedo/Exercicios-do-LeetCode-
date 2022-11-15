package LeetCode121;

public class BuyAndSell {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int comp =0;
        int buy = prices[0];
        for(int i =0; i < prices.length; i++){
            if(prices[i] < buy){
                buy = prices[i];
            }

            comp = prices[i] - buy;

            if(comp > maxProfit)
                maxProfit = comp;
        }
        return maxProfit;
    }
}
