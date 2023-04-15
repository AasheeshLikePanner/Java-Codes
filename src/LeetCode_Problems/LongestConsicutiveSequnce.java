package LeetCode_Problems;

import java.util.HashMap;

public class LongestConsicutiveSequnce {
    public static void main(String[] args) {
        int[] arr1 = {100,4,200,1,3,2};
        int[] arr2 = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(arr2));
    }
    public static int longestConsecutive(int[] nums) {
        int max = 0;
        int count = 0;
        HashMap<Integer , Boolean> hash = new HashMap<>();
        for (int can: nums) {
            hash.put(can , true);
        }
        for (int can:nums) {
            if(!hash.containsKey(can - 1)){
                hash.put(can , false);
            }
        }
        for(int can: nums){
            if(hash.get(can)){
                int i = can;
                while(hash.containsKey(i)){
                    count++;
                    i++;
                }
                if(max<count) max = count;
                count= 0;
            }
        }return max + 1;
    }
}
