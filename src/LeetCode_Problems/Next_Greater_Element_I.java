package LeetCode_Problems;

import java.sql.Array;
import java.util.Arrays;

public class Next_Greater_Element_I {
    public static void main(String[] args) {
        int[] t1 = {1,3,5,2,4}; int[] t2 = {6,5,4,3,2,1,7};
        System.out.println(Arrays.toString(nextGreaterElement(t1,t2)));
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        int ans = -1;
        for(int i =0 ;i < nums1.length; i++){
            ans = helper(nums2 , nums1[i]);
            if(ans != -1){
                result[i] = ans;
            }
            else {
                result[i] = -1;
            }
        }
        return result;
    }
    private static int helper(int[] can , int target){
        for(int i = 0; i< can.length ; i++){
            if (can[i] == target){
                if(i == can.length - 1){
                    return -1;
                }
                else {
                    for (int j = i + 1; j < can.length ; j ++){
                        if(can[j] > can[i]){
                            return can[j];
                        }
                    }
                }
            }
        }
        return -1;

    }
}
