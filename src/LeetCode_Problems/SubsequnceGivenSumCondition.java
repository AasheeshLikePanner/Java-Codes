package LeetCode_Problems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SubsequnceGivenSumCondition {
    public static void main(String[] args) {
        int[] arr = {2,3,3,4,6,7};
        System.out.println(numSubseq(arr,9));
    }
    public static int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int count = 0;
        int mod = (int)1e9 + 7;
        for(int i = 0 ; i < nums.length; i++){
            int j = binary(nums, i , nums.length - 1, target - nums[i]);
            int sum = (count + (int)Math.pow(2, j - i) );
            count = sum % mod;
        }
        return count;
    }
    public static int binary(int[] nums, int start , int end , int target){
        int ans = 0;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] > target){
                end = mid - 1;
            }
            else{
                ans = mid;
                start = mid + 1;
            }
        }
        return ans;
    }
}
