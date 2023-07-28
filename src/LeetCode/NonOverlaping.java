package LeetCode;

import java.util.*;
public class NonOverlaping {
    public static void main(String[] args) {
        System.out.println(eraseOverlapIntervals(new int[][]{{1,2},{2,3},{3,4},{1,3}}));
    }
        public static int eraseOverlapIntervals(int[][] intervals) {
            Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
            int prevend = intervals[0][1];
            int res = 0;
            for(int[] arr: intervals){
                 int start = arr[0];
                 int end = arr[1];
                if(start >= prevend){
                    prevend = end;
                }
                else{
                    res += 1;
                    prevend = Math.min(end , prevend);
                }
            }
            return prevend;
        }
}
