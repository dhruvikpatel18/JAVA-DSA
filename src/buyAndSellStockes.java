public class buyAndSellStockes {

    public static int buyAndSellStockes(int[] prices){
        int buyStock = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++){
            if(buyStock < prices[i]){//profit
                int profit = prices[i] - buyStock;//today's profit
                maxProfit = Math.max(profit,maxProfit);//overall profit
            }else{
                buyStock = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {3,7,3,1,9,2,0};
        System.out.println(buyAndSellStockes(prices));
    }
}
