package LeetCode_Problems;

import java.util.ArrayList;
import java.util.List;

public class Jump_Game_II {
    public static void main(String[] args) {
        int[] num1 = {2,3,1,1,4};
        int[] num2 = {2,3,0,1,4};
        int[] num3 = {2,2,0,2,0,3,5};
        int[] num4 = {4,1,1,3,1,1,1};
        int[] num5 = {1,2,3};
        int[] num6 ={1,1,1,2,1};
        int can = jump(num5);
        System.out.println(can);
    }
    static List<Integer> list= new ArrayList<>();
    public static int jump(int[] nums) {
        int m = Integer.MAX_VALUE;
        helper(nums,0,nums[0],nums[0]);
        for (Integer num : list) {
            if (m > num) {
                m = num;
            }
        }
        return m;
    }
    public static void helper(int[] matrix, int count ,int index , int val){
        if(index < 0 ){
            return;
        }
        if(index >= matrix.length - 1){
            list.add(count);
            return;
        }
        int sum = (( matrix.length - 1) -( matrix[index] + 1));
        if(count != 0 && (matrix[index] > sum)){
            count++;
            list.add(count);
            return;
        }
        else if(val > 0){
            helper(matrix , count +1, index - 1, val - 1);
            helper(matrix , count +1,index +  matrix[index], matrix[index]);
        }
        else {
            return;
        }
    }
//    public static void helper(int[] matrix, int count ,int index , int val){
//        if(index >= matrix.length - 1){
//            list.add(count);
//            return;
//        }
//        if(matrix[index] >= (( matrix.length - 1) - index + 1)){
//            count++;
//            list.add(count);
//            return;
//        }
//        else if(val > 0 && matrix[index] != 0){
//            helper(matrix , count +1,index + 1, val - 1);
//            helper(matrix , count +1,index + matrix[index], matrix[index]);
//        }
//        else {
//            return;
//        }
//    }
}
