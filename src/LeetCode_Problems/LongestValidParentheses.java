package LeetCode_Problems;

import java.util.*;
public class LongestValidParentheses {
    public static void main(String[] args) {
        String s = "()(()";
        System.out.println(longestValidParentheses(s));
    }
    public static int longestValidParentheses(String s) {
        int count = 0;
        Stack<Character> stack = new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch == '(' && (!stack.isEmpty() && stack.peek() == '(')){
                count= 0;
            }
            if(ch == '('){
                stack.push(ch);

            }

            else {
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                    count+=2;
                }
            }
        }
        // return count - stack.size()*2;
        return count;
    }
}
