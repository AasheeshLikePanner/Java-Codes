package LeetCode_Problems;

import java.util.Arrays;
import java.util.HashMap;

public class K_DiffParisInArray {
    public static void main(String[] args) {
        int[] test1 = {3,1,4,1,5};  // 2
        int[] test2 = {1,3,1,5,4};  // 0
        int[] test3 = {1,1,1,1};    // 0
        System.out.println(findPairs(test1, 2));
    }
    public static int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int index = 0;
        for(int num:nums){
            if(!map.containsKey(num)){
                boolean flag = isPresent(nums, num + k , index);
                if(flag){
                    count++;
                }
            }
            map.put(num , 1);
            index++;
        }
        return count;
    }

    static HashMap<Integer , Integer> map = new HashMap<>();

    private static boolean isPresent(int[] nums, int target , int index) {
        int start = index;
        int end =  nums.length - 1;
        while(start <= end){
            int mid = start +  (end - start) /2;
            if(nums[mid] == target && index != mid){
                return true;
            }
            if(nums[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
//        if(nums[start] == target && index != start){
//            return true;
//        }
        return false;
    }
}
