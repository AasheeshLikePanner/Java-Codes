package LeetCode_Problems;

import java.util.Stack;

public class Daiytemperaures {
    public static void main(String[] args) {
        int[] arr = {89,62,70,58,47,47,46,76,100,70};
        System.out.println(dailyTemperatures(arr));
    }
    public static int[] dailyTemperatures(int[] can) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> copy = new Stack<>();
        int[] result = new int[can.length];
        for(int i = can.length - 1 ; i >= 0 ; i--){
            while(!stack.isEmpty() && can[stack.peek()] < can[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                result[i] = stack.peek() - i;
            }

            stack.push(i);
        }
        return result;
    }
}
