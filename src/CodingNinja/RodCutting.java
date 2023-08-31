package CodingNinja;

import java.util.Arrays;

public class RodCutting {
    public static void main(String[] args) {
        System.out.println(cutRod(new int[]{2,5,7,8,10}, 5));
    }
    public static int cutRod(int price[], int n) {
        int[][] dp = new int[price.length][n + 1];
//        for (int[] d: dp){
//            Arrays.fill(d, - 1);
//        }
//        return helper(price, n , price.length - 1, dp);

        for(int i = 1; i <= n ;i++){
            dp[0][i] = i * price[0];
        }


        for(int i = 1; i < price.length; i++){
            for(int j = 0; j <= n; j++){
                int one = dp[i - 1][j];
                int two = 0;
                if(j >= i + 1){
                    two = dp[i][ j - (i + 1)] + price[i];
                }
                dp[i][j] = Math.max(one, two);
            }
        }
        return dp[price.length - 1][n];
    }

    private static int helper(int[] price, int n, int i, int[][] dp) {
        if(i == 0){
            return (n == 0)?0:n * price[i];
        }
        if(dp[i][n] != - 1){
            return dp[i][n];
        }
        int one = helper(price, n, i - 1, dp);
        int two = 0;
        if(n >= i + 1){
            two = helper(price, n - (i + 1), i, dp) + price[i];
        }
        return dp[i][n] = Math.max(one, two);
    }
}
