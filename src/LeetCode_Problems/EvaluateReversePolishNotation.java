package LeetCode_Problems;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        String[] test1 = {"2","1","+","3","*"};
        String[] test2 = {"4","13","5","/","+"};
        System.out.println(evalRPN(test2));
    }
    public static int evalRPN(String[] tokens) {
        int ans = 0;
        int i =0 ;
        int one = 0;
        int two = 0;
        Stack<Integer> stack = new Stack<>();
        while(i < tokens.length){
            switch (tokens[i]) {
                case "+" -> {
                    one = stack.pop();
                    two = stack.pop();
                    stack.push(one + two);
                    i++;
                }
                case "*" -> {
                    one = stack.pop();
                    two = stack.pop();
                    stack.push(one * two);
                    i++;
                }
                case "/" -> {
                    one = stack.pop();
                    two = stack.pop();
                    stack.push(two / one);
                    i++;
                }
                case "-" -> {
                    one = stack.pop();
                    two = stack.pop();
                    stack.push(one - two);
                    i++;
                }
                default -> {
                    stack.push(Integer.parseInt(tokens[i]));
                    i++;
                }
            }

        }
        return stack.pop();
    }
}
