package LeetCode_Problems;

import java.util.Arrays;

public class Minimum_Size_Subarray_Sum {
    public static void main(String[] args) {
        int [] can = {2,16,14,15};
        int[] check1 = {12,28,83,4,25,26,25,2,25,25,25,12};
        int t2= 213;
        int target = 20;
        int result= minSubArrayLen(t2 , check1);
        System.out.println(result);
    }
    public static int minSubArrayLen(int target, int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int temp = 0;
        int count = 0;
        int can = 0;
        int n = nums.length - 1;
        for(int i = n; i >= 0 ; i-- ){
            target = target - nums[i];
            count++;
            if(target <= 0){
                return count;
            }
            else if(target <= nums[i]){
                can = binary(nums,target , i);
                if ((can != -1) && ((target - can) <= 0)) {
                    return count + 1;
                }
            }
        }
        if(target <= 0){
            return count;
        }
        return 0;
    }
    public static int binary(int[] arr, int target , int end){
        int start = 0;
        while(start < end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return arr[mid];
            }
            if(target > arr[mid]){
                start = start +1;
            }
            else{
                end = mid;
            }
        }
        return -1;
    }
}
