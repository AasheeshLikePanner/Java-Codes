package LeetCode_Problems;

import java.util.*;
public class MajorityElement {
    public static void main(String[] args) {

    }
    public int majorityElement(int[] nums) {
        HashMap<Integer , Integer> hash = new HashMap<>();
        for(int can:nums){
            if(hash.containsKey(can)){
                int of = hash.get(can);
                int in = of + 1;
                hash.put(can , in);
            }
            else{
                hash.put(can , 1);
            }
        }
        int max = 0;
        for (int can:nums) {
            if(hash.get(can) > max){
                max= hash.get(can);

            }
        }
        return max;
    }
}
