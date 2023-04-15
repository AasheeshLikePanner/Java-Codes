package LeetCode_Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection_Of_two_Arrays {
    public static void main(String[] args) {
        int[] test1 = {4,7,9,7,6,7};
        int[] test2 = {5,0,0,6,1,6,2,2,4};
        int[] can = intersection(test1 , test2);
        System.out.println(Arrays.toString(can));
    }
    static List<Integer> list = new ArrayList<>();
    public static int[] intersection(int[] nums1, int[] nums2) {
        int end = nums1.length;
        Arrays.sort(nums2);
        for(int i = 0 ; i< end ; i++ ){
            if(search(nums2 , nums1[i])){
                if(!list.contains(nums1[i])){
                    list.add(nums1[i]);
                }
            }
        }
        int i = 0;
        int[] arr= new int[list.size()];
        for(int can:list){
            arr[i] = can;
            i++;
        }
        return arr;
    }
    public static boolean search(int[] nums,int target){
        int start = 0;
        int end = nums.length;
        while(start < end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return true;
            }
            if(nums[mid] > target){
                end = mid;
            }
            else{
                start = mid +1;
            }
        }
        return false;
    }
}
