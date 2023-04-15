package LeetCode_Problems;

import java.util.Stack;

public class Trapping_Water {
    public static void main(String[] args) {
        int[] can = {4,2,0,3,2,5};
        int[] can2 = {0,1,0,2,1,0,1,3,2,1,2,1};
        int[] can3 = {5,4,1,2};
        int[] can4 = {9,6,8,8,5,6,3};
        System.out.println(trap(can4));
//        System.out.println(trap(can3));
//        System.out.println(trap(can2));
//        System.out.println(trap(can));

    }
    public static int trap(int[] height) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int result = 0;
        for(int i = 1 ; i < height.length ; i++){
            if(!stack.isEmpty() && (height[stack.peek()] <= height[i])){
                int water = store(height , stack.peek() , i);
                result += water;
                stack.pop();
                stack.push(i);
            }
        }
        int n = height.length - 1;
        for(int i = n ; i > stack.peek() ; i--){
            if(height[i] > height[i - 1]){
                n = i;
                break;
            }
        }
        if(!stack.isEmpty() && stack.peek() != n){
            int water = Math.abs(height[n]* (stack.peek() - (n - 1)));
                for(int j = stack.peek() + 1 ; j < n  ; j++){
                    if(height[n] >= height[j]){
                        water -= height[j];
                    }
                    else{
                        water -= height[n];
                    }
            }
            result += water;
        }
        return result;
    }

    private static int store(int[] height, int peek, int i) {
        int result = Math.abs(height[peek] * (peek - (i - 1)));
        for(int j = peek + 1 ; j < i ; j++){
            result -= height[j];
        }
        return result;
    }
}
