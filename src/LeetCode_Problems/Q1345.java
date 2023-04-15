package LeetCode_Problems;

import java.util.ArrayList;
import java.util.List;

public class Q1345 {
    public static void main(String[] args) {
        int[] test1 = {100,-23,-23,404,100,23,23,23,3,404};
        int[] test2 = {7,6,9,6,9,6,9,7};
        int[] test3 = {6,1,9};
        int[]test4 = {0,4,3,9};
        System.out.println(minJumps(test1));
    }
    public static int minJumps(int[] arr) {
        if(arr.length == 1){
            return 0;
        }
        helper(0 , arr.length - 1, arr);
        return count;
    }
    static int count = Integer.MAX_VALUE;
    static int temp = 0;
    static boolean flag = true;
    private static void helper(int start , int end, int[] can){
        if(start == 0 && !flag){
            flag = true;
            return;
        }
        while(start < end){
            if(start == can.length - 1){
                count = temp;
                return;
            }
            if(can[start] == can[end]) {
                start = end;
                end = can.length - 1;
                temp++;
            }
            else {
                end--;
            }
        }
        if(start > can.length - 1 || start < 0){
            return;
        }
        if(start == can.length - 1){
            if(count > temp){
                count = temp;
                return;
            }
            else{
                return;
            }
        }
        if(start == can.length - 2){
            temp+=1;
            if(count > temp){
                count = temp;
            }
            return;
        }
        if(start < can.length - 1){
            temp++;
            flag = true;
            helper(start + 1, can.length - 1, can);
        }
        if( start > 0){
            temp++;
            flag = false;
            helper(start -1 , can.length - 1, can);
        }
    }
}
