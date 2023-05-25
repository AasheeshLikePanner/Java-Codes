package LeetCode_Problems;

import java.util.*;
import java.util.Arrays;
import java.util.HashMap;

public class DiffernceArrays {
    public static void main(String[] args) {

    }
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list = new ArrayList<>();
        HashMap<Integer , Integer> one = new HashMap<>();
        HashMap<Integer,  Integer> two = new HashMap<>();
        int m = Math.max(nums1.length, nums2.length);
        for(int i =0 ; i < m ; i++) {
            if (i < nums1.length){
                one.put(nums1[i], 1);
            }
            if(i < nums2.length){
                two.put(nums2[i], 1);
            }
        }
        List<Integer> in1 = new ArrayList<>();
        for(int can:one.keySet()){
            if(!two.containsKey(can)){
                in1.add(can);
            }
        }
        list.add(in1);
        List<Integer> in2 = new ArrayList<>();
        for(int can:two.keySet()){
            if(!one.containsKey(can)){
                in2.add(can);
            }
        }
        list.add(in2);
        return list;
    }
}
