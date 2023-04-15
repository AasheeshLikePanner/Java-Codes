package LeetCode_Problems;

import java.util.Stack;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] can = {3,2,1};
        int[] can1 = {5,2,2};
        System.out.println(thirdMax(can1));
    }
    public static int thirdMax(int[] nums) {
        int distinct = 0;
        int max = 0;
        Stack<Integer> stack = new Stack<>();
        for(int can : nums){
            if(distinct >= 3){
                stack.push(can);
                return stack.peek();
            }
            if(!stack.isEmpty() && (stack.peek() == can)){
                continue;
            }
            else{
                if(max < can) max = can;
                stack.push(can);
                distinct++;
            }
        }
        if(distinct >= 3){
            return stack.peek();
        }
        return max;
    }
}
