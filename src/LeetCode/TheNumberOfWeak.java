package LeetCode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class TheNumberOfWeak {
    public static void main(String[] args) {
        System.out.println(numberOfWeakCharacters(new int[][]{{1,3},{10,4},{4,3}}));
    }
    public static int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties,(a,b) ->  (a[0] == b[0]) ? Integer.compare(b[1], a[1]) : Integer.compare(a[0], b[0]));
        Stack<int[]> stack = new Stack<>();
        int count = 0;
        for(int[] prop : properties){
            if(stack.isEmpty()){
                stack.push(prop);
            }
            else if(stack.peek()[0] < prop[0] && stack.peek()[1] < prop[1]){
                while(!stack.isEmpty() && (stack.peek()[0] < prop[0] && stack.peek()[1] < prop[1])){
                    stack.pop();
                    count++;
                }
                stack.push(prop);
            }
            else{
                stack.push(prop);
            }
        }
        return count;
    }

}
