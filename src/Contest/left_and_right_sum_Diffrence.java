package Contest;

import java.util.Arrays;

public class left_and_right_sum_Diffrence {
    public static void main(String[] args) {
        int[] can = {10,4,8,3};
        int[] test = {1};
        System.out.println(Arrays.toString(leftRigthDifference(test)));
    }
    public static int[] leftRigthDifference(int[] nums) {      // [10,4,8,3]      left -> 0,10,14,22   right -> 15,11,3,0
        int[] left = left(nums);
        int[] right = right(nums);
        int[] result = new int[nums.length];
        for(int i =0 ; i< nums.length; i++){
            result[i] = Math.abs(right[i] - left[i]);
        }
        return result;
    }
    private static int rsum(int[] can, int index) {     // [10,4,8,3]      left -> 0,10,14,22   right -> 15,11,3,0
        int sum = 0 ;
        for(int i = index + 1 ; i < can.length ; i++){
            sum+=can[i];
        }
        return sum;
    }

    private static int[] right(int[] nums) {
        int[] result = new int[nums.length];
        for(int i =0  ;i< nums.length ;i++){
            result[i] = rsum(nums,i);
        }
        result[nums.length - 1] = 0;
        return result;
    }
    private static int[] left(int[] can) {
        int[] result = new int[can.length];
        for(int i = 1 ; i < can.length; i++){
            result[i] = lsum(can , i);
        }
        result[0] = 0;
        return result;
    }

    private static int lsum(int[] can, int index) {
        int sum = 0;
        for(int i = index - 1; i >= 0 ; i--){
            sum += can[i];
        }
        return sum;
    }
}
