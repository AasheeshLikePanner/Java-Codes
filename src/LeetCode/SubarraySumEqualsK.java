package LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1,2,1,2,1}, 3));
        System.out.println(subarraySum(new int[]{1,1,1},2));
    }
    public static int subarraySum(int[] nums, int k) {
        int count  = 0;
        int[] pre = new int[nums.length];
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i  < nums.length; i++){
            pre[i] = sum + nums[i];
            sum += nums[i];
            set.add(sum);
        }
        for(int i = nums.length - 1 ; i >= 0 ; i--){
            if(set.contains( pre[i] - k )){
                count++;
            } else if (k - pre[i] == 0) {
                count++;
            }
        }
        return count;
    }
}
