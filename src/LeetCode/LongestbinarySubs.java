package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class LongestbinarySubs {
    public static void main(String[] args) {
        System.out.println(longestSubsequence("1001010", 5));
    }
    public static int longestSubsequence(String s, int k) {
        int[][] dp = new int[s.length()][s.length()];
        for(int[] arr:dp){
            Arrays.fill(arr, -1);
        }
        return helper(s, k, 0, "" , dp);
    }

    private static int helper(String s, int k, int i, String string, int[][] dp) {
        if(i == s.length()){
            if(string.isEmpty())    return 0;
            return (Long.parseLong(string, 2) <= k)?string.length():0;
        }
        if(dp[i][string.length()] != -1){
            return dp[i][string.length()];
        }
        int one = helper(s, k , i + 1, string+ s.charAt(i), dp);
        int two = helper(s, k, i + 1, string, dp);

        return dp[i][string.length()] = Math.max(one, two);
    }
}