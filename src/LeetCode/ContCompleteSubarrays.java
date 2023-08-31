package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ContCompleteSubarrays {
    public static void main(String[] args) {
        System.out.println(countCompleteSubarrays(new int[]{5,5,5,5}));
    }

    public static int countCompleteSubarrays(int[] nums) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        for (int n : nums) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);

            } else {
                map.put(n, map.getOrDefault(n, 0) + 1);
            }
        }
        if(map.size() == 1){
            return len * (len + 1)/2;
        }
        HashMap<Long, Integer> copy = new HashMap<>();
        for( int i=0; i<len; i++ ){
            for( int j=i; j<len; j++ ){
                HashMap<Integer, Integer> d = new HashMap<>();
                long n = 0;
                for( int k=i; k<=j; k++ ){
                    d.put(nums[k], d.getOrDefault(nums[k], 0) + 1);
                    n = n * 10 + k;
                    if(d.size() == map.size()){
                        if(!copy.containsKey(n)){
                            copy.put(n ,1);
                            count++;
                        }
                    }
                }
                }
            }
        return count;
    }
}
