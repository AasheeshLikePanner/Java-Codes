package LeetCode;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
//        int[] arr= {1,2,3,4,5,6,7};
        int[] arr = {1,2};
        rotate(arr, 2);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int[] nums, int k) {
        k = nums.length - (k % nums.length);
        int j = 0;
        int[] arr = new int[nums.length];
        boolean flag = false;
        boolean round = false;
        for(int i = k; i <= nums.length; i++){
            if(i == nums.length){
                i = -1;
                round = true;
                continue;
            }
            if(!flag  && round){
                flag = true;
            }
            if(flag && i == k){
                break;
            }
            arr[j++] = nums[i];
        }
        j = 0;
        for(int num : arr){
            nums[j++] = num;
        }
    }
    }
