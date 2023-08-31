package LeetCode;

import java.util.Arrays;

public class MinMaxPairSum {
    public static void main(String[] args) {

    }
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        int max = 0;
        while(i != j){
            max = Math.max(nums[i] + nums[j],max );
            j--;
            i++;
        }
        return max;
    }
}
