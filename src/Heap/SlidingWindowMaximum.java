package Heap;

import java.util.*;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] can1 = {1,3,-1,-3,5,3,6,7};
        int[] can2 = {9,11};
        System.out.println(Arrays.toString(max(can2 , 2)));
    }
    public static int[] max(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        PriorityQueue<Integer> max= new PriorityQueue<>(Collections.reverseOrder());
        int j = 0;
        int i = 0;
        int index = 0;
        while(j < nums.length){
            max.add(nums[j]);
            if(j - i + 1 < k){
                j++;
            }
            else if(j - i + 1 == k){
                result[index++] = max.peek();
                if(nums[i] == max.peek()){
                    max.poll();
                }
                else{
                    max.remove(nums[i]);
                }
                i++;
                j++;
            }
        }
//        int[] arr= new int[list.size()];
//        i= 0;
//        for(int can:list){
//            arr[i] = can;
//                    i++;
//        }
        return result;
    }
}
