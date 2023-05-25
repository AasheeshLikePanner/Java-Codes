package LeetCode_Problems;

import java.util.Arrays;

public class MaximumWeeks {
    public static void main(String[] args) {
//        int[] arr = {1,2,3};
        int[] arr = {9,3,6,8,2,1};
        System.out.println(numberOfWeeks(arr));
    }
    public static long numberOfWeeks(int[] nums) {
        int sum = 0;
        int i = nums.length - 2;
        int j = nums.length - 1;
        Arrays.sort(nums);
        while(true){
            if(i < 0){
                if(nums[j] != 0){
                    return sum + 1;
                }
                return sum;
            }
            else if(nums[i] == 0){
                i--;
            }
            else if(nums[j] != 0 && nums[i] != 0){
                nums[j] = nums[j] - 1;
                nums[i] = nums[i] -1;
                sum+=2;
            }
            if(nums[j] == 0){
                if(nums[i] != 0 ){
                    j = i;
                    i -= 1;
                }
            while(nums[j] == 0){
                j--;
                if(j == 0 && nums[j] == 0){
                    return sum;
                }
            }
            i = j - 1;
            }
        }
    }
    }
