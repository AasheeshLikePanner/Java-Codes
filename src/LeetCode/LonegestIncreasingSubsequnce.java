package LeetCode;

import java.util.Arrays;

// Paytm technical round

// Longest Increasing Subsequence Question 1

public class LonegestIncreasingSubsequnce {
    public static void main(String[] args) {
        System.out.println(Lis(new int[]{10,22,9,33,21,50,41,60,80}));
        System.out.println(Lis(new int[]{6,4,37,88,67,978,657}));
    }
    public static int Lis(int[] arr){
        int max = 0;
        for(int n : arr){
            max = Math.max(n, max);
        }
        int[][] dp =new int[arr.length][max + 2];
        for(int[] d : dp){
            Arrays.fill(d, - 1);
        }
        return helper(arr,arr.length - 1, max + 1, dp);
    }

    private static int helper(int[] arr, int i, int prev, int[][] dp) {
        if(i < 0){
            return 0;
        }
        if(dp[i][prev] != - 1){
            return dp[i][prev];
        }
        int one = helper(arr, i - 1, arr[i], dp);
        int two  =0;
        if(prev > arr[i]){
            two = helper(arr, i - 1, arr[i], dp) + 1;
        }
        return dp[i][prev] = Math.max(one, two);
    }
}
