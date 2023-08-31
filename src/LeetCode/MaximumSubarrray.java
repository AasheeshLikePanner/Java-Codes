package LeetCode;

public class MaximumSubarrray {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
    public static int maxSubArray(int[] nums) {
        return helper(nums, 0 ,nums.length - 1);
    }

    private static int helper(int[] nums, int sum,int i) {
        if(i < 0){
            return sum;
        }
        int two = helper(nums, 0, i - 1);
        int one = helper(nums, sum + nums[i] ,i - 1);
        return Math.max(one,two);
    }
}
