package Coaching.June25;

public class StockProfit {
        public static int maxProfit(int[] prices) {
        int min = prices[0];
        int ans = 0;
        for(int i =1 ; i<prices.length ; i++){
            min =Math.min(min, prices[i-1]);
            if(ans < prices[i]-min ){
                ans = prices[i]-min ;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

}
