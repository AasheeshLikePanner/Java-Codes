package LeetCode_Problems;

import java.util.Collections;
import java.util.PriorityQueue;

public class lastStoneWeight {
    public static void main(String[] args) {

    }
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        int ans = 0;
        for(int num: stones){
            max.offer(num);
        }
        while(max.size() > 1){
            int one  = max.poll();
            int two = max.poll();
            if(one != two){
                max.offer(one - two);
            }
        }
        return max.poll();
    }
}
