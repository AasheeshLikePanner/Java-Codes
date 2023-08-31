package LeetCode;

import java.util.HashMap;

public class RemoveMinAndMaxFromArray {
    public static void main(String[] args) {
        System.out.println(minimumDeletions(new int[]{101}));
        System.out.println(minimumDeletions(new int[]{0,-4,19,1,8,-2,-3,5}));
        System.out.println(minimumDeletions(new int[]{2,10,7,5,4,1,8,6}));
        System.out.println(minimumDeletions(new int[]{0,1,-3,5,2,4}));
    }
    public static int minimumDeletions(int[] nums) {
        if(nums.length == 1)    return 1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0 ; i < nums.length; i++){
            map.put(nums[i], i + 1);
            min = Math.min(nums[i], min );
            max = Math.max(nums[i], max);
        }
        boolean flag1 = false;
        boolean flag2 = false;
        int one = (nums.length - map.get(min)) + 1;
        int two = map.get(min);
        int val1 = 0;
        if(one < two){
            val1 = one;
            flag1 = true;
        }
        else{
            val1 = two;
        }
        one = (nums.length - map.get(max)) + 1;
        two = map.get(max);
        int val2 = 0;

        if(one < two){
            val2 = one;
            flag2 = true;
        }
        else{
            val2 = two;
        }
        if(flag1 == flag2){
            return val2 + val1 - 2;
        }
        if(nums.length % 2 == 0){
            if(map.get(max) - 1 == nums.length / 2){
                if((map.get(max) - 2 == map.get(min) - 1)){
                    return val2 + val1 - 2;
                }
            }
            else if((map.get(min) - 1 == nums.length / 2)){
                if(map.get(min) - 2 == map.get(max - 1)){
                    return val2 + val1 - 2;
                }
            }
        }
        return val2 + val1;
    }
}
