package LeetCode;

public class WaysToSplitArrayIntoGoodSubArrays {
    public static void main(String[] args) {
        System.out.println(numberOfGoodSubarraySplits(new int[]{0,1,0,0,1}));
    }
    public static int numberOfGoodSubarraySplits(int[] nums) {
        long mod = 1000000007;
        int ans  = 1;
        int i = 0;
        int count = 0;
        while(i < nums.length && nums[i] == 0) ++i;
        if(i >= nums.length)    return 0;
        while(++i < nums.length){
            if(nums[i] == 1){
                ans = (int) ((ans * ( count + 1))%mod);
                count = 0;
            }
            else{
                count++;
            }
        }
        return ans;
    }
}
