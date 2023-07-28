package LeetCode;

public class LargestElement {
    public static void main(String[] args) {
        System.out.println(maxArrayValue(new int[]{2,3,7,3,5}));
        System.out.println(maxArrayValue(new int[]{5,3,3}));
    }
    public static long maxArrayValue(int[] nums) {
        long res = nums[nums.length - 1];
        long max = Integer.MIN_VALUE;
        for(int  i = nums.length - 2; i >=0 ;i--){
            if(res >= nums[i]){
                res += nums[i];
            }
            if(res < nums[i]){
                max = Math.max(res, max);
                res = nums[i];
            }
        }
        return res;
    }
}
