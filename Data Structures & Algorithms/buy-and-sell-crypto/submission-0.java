class Solution {
    public int maxProfit(int[] prices) {
        int sell = 1;
        int buy =0;
        int maxProfit = 0;
        while(sell<prices.length){
            if(prices[sell]>prices[buy]){
                maxProfit = Math.max(prices[sell]-prices[buy],maxProfit);
            }
            else{
                buy = sell;
            }
            sell++;
        }
        return maxProfit;
    }
}
