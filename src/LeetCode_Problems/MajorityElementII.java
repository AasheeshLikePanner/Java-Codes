package LeetCode_Problems;

import java.util.*;
public class MajorityElementII {
    public static void main(String[] args) {

    }
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer , Integer> hash = new HashMap<>();
        for(int can: nums){
            if(hash.containsKey(can)){
                int of = hash.get(can);
                int in = of + 1;
                hash.put(can , in);
            }
            else{
                hash.put(can , 0);
            }
        }
        int check = nums.length / 3;
        List<Integer> list = new ArrayList<>();
        for (int can:nums) {
            if(hash.get(can) >= check){
                list.add(can);
                hash.remove(can);
            }
        }
        return list;
    }
}
