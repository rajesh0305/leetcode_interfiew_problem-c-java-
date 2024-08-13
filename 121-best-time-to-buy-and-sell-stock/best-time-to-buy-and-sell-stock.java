class Solution {
    public int maxProfit(int[] prices) {
        //int loss = Integer.MAX_VALUE;
      /*  int loss = prices[0];
        int profit = 0;
        for(int i = 1;i<prices.length;i++)
        {
            if(prices[i]<loss)
            {
                loss = prices[i];
            }
             if (prices[i] - loss > profit){
                profit = prices[i] - loss;
            }
        }
        return profit;*/
        int profit = 0;
        int mini = prices[0];
          for(int i = 1;i<prices.length;i++){
                int cost = prices[i]-mini;
                   profit = Math.max(profit,cost);
                   mini = Math.min(mini,prices[i]);
          }
          return profit;
    }
}