package LeetCode;

import java.util.Arrays;

public class TargetSum {
    public static void main(String[] args) {
        System.out.println(findTargetSumWays(new int[]{1,1,1,1,1},3));
    }
    public static int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for(int n : nums){
            sum += n;
        }
        int[][] dp = new int[nums.length][(sum * 2) + 1];
        for(int[] arr : dp){
            Arrays.fill(arr, - 1);
        }
        return helper(nums, target, nums.length - 1, 0, dp );
    }

    private static int helper(int[] nums, int target, int i, int sum, int[][] dp) {
        if(i < 0){
            return (target == sum)?1:0;
        }
        if(sum < 0 && dp[i][Math.abs(sum)] != -1){
            return dp[i][Math.abs(sum)];
        }
        else if(sum >= 0 && dp[i][sum * 2] != -1){
            return dp[i][sum * 2];
        }
        int one = helper(nums, target, i - 1,sum + nums[i], dp);
        int two = helper(nums, target, i - 1, sum - nums[i], dp);
        if(sum < 0){
            dp[i][Math.abs(sum)] = one  + two;
        }
        else{
            dp[i][sum * 2] = one + two;
        }
        return one + two;
    }
}
