class Solution {
    public int maxProfit(int[] prices) {
        int buy_day=prices[0];
        int max_profit=0;
        for(int i=1;i<prices.length;i++){
            if(buy_day>prices[i]){
                buy_day=Math.min(buy_day,prices[i]);
            }
            else{
                max_profit=Math.max(max_profit,prices[i]-buy_day);
            }
        }
        return max_profit;
    }
}