package LeetCode;

import java.util.HashMap;

public class BinarySubarrayWithSum {
    public static void main(String[] args) {
        System.out.println(numSubarraysWithSum(new int[]{1,0,1,0,1}, 2));
    }
    public static int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(nums[0], 1);
        int count = 0;
        for(int i = 1; i < nums.length; i++){
            nums[i] = nums[i] + nums[i - 1];
            if(map.containsKey(nums[i] - goal)){
                count += map.get(nums[i] - goal);
            }
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }


        return count;
    }
}
