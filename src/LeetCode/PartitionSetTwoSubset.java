package LeetCode;

import java.util.Arrays;

public class PartitionSetTwoSubset {
    public static void main(String[] args) {
//        System.out.println(minSubsetSumDifference(new int[]{1,2,3,4}, 4));
//        System.out.println(minSubsetSumDifference(new int[]{8,6,5},3));
//        System.out.println(minSubsetSumDifference(new int[]{0, 0, 0, 0, 0}, 4));
        System.out.println(minimumDifference(new int[]{3,9,7,3}));
    }
    public static int minimumDifference(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int num: arr){
            sum += num;
        }
        int[][] dp = new int[arr.length][sum + 1];
        for(int[] array: dp){
            Arrays.fill(array,  -1);
        }
        return helper(arr, n - 1, 0, sum , dp, 0);
    }

    private static int helper(int[] arr, int i, int sum, int sum1, int[][] dp, int count) {
        if(i < 0){
            if(count == arr.length / 2){
                return Math.abs(Math.abs(sum1  - sum) - sum);
            }

            return Integer.MAX_VALUE;
        }
        if(dp[i][sum] != -1){
            return dp[i][sum];
        }
        int one = helper(arr, i - 1, sum + arr[i], sum1, dp, count + 1);
        int two = helper(arr, i - 1, sum, sum1, dp, count);
        return dp[i][sum] = Math.min(one, two);
    }
//    public static int minSubsetSumDifference(int[] arr, int n) {
//        int sum = 0;
//        for(int num: arr){
//            sum += num;
//        }
//        int[][] dp = new int[arr.length][sum + 1];
//        for(int[] array: dp){
//            Arrays.fill(array,  -1);
//        }
//        return helper(arr, n - 1, 0, sum , dp);
//    }
//
//    private static int helper(int[] arr, int i, int sum, int sum1, int[][] dp) {
//        if(i < 0){
////            if(sum1  == sum)    return Integer.MAX_VALUE;
//            return Math.abs(Math.abs(sum1  - sum) - sum);
//        }
//        if(dp[i][sum] != -1){
//            return dp[i][sum];
//        }
//        int one = helper(arr, i - 1, sum + arr[i], sum1, dp);
//        int two = helper(arr, i - 1, sum, sum1, dp);
//        return dp[i][sum] = Math.min(one, two);
//    }
}
