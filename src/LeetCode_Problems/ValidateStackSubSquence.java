package LeetCode_Problems;

import java.util.Stack;

public class ValidateStackSubSquence {
    public static void main(String[] args) {
        int[] pushed = {1,2,3,4,5}, popped = {4,5,3,2,1};
        System.out.println(can(pushed, popped));
    }
    public static boolean can(int[] pushed, int[] popped) {
        int j = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i =0 ; i< pushed.length; i++){
            stack.push(pushed[i]);
            if(stack.peek() == popped[j]){
                while((!stack.isEmpty() && j < popped.length) && (stack.peek() == popped[j])){
                    stack.pop();
                    j++;
                }
            }
        }
        return stack.isEmpty();
    }
}
