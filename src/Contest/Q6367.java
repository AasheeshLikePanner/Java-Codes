package Contest;

import java.sql.Array;
import java.util.Arrays;

public class Q6367 {
    public static void main(String[] args) {
        int[] can1 = {3,5,2,4};
//        int[] can2 = {9,2,5,4};
//        int[] can3 = {1,78,27,48,14,86,79,68,77,20,57,21,18,67,5,51,70,85,47,56,22,79,41,8,39,81,59,74,14,45,49,15,10,28,16,77,22,65,8,36,79,94,44,80,72,8,96,78,39,92,69,55,9,44,26,76,40,77,16,69,40,64,12,48,66,7,59,10};
        System.out.println(maxNumOfMarkedIndices(can1));
    }
    public static int maxNumOfMarkedIndices(int[] nums) {   // 3 , 5 ,  2 , 4
        int count = 0;
        int binary = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            binary = helper(nums, i + 1 , (nums[i]*2));
            if(binary != -1){
                count +=2;
            }
        }
        return count;
    }

    private static int helper(int[] nums, int index, int target) {
        int ans = -1;
        int start = index;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(start == end){
                if(nums[start] >= target){
                    ans = start;
                    return ans;
                }
                else{
                    return ans;
                }
            }
            if(nums[mid] >= target){
                ans = mid;
                end = mid - 1;
            }
            else{
                start = mid+ 1;
            }
        }
        return ans;
    }
}
