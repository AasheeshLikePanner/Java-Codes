package LeetCode;

import java.util.Arrays;

public class Knapsack {
    public static void main(String[] args) {
        System.out.println(knapsack(new int[]{1,2,4,5}, new int[]{5,4,8,6}, 4,5));
    }

    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {
        int[] prev = new int[maxWeight + 1];
        int[] cur = new int[maxWeight + 1];

        for(int w = weight[0]; w <= maxWeight; w++){
            prev[w] = value[0];
        }
        for(int i = 1; i < n; i++){
            for(int j = 1;j <= maxWeight ; j++){
                int one = prev[j];
                int two = 0;
                if(j >= weight[i]){
                    two = value[i] + prev[j - weight[i]];
                }
                cur[j] = Math.max(one, two);
            }
            prev = cur;
        }
        return prev[maxWeight];
    }

    //    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {
//        int[][] dp = new int[n][maxWeight + 1];
//        for(int[] d : dp){
//            Arrays.fill(d, -1);
//        }
//        return helper(weight, value, n - 1,maxWeight , dp);
//    }
//
//    private static int helper(int[] weight, int[] value, int i, int maxWeight, int[][] dp) {
//        if(i == 0){
//            if(maxWeight >= weight[i]){
//                return value[i];
//            }
//            return 0;
//        }
//        if(dp[i][maxWeight] !=  -1){
//            return dp[i][maxWeight];
//        }
//        int one = helper(weight, value, i - 1, maxWeight, dp);
//        int two = 0;
//        if(maxWeight >= weight[i]){
//            two = value[i] + helper(weight, value, i - 1, maxWeight - weight[i], dp);
//        }
//        return dp[i][maxWeight] = Math.max(one, two);
//    }
}
