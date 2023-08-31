package LeetCode;

import java.util.Arrays;

public class WaystoMakeCoinChange {
    public static void main(String[] args) {
        System.out.println(countWaysToMakeChange(new int[]{1,2,3,4,5,6},300));
    }
    public static long countWaysToMakeChange(int denominations[], int value){
        long[][] dp = new long[denominations.length][value  +1];
        for (long[] a:dp) {
            Arrays.fill(a, - 1);
        }
        return helper(denominations, value, denominations.length - 1, dp);
    }

    private static long helper(int[] nums, int value, int i, long[][] dp) {
        if(value == 0){
            return 1;
        }
        if(i == 0){
            return (value%nums[i] == 0)?1:0;
        }
        if(dp[i][value] != -1){
            return dp[i][value];
        }
        long one = helper(nums, value, i - 1, dp);
        long two = 0;
        if(nums[i] <= value){
            two = helper(nums, value - nums[i], i, dp);
        }
        return dp[i][value] = one + two;
    }
}
