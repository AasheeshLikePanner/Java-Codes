package LeetCode;

import java.util.Arrays;

public class MinimumElements {
    public static void main(String[] args) {
        System.out.println(minimumElements(new int[]{1,2,3},7));
        System.out.println(minimumElements(new int[]{12,1,3},4));
        System.out.println(minimumElements(new int[]{2,1}, 11));
        System.out.println(minimumElements(new int[]{13, 10, 12, 16, 9, 11 }, 1));
    }
    public static int minimumElements(int[] num, int x) {
        int[][] dp = new int[num.length][x + 1];
        for(int[] arr : dp){
            Arrays.fill(arr, (int)1e9);
        }
        for(int i = num[0]; i <= x; i++){
            dp[0][i] = i % num[0];
        }
        for(int i = 1; i < num.length; i++){
            for(int j = 1; j <= x; j++){
                int one = (int) 1e9;
                int two = dp[i - 1][j];
                if(num[i] <= j){
                    one = dp[i][j - num[i]] + 1;
                }
                dp[i][j] = Math.min(one, two);
            }
        }
        return dp[num.length - 1][x];
    }

//    public static int minimumElements(int[] num, int x) {
//        Arrays.sort(num);
//        int[][] dp = new int[num.length][x + 1];
//        for(int[] arr : dp){
//            Arrays.fill(arr, -1);
//        }
//        int res = helper(num, num.length - 1, x, dp);
//        if(res == (int) 1e9){
//            return -1;
//        }
//        return res;
//    }
//
//    private static int helper(int[] num, int i, int x, int[][] dp) {
//        if(x == 0) return 0;
//        if(i == 0)  return ( x%num[i] == 0)?x/num[i]:(int) 1e9;
//        if(x < 0)   return Integer.MAX_VALUE;
//        if(dp[i][x] != -1)  return dp[i][x];
//        int one = (int) 1e9;
//        int two = helper(num, i - 1, x, dp);
//        if(num[i] <= x){
//            one = helper(num, i, x - num[i], dp) + 1;
//        }
//        return dp[i][x] = Math.min(one, two);
//    }
}
