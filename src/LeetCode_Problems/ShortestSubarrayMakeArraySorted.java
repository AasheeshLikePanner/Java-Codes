package LeetCode_Problems;

import java.util.Stack;

public class ShortestSubarrayMakeArraySorted {
    public static void main(String[] args) {
        int[] test1 = {1,2,3,10,0,7,8,9};
        System.out.println(can(test1));
    }
    public static int can(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for(int num: arr){
            if(!stack.isEmpty() && (num == 0 && stack.peek() != 0)){
                continue;
            }
            while(!stack.isEmpty() && (stack.peek() > num )){
                stack.pop();
            }
            stack.push(num);
        }
        return arr.length - stack.size();
    }
}
