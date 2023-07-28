package LeetCode;

public class StockII {
    public static void main(String[] args) {

    }
    public int maxProfit(int[] prices) {
        return helper(prices, prices.length -1 , Integer.MAX_VALUE);
    }

    private int helper(int[] prices, int i, int prev) {
        if(i < 0){
            return 0;
        }
        int one = 0;
        if(i != prices.length - 1 && prices[i] < prev){
            one = helper(prices, i - 1, prices[i - 1]) + prev - prices[i];
        }
        int two = 0;
        if(i > 0){
           two = helper(prices , i - 1, prices[i]);
        }
        else{
           two =  helper(prices , i - 1, prices[i]);
        }
        return Math.max(one, two);
    }

}
