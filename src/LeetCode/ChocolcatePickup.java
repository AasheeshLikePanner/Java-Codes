package LeetCode;

import java.util.Arrays;

public class ChocolcatePickup {
    public static void main(String[] args) {

    }
    public static int maximumChocolates(int r, int c, int[][] grid) {
        int[][][] dp = new int[r][c][c];
        for(int[][] two: dp){
            for(int[] one : two){
                Arrays.fill(one, -1);
            }
        }
        return helper(grid, 0 ,0, c - 1, dp);
    }

    private static int helper(int[][] grid, int i, int j1, int j2 , int[][][] dp) {
        if(j1 < 0 || j2 <0 || j1 >= grid[0].length || j2 >= grid[0].length){
            return 0;
        }
        if(i == grid.length - 1){
            if(j1 == j2){
                return grid[i][j1];
            }
            else{
                return grid[i][j1] + grid[i][j2];
            }
        }
        if(dp[i][j1][j2] != -1){
            return dp[i][j1][j2];
        }
        int max = Integer.MIN_VALUE;
        for(int k = -1; k <= 1; k++){
            for(int l = - 1; l <=1 ; l++){
                int val = 0;
                if(j1 == j2){
                    val += grid[i][j1];
                }
                else{
                    val += grid[i][j1] + grid[i][j2];
                }
                val +=helper(grid, i + 1, j1 - l, j2 -k, dp);
                max = Math.max(val, max);
            }
        }
        return dp[i][j1][j2] = max;
    }
}
