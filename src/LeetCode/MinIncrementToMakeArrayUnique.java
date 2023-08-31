package LeetCode;

import java.util.Arrays;

public class MinIncrementToMakeArrayUnique {
    public static void main(String[] args) {
        System.out.println(minIncrementForUnique(new int[]{3,2,1,2,1,7}));
    }
    public static int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 1; i < nums.length; i++){
            if(nums[i] <= nums[i - 1]){
                int rem = nums[i  - 1] - nums[i] + 1;
                count += rem;
                nums[i] = nums[i] + rem;
            }
        }
        return count;
    }
}
