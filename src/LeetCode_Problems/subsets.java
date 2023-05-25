package LeetCode_Problems;

import java.util.*;
public class subsets {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(subsets(arr));
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        genrate(0 , nums, new ArrayList<Integer>() , outer);
        return outer;
    }

    private static void genrate(int start, int[] nums, List<Integer> inner, List<List<Integer>> outer) {
        if(start == nums.length){
            return;
        }
        for(int i = start; i < nums.length; i++){
            inner.add(nums[i]);
            outer.add(new ArrayList<>(inner));
            genrate(start + 1, nums ,inner, outer );
            inner.remove(inner.size() - 1);
        }

    }

}
