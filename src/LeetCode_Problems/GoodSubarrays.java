package LeetCode_Problems;

import java.util.HashMap;

public class GoodSubarrays {

    public static void main(String[] args) {

    }
    public long countGood(int[] nums, int k) {
        int start =0 ;
        int end = 0;
        int ans = 0;
        int count =0 ;
        HashMap<Integer , Integer> map = new HashMap<>();
        while(start < nums.length){
            if(map.containsKey(nums[end])){
                map.put(nums[end], map.get(nums[end]) * 2);
            }
            else {
                map.put(nums[end], 1);
            }
            if(count == k){

            }
            if(end == nums.length - 1){
                start++;
                end = start;
            }
        }
        return ans;
    }
}
