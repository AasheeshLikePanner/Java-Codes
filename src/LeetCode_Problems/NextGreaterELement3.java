package LeetCode_Problems;

import java.util.Collections;
import java.util.PriorityQueue;

public class NextGreaterELement3 {
    public static void main(String[] args) {
        System.out.println(nextGreaterElement(101));
    }
    public static int nextGreaterElement(int n) {
        PriorityQueue<Integer> min = new PriorityQueue<>(Collections.reverseOrder());
        String s = Integer.toString(n);
        for(char ch : s.toCharArray()){
            min.offer(ch - '0');
        }
        int res = 0;
        while(!min.isEmpty()){
            res = res * 10 + min.poll();
        }
        if(res > n){
            return res;
        }
        return  -1;
    }
}
