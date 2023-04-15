package LeetCode_Problems;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingMaximumWindow {
    public static void main(String[] args) {
        int[] can = {1,3,-1,-3,5,3,6,7};
        System.out.println(maxSlidingWindow(can  , 3));
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int i =0 ;
        int j = 0;
        int[] ans = new int[nums.length - k + 1];
        Deque<Integer> deque = new LinkedList<>();
        while(j < nums.length){
            int num = nums[j];
            if(deque.size()  == 0){
                deque.add(num);
            }
            else{
                while(deque.size() > 0 && num > deque.peekLast() ){
                    deque.removeLast();
                }
                deque.add(num);
            }
            if(j - i + 1 < k){
                j++;
            }
            else if(j - i + 1 == k){
                ans[i] = nums[i];
                if(nums[i] == deque.peek()){
                    deque.removeFirst();
                }

                i++;
                j++;
            }
        }
        return ans;
    }
}
