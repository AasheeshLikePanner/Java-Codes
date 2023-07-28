package LeetCode;

import java.util.Arrays;

public class Knapsack {
    public static void main(String[] args) {

    }
    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {
        int[][] dp = new int[n][maxWeight + 1];
        for(int[] d : dp){
            Arrays.fill(d, -1);
        }
        return helper(weight, value, n - 1,maxWeight , dp);
    }

    private static int helper(int[] weight, int[] value, int i, int maxWeight, int[][] dp) {
        if(i == 0){
            if(maxWeight >= weight[i]){
                return value[i];
            }
            return 0;
        }
        if(dp[i][maxWeight] !=  -1){
            return dp[i][maxWeight];
        }
        int one = helper(weight, value, i - 1, maxWeight, dp);
        int two = 0;
        if(maxWeight >= weight[i]){
            two = value[i] + helper(weight, value, i - 1, maxWeight - weight[i], dp);
        }
        return dp[i][maxWeight] = Math.max(one, two);
    }
}
