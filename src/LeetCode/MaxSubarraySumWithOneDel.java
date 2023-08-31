package LeetCode;

import java.util.Arrays;

public class MaxSubarraySumWithOneDel {
    public static void main(String[] args) {

    }
    public int maximumSum(int[] arr) {
        int[][] dp = new int[arr.length][2];
        for(int[] d: dp){
            Arrays.fill(d, -1 );
        }
        boolean flag = false;
        int sum = 0;
        for(int n:arr){
            if(n <= 0) flag = true;
            sum+= sum;
        }
        if(!flag) return sum;

        int max = sum;
        for(int i = arr.length - 1; i >= 1; i--){
            max = Math.max(max, helper(arr, i , dp, 1));
        }
        return max;
    }

    private int helper(int[] arr, int i, int[][] dp, int k) {
        if(i < 0){
            return 0;
        }
        if(k < 0){
            return 0;
        }
        if(dp[i][k] != - 1){
            return dp[i][k];
        }
        int one = helper(arr, i - 1, dp , k - 1);
        int two = helper(arr, i - 1, dp, k) + arr[i];
        return dp[i][k] = Math.max(one, two);
    }
}
