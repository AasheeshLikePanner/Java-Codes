package Contest;

import java.util.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MaximumPrefixScore {
    public static void main(String[] args) {
        int[] can  ={-687767,-860350,950296,52109,510127,545329,-291223,-966728,852403,828596,456730,-483632,-529386,356766,147293,572374,243605,931468,641668,494446};
        int[] can2 = {-2,-3,0};
        System.out.println(maxScore(can));
    }
//    static void reverseArray(int arr[]){
//        for (int start=0,end=arr.length-1;start<=end;start++,end--) {
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//        }
//    }
    public static int maxScore(int[] nums) {
            int max = 0;
            Arrays.sort(nums);
            prefix(nums);
            for (Long man:list ) {
                if(man >= 0){
                    max+=1;
                }
            }
            return max;
        }

        static List<Long> list =new ArrayList<>();
        private static void prefix(int[] nums){
            long sum =  0;
            for (int i = nums.length - 1; i >= 0 ; i--) {
                sum += nums[i];
                list.add(sum);
            }
    }
}
