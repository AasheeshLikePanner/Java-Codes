package LeetCode_Problems;

import java.util.Arrays;

public class KradiusSubarray {
    public static void main(String[] args) {
        int[] arr = {7,4,3,9,1,8,5,2,6};
        int k = 3;
        System.out.println(Arrays.toString(getAverages(arr ,k )));
    }
    public static int[] getAverages(int[] nums, int k) {
        int i = 0;
        int j = 0;
        long sum =0;
        int[] result = new int[nums.length];
        int index = k;
//        for(int l =0 ; l < nums.length ; l++){
//            result[l] = -1;
//        }
        Arrays.fill(result , - 1);
        while(j < nums.length){
            sum += nums[j];
            if(j - i + 1 < k * 2 + 1){
                j++;
            }
            else if( j -i + 1 == k *2 + 1){
                long ans = sum / (k *2 + 1);
                result[index] = (int) (ans);
                sum-=nums[i];
                i++;
                j++;
                index++;
            }
        }
        return result;
    }
}
