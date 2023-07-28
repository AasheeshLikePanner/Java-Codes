package CodingNinja;

import java.util.Arrays;

public class MaximumPathSuminthematrix {
    public static void main(String[] args) {
        System.out.println(getMaxPathSum(new int[][]{{1,2,10,4},{100,3,2,1},{1,1,20,2},{1,2,2,1}}));
    }
    public static int getMaxPathSum(int[][] matrix) {
        int max = 0;
        int[][] dp = new int[matrix.length][matrix[0].length];
        for(int[] arr: dp){
            Arrays.fill(arr, 10001);
        }
        for(int i = 0; i < matrix[0].length; i++){
            int[][] newDP = dp;
            max = Math.max(max , recur(matrix , matrix.length - 1, i, newDP));
        }
        return max;
    }

    private static int recur(int[][] matrix, int row, int col, int[][] dp) {
        if(col == matrix[0].length || col < 0 || row < 0)   return 0;
        if(row == 0)    return matrix[0][col];
        if(dp[row][col] != 10001)   return matrix[row][col];
        int one = recur(matrix, row - 1, col, dp) + matrix[row][col];
        int two = recur(matrix, row - 1, col - 1, dp) + matrix[row][col];
        int three = recur(matrix, row - 1, col + 1, dp) + matrix[row][col];
        return dp[row][col] = Math.max(one, Math.max(three, two));
    }
}
