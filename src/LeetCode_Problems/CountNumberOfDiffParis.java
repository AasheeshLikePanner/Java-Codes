package LeetCode_Problems;

import java.util.Arrays;
import java.util.HashMap;

public class CountNumberOfDiffParis {
    public static void main(String[] args) {

    }
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        Arrays.sort(nums);
        int count = 0;
        int index = 0;
        for(int num:nums){
            if(!map.containsKey(num)){

                int numCount = Count(nums , num  +k);
                count += numCount;
                map.put(num , numCount);
            }
            else{
                 count += map.get(num);
            }
        }
        return count;
    }

    private int Count(int[] nums, int target) {
        int count = 0;
        for(int num: nums){
            if(num == target){
                count++;
            }
        }
        return count;
    }
}
