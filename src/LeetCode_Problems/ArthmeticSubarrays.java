package LeetCode_Problems;

import java.util.*;
public class ArthmeticSubarrays {
    public static void main(String[] args) {
        int[] nums =
                {4,6,5,9,3,7},
        l =
                {0,0,2},
        r =
                {2,3,5};
        System.out.println(checkArithmeticSubarrays(nums,l,r));
    }
    public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> res = new ArrayList<>();
        for(int i = 0 ; i < l.length ; i++){
            List<Integer> list= new ArrayList<>();
            int start = l[i];
            int end = r[i];
            for(int j = start ; j <= end ; j++){
                list.add(nums[j]);
            }
            Collections.sort(list);
            int gap = list.get( 1 ) - list.get(0);
            boolean flag = true;
            for(int k = 1; k < list.size() -1; k++){
                if(gap !=( list.get( k + 1) - list.get(k))){
                    flag = false;
                    break;
                }
            }
            res.add( flag);

        }
        return res;
    }
}
