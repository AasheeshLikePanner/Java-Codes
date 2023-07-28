package LeetCode;

import java.util.Arrays;

public class PartitionEqualSubsetSum {
    public static void main(String[] args) {
        System.out.println(canPartition(new int[]{1,5,11,5}));
        System.out.println(canPartition(new int[]{1,2,3,5}));
    }

//    public static boolean canPartition(int[] nums) {
//        for(int n:nums){
//           add+=n;
//        }
//        int[][] dp = new int[nums.length][add];
//        for (int[] num :dp) {
//            Arrays.fill(num, -1);
//        }
//        return helper(nums, nums.length - 1, 0, dp);
//    }
//    static int add = 0;
//    private static boolean helper(int[] nums, int i, int sum, int[][] dp) {
//        if(i < 0 ){
//            return sum == add - sum;
//        }
//        if(dp[i][sum] != -1){
//            if(dp[i][sum] == 1){
//                return true;
//            }
//            else{
//                return false;
//            }
//        }
//        boolean one = helper(nums, i - 1, sum, dp);
//        boolean two = helper(nums, i - 1, sum + nums[i], dp);
//        if(one || two){
//            dp[i][sum] = 1;
//        }
//        else {
//            dp[i][sum] = 0;
//        }
//        return one || two;
//    }
    public static boolean canPartition(int[] nums) {
        int n = nums.length;
        int add = 0;
        for(int num:nums){
           add+=num;
        }
        if (add %2==1) return false;
        add /= 2;
        boolean[][]  dp = new boolean[n][add + 1];
        for(int i=0; i<n; i++){
            dp[i][0] = true;
        }
        if(nums[0]<=add)
            dp[0][nums[0]] = true;
        for(int i = 1 ; i < n; i++){
            for(int j = 1; j <= add; j++){
                boolean one = dp[i - 1][j];
                boolean two = false;
                if(nums[i] <= j) {
                     two = dp[i - 1][j - nums[i]];
                }
                dp[i][j] = one ||  two;
            }
        }
        return dp[n - 1][add];
    }
}
