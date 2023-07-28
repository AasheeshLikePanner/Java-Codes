package LeetCode;

import java.util.Arrays;

public class SubsetSumEqualtoK {
    public static void main(String[] args) {
        System.out.println(subsetSumToK(4,4,new int[]{6,1,2,1}));
    }
    public static boolean subsetSumToK(int n, int k, int arr[]){
        int[][] dp = new int[n][k + 1];
        for (int[] d: dp)
            Arrays.fill(d , - 1);
        return helper(arr, k, arr.length - 1, dp);
    }

    private static boolean helper(int[] arr, int k, int index, int[][] dp) {
        if(k ==0 )  return true;
        if(index ==0 )  return arr[index] == k;
        boolean take = false;
        boolean noTake;
        if(dp[index][k] != -1) {
            return dp[index][k] == 1;
        }
        if(arr[index] <= k){
            take = helper(arr, k - arr[index], index - 1, dp);
        }
        noTake = helper(arr, k, index - 1, dp);
        if(take || noTake){
            dp[index][k] = 1;
        }
        else{
            dp[index][k] = 0;
        }
        return take || noTake;
    }
}
