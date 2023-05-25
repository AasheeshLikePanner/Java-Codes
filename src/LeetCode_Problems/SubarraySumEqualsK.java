package LeetCode_Problems;

import java.util.HashMap;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        int[] arr1 = {1,2,3};
        int[] arr3 = {-1,-1,1};
        System.out.println(man(arr3 , 0));
//        System.out.println(man(arr1 , 3));
//        System.out.println(man(arr ,2));
    }
    public static int man(int[] nums, int k) {
        int  i = 0;
        int j = 0;
        int count = 0;
        int sum = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        while( j < nums.length){
            if(!map.containsKey(j)){
                sum += nums[j];
                map.put(j , 1);
            }
            if(sum < k ){
                j++;
            }
            else if(sum > k ){
                sum -= nums[i];
                i++;
            }
            else if( sum == k){
                count++;
                sum -= nums[i];
                i++;
                j++;
            }
        }
        return count;
    }
}
