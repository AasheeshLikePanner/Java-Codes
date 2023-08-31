package LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class CarPooling {
    public static void main(String[] args) {
        System.out.println(carPooling(new int[][]{{9,3,6},{8,1,7},{6,6,8},{8,4,9},{4,2,9}},28));
    }
    public static boolean carPooling(int[][] trips, int capacity) {
        Arrays.sort(trips, (a ,b) -> a[1] - b[1]);
        int sum = 0;
        int prev = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int[] trip: trips){
            if(prev != - 1 && prev > trip[1]){
                if(map.containsKey(trip[1])){

                }
                if(sum + trip[0] > capacity){
                    return false;
                }
                sum += trip[0];
                if(prev < trip[2]){
                    prev = trip[2];
                }
                map.put(trip[2] , trip[0]);
            }
            else if(prev != -1){
                sum = trip[0];
                if(sum > capacity){
                    return false;
                }
                if(prev < trip[2]){
                    prev = trip[2];
                }
                map.put(trip[2] , trip[0]);
            }
            else{
                prev = trip[2];
                sum += trip[0];
                if(sum > capacity){
                    return false;
                }
                map.put(trip[2] , trip[0]);
            }
        }
        return true;
    }
}
