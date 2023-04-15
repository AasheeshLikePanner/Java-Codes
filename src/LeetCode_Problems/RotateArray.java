package LeetCode_Problems;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] cans=  {1,2,3,4,5,6,7};
        int[] can1 = {1,2};
       rotate(cans,3);
        System.out.println(Arrays.toString(can1));
    }
    public static void rotate(int[] nums, int k) {
        int one = 0;
        int i =0 ;
        int j = Math.abs(nums.length - k);
        int[] can = new int[nums.length];
        int n = j - 1;
        int two = j - 1;
        while(i < n || j < nums.length){
            if(i < n){
                can[two] = nums[i];
                i++;
                two++;
            }
            if(j < nums.length){
                can[one] = nums[j];
                j++;
                one++;
            }
        }
        i = 0;
        for(int man: can){
            nums[i] = man;
            i++;
        }

    }
}
