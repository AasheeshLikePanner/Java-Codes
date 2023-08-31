package LeetCode;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{1,2,5},11));
    }
    public static int coinChange(int[] denominations, int amount) {
        int[][] dp = new int[denominations.length][amount   +1];
        for (int[] a:dp) {
            Arrays.fill(a, - 1);
        }
        int res =  helper(denominations, amount, denominations.length - 1, dp);
        if(res == (int)1e9){
            return -1;
        }
        return res;
    }

    private static int helper(int[] nums, int value, int i, int[][] dp) {
//        if(value == 0){
//            return 1;
//        }
        if(i == 0){
            return (value%nums[i] == 0)?value/nums[i]:(int)1e9;
        }
        if(dp[i][value] != -1){
            return dp[i][value];
        }
        int two = (int)1e9;
        if(nums[i] <= value){
            two = helper(nums, value - nums[i], i, dp) + 1;
        }
        int one = helper(nums, value, i - 1, dp);

        return dp[i][value] = Math.min(one, two);
    }
}
