package Contest;

import java.util.*;

public class SlidingSubarrayBeauty {
    public static void main(String[] args) {
        int[] aar = {1,-1,-3,-2,3};
        int  k  = 3;
        int n  =2;
        System.out.println(Arrays.toString(getSubarrayBeauty(aar ,  k ,n)));
    }

    public static int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int[] arr = new int[nums.length - k + 1];
        int i = 0;
        int j = 0;
        int m = 0;
        Deque<Integer> stack = new LinkedList<>();
        while(j < nums.length){
            if(!stack.isEmpty() &&  stack.peekFirst() > nums[j]){
                while ( !stack.isEmpty() && stack.peek() > nums[j]){
                    stack.pop();
                }
                stack.push(nums[j]);
            }
            else{
                stack.push(nums[j]);
            }
            if(j - i + 1 < k){
                j++;
            }
            else if(j - i + 1 == k){
                Stack<Integer> copy = new Stack<>();
                int count = x - 1;
                while(count  != 0){
                    copy.push(stack.peek());
                }
                if( !stack.isEmpty()&& stack.peekFirst() == nums[i]){
                    stack.pollLast();
                }
                i++;
                j++;
                m++;
            }
        }
        return arr;
    }
}
