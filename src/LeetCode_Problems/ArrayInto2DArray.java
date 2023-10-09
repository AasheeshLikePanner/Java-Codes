package LeetCode_Problems;

import java.util.*;
public class ArrayInto2DArray {
    public static void main(String[] args) {
        int[] nums = {1,3,4,1,2,3,1};
        System.out.println(findMatrix(nums));
        System.out.println("This is change");
    }
    public static List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        for(int can: nums){
            arr.add(can);
        }
        boolean flag = true;
        int index = 0;
        int start = 0;
        for(int i = 0 ; i < nums.length ; ){
            if(arr.size() == 0){
                break;
            }
            List<Integer> inner = new ArrayList<>();
            List<Integer> test = new ArrayList<>();
            for(int can:arr){
                if(!inner.contains(can)){
                    inner.add(can);
                }
                else if(inner.contains(can)){
                    test.add(can);
                }
            }
            arr =test;
            outer.add(inner);
        }
        return outer;
    }
}
