package LeetCode_Problems;

import java.util.Arrays;

public class RemoveMinMaxFromArray {
    public static void main(String[] args) {
        int[] can1 = {2,10,7,5,4,1,8,6};
        int[] can2 = {101};
        System.out.println(lake(can2));
    }
    public static int lake(int[] nums) {
        int[] can =  new int[nums.length];
        int j = 0;
        for (int man: nums) {
            can[j] = man;
            j++;
        }
        Arrays.sort(can);
        int min = can[0];
        int max = can[nums.length - 1];
        int left = 0;
        int right = 0;
        boolean one = false;
        boolean two = false;
        for(int i = 0; i< nums.length ; i++) {
            if(nums[i] == min){
                left = Math.min( i, nums.length - i - 1) + 1;
                one = true;
            }
            if(nums[i] == max){
                right = Math.min( i, nums.length - i - 1) + 1;
                two = true;
            }
            if(one && two){
                return left + right;
            }
        }
        return left + right;
    }
}
