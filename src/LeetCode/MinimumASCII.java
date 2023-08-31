package LeetCode;

import java.util.Arrays;

public class MinimumASCII {
    public static void main(String[] args) {
        String s1 = "delete", s2 = "leet";
        System.out.println(minimumDeleteSum(s1, s2));
    }
    public static int minimumDeleteSum(String s1, String s2) {
        StringBuilder one = new StringBuilder(s1);
        StringBuilder two = new StringBuilder(s2);
        long[][] dp = new long[s1.length() + 1][s2.length() + 1];
        for(long[] arr : dp){
            Arrays.fill(arr,  -1);
        }
        return  (int) helper(one,two, s1.length() - 1, s2.length() - 1 , dp);
    }

    private static long helper(StringBuilder one, StringBuilder two, int i1, int i2, long[][] dp) {
        if(i1 < 0 || i2 < 0){
            if(one.toString().contentEquals(two)){
                return 0;
            }
            return Integer.MAX_VALUE;
        }
        if(dp[i1][i2] != - 1){
            return dp[i1][i2];
        }
        long notake1 = helper(one, two, i1 - 1, i2, dp);
        long notake2 = helper(one, two, i1 , i2 - 1, dp);

        StringBuilder cp = new StringBuilder(one);
        cp.deleteCharAt(i1);
        long take1 = helper(cp, two, i1 - 1, i2, dp) + one.charAt(i1);
        cp = new StringBuilder(two);
        cp.deleteCharAt(i2);
        long take2 = helper(one , cp, i1, i2 - 1, dp) + two.charAt(i2);
        return dp[i1][i2] = Math.min(take1, Math.min(take2, Math.min(notake1, notake2)));
    }
}
