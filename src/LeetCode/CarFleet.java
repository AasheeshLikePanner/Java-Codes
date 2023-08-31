package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class CarFleet {
    public static void main(String[] args) {
//        System.out.println(carFleet(12,new int[]{10,8,0,5,3},  new int[]{2,4,1,1,3}));
//        System.out.println(carFleet(10,new int[]{6,8},  new int[]{3,2}));
//        System.out.println(carFleet(10,new int[]{0,4,2},  new int[]{2,1,3}));
        System.out.println(carFleet(20,new int[]{11,14,13,6},  new int[]{2,2,6,7}));
    }
    public static int carFleet(int target, int[] position, int[] speed) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < position.length; i++){
            map.put(position[i], speed[i]);
        }
        Arrays.sort((position));
        Stack<pair> stack = new Stack<>();
        for(int n:position){
            int s = map.get(n);
            while (!stack.isEmpty() && validate(stack.peek(), n, map.get(n), target)) {
                s = Math.min(s, stack.pop().speed);
            }
                stack.push(new pair(n, s));
        }
        return stack.size();
    }

    private static boolean validate(pair stack, int n, int num, int target) {
        int pos = stack.pos;
        int sp = stack.speed;
        while(target >= pos){
            if(pos == n){
                return true;
            }
            pos += sp;
            n += num;
        }
        return false;
    }

    static class pair{
        int speed;
        int pos;
        pair(int pos,int speed){
            this.speed = speed;
            this.pos = pos;
        }
    }
}
