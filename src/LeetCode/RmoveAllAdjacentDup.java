package LeetCode;

import java.util.HashMap;
import java.util.Stack;

public class RmoveAllAdjacentDup {
    public  void main(String[] args) {
        System.out.println(removeDuplicates("deeedbbcccbdaa", 3));
    }
    public String removeDuplicates(String s, int k) {
        Stack<pair> stack = new Stack<>();
        StringBuilder res = new StringBuilder();

        for(char ch: s.toCharArray()){
            if(!stack.isEmpty() && stack.peek().ch == ch){
                int val  =stack.peek().num;
                stack.pop();
                stack.push(new pair(ch, val + 1));
            }
            else{
                stack.push(new pair(ch, 1));
            }
            if(stack.peek().num == k){
                stack.pop();
            }
        }
        while(!stack.isEmpty()){
            while(stack.peek().num-- > 0){
                res.append(stack.pop());
            }
        }
        return res.reverse().toString();
    }
    class pair{
        char ch;
        int num;
        pair(char ch, int num){
            this.ch = ch;
            this.num = num;
        }
    }
}
