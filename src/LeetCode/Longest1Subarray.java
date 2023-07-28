package LeetCode;

public class Longest1Subarray {
    public static void main(String[] args) {
//        System.out.println(longestSubarray(new int[]{1,1,0,1}));
        System.out.println(longestSubarray(new int[]{0,1,1,1,0,1,1,0,1}));
    }
    public static int longestSubarray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        int prev = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                count++;
            }
            if(count == 2){
                max = Math.max(max, i - prev - 1);
                prev = i;
            }
            max = Math.max(max, i - prev);
        }
        return max;
    }
}
