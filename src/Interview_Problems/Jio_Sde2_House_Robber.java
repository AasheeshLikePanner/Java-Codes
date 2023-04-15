package Interview_Problems;

import java.util.*;

public class Jio_Sde2_House_Robber {
    public static void main(String[] args) {
        int[] can = {2,7,9,3,1};
        int[] can2 = {3,2,5,4,5,10,2};
        int[] can3 = {1,2,3,1};
        int[] can4 = {1,2};
//        System.out.println(rob(can));
        System.out.println(rob(can2));
//        System.out.println(rob(can3));
//        System.out.println(rob(can4));
    }
    public static int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        helper( 0 , 0 , nums);
        int m = 0;
        for (int can:list) {
            if(can > m){
                m = can;
            }
        }
        return max;
    }
    static List<Integer> list= new ArrayList<>();
    static int max =0;
    private static void helper(int sum ,int index,int[] nums){
        if(index >= nums.length){
            if(max < sum){
                max = sum;
            }
            return;
        }
        helper(sum + nums[index] , index + 2 , nums);
        helper(sum , index + 1, nums);
    }
}
