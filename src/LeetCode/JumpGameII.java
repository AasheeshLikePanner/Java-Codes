package LeetCode;

import java.util.Arrays;

public class JumpGameII {
    public static void main(String[] args) {
        System.out.println(jump(new int[]{2,3,0,1,4}));
    }
    public static int jump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return helper(nums, 0, dp);
    }

    private static int helper(int[] nums, int i, int[] dp) {
        if(i == nums.length - 1){
            return 0;
        }
        if(dp[i] != -1) return dp[i];
        int one = (int)1e9;
        for(int j = 1; j+ i < nums.length && j <= nums[i]; j++ ){
            one = Math.min(one, helper(nums, i + j, dp) +1);
        }
        return dp[i] = one;
    }
}
