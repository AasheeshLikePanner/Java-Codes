package LeetCode_Problems;

import java.util.Arrays;

public class Find_Right_Interval {
    public static void main(String[] args) {
        int[][] man = {{3,4},{2,3},{1,2}};
        int[] can = findRightInterval(man);
        System.out.println(Arrays.toString(can));
    }
    public static int[] findRightInterval(int[][] intervals) {
        int[] result = new int[intervals.length];
        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];
        int[] copy = new int[intervals.length];
        for(int i =0 ; i < intervals.length ; i ++  ){
            start[i] = intervals[i][0];
            end[i]  = intervals[i][1];
            copy[i] = intervals[i][0];
        }
        Arrays.sort(start);
        for(int i = 0 ; i< intervals.length ; i++){
            int ans = helper(start , end[i]);
            if(ans == -1){
                result[i] = -1;
            }
            else{
                for(int j =0 ; j < copy.length ; j++){
                    if(start[ans] == copy[j]){
                        result[i] = j;
                        break;
                    }
                }
            }
        }
        return result;
    }

    private static int binary(int[] copy, int ans) {
        int start = 0;
        int end = copy.length;
        while(start < end ){
            int mid = start +(end - start)/2;
            if(copy[mid] > ans){
                end = ans;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }

    private static int helper(int[] can, int target) {
        int ans = - 1;
        int start = 0;
        int end = can.length;
        while(start < end){
            int mid = start + (end - start)/2;
            if(can[mid] >= target){
                ans = mid;
                end = mid;
            }
            else{
             start = mid+1;
            }
        }
        return ans;
    }
}
