package problems;

import java.util.*;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] arr ={1,3,-1,-3,5,3,6,7};
        System.out.println(maxi(arr , 3));
    }
    private static List<Integer> maxi(int[] can , int k){
        int max = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;
        List<Integer> list = new ArrayList<>();
        while(j < can.length){
            if(j - i + 1 < k ){
                max = Math.max(max , can[j]);
                j++;
            }
            else if(j - i + 1 == k){
                list.add(max);
                max = Integer.MIN_VALUE;
                i++;
            }
        }
        return list;
    }
}
